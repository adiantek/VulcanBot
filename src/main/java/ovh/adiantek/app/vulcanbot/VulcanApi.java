package ovh.adiantek.app.vulcanbot;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

import com.google.gson.Gson;

import ovh.adiantek.app.vulcanbot.api.BaseRequest;
import ovh.adiantek.app.vulcanbot.api.req.CertyfikatRequest;

public class VulcanApi {

	private static final char[] PASSWORD = "CE75EA598C7743AD9B0B7328DED85B06".toCharArray();
	private static final String DEFAULT_REST_ENDPOINT = "Uczen.v3.UczenStart";
	private static final String STARTED_REST_ENDPOINT = "Uczen.v3.Uczen";

	private Gson gson = new Gson();
	public String symbol;
	public String oddzial;
	public boolean start = true;
	private Certificate cert;
	private byte[] decodedPfx;
	private PrivateKey privateKey;

	private String signContent(byte[] content) throws IOException, GeneralSecurityException {
		Signature sign = Signature.getInstance("SHA1withRSA");
		sign.initSign(privateKey);
		sign.update(content);
		return Base64.getEncoder().encodeToString(sign.sign());
	}

	public void loadCertificate(Certificate cert) throws GeneralSecurityException, IOException {
		this.cert = cert;
		this.decodedPfx = Base64.getDecoder().decode(this.cert.CertyfikatPfx);
		KeyStore key = KeyStore.getInstance("pkcs12");
		key.load(new ByteArrayInputStream(decodedPfx), PASSWORD);
		privateKey = (PrivateKey) key.getKey("LoginCert", PASSWORD);
	}

	@SuppressWarnings("unchecked")
	public <T> T doRequest(BaseRequest<T> req) {
		try {
			// System.out.println("request: " + new Gson().toJson(req));
			byte[] request = gson.toJson(req).getBytes(StandardCharsets.UTF_8);
			URL u = null;
			if (oddzial != null) {
				u = new URL("https://lekcjaplus.vulcan.net.pl/" + symbol + "/" + oddzial + "/mobile-api/"
						+ (start ? DEFAULT_REST_ENDPOINT : STARTED_REST_ENDPOINT) + "/" + req.getPath());
			} else {
				u = new URL("https://lekcjaplus.vulcan.net.pl/" + symbol + "/mobile-api/"
						+ (start ? DEFAULT_REST_ENDPOINT : STARTED_REST_ENDPOINT) + "/" + req.getPath());
			}
			System.out.println(u);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setRequestProperty("User-Agent", Utils.VULCAN_UA);
			if (req.getClass() == CertyfikatRequest.class)
				conn.setRequestProperty("RequestMobileType", "RegisterDevice");
			else if (cert != null) {
				conn.setRequestProperty("RequestCertificateKey", cert.CertyfikatKlucz);
				conn.setRequestProperty("RequestSignatureValue", signContent(request));
			}
			conn.setRequestProperty("Content-Length", Integer.toString(request.length));
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);

			OutputStream os = conn.getOutputStream();
			os.write(request);
			os.flush();
			InputStream is = null;
			try {
				is = conn.getInputStream();
			} catch (IOException ex) {
				is = conn.getErrorStream();
			}

			// System.out.println("response len: " + baos.size());
//			try {
//				JsonParser parser = new JsonParser();
//				JsonObject json = parser.parse(new String(baos.toByteArray(), StandardCharsets.UTF_8))
//						.getAsJsonObject();
//				Gson gson = new GsonBuilder().setPrettyPrinting().create();
//				String prettyJson = gson.toJson(json);
//				if (prettyJson.length() > 1000)
//					prettyJson = prettyJson.substring(0, 1000);
				// System.out.println("response: " + prettyJson);
//			} catch (Throwable t) {
				// System.out.println("response: " + new
				// String(baos.toByteArray(), StandardCharsets.UTF_8));
//			}
			return (T) gson.fromJson(Utils.readFully(is), req.getResponseClass());
		} catch (Throwable t) {
			t.printStackTrace();
			return null;
		}
	}
}

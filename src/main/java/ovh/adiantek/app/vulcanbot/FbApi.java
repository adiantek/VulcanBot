package ovh.adiantek.app.vulcanbot;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

public class FbApi {

	private static final Logger L = Logger.getLogger(FbApi.class.getSimpleName());
	private String cookies;
	private final Gson gson = new Gson();
	private final String threadId;
	private String fbDtsg;
	private long lastRequest;

	public FbApi(String cookies, String threadId) throws IOException {
		this.cookies = cookies;
		this.threadId = threadId;
		reloadFbDtsg();
	}

	public Integer sendMessage(String message, String... accounts) throws IOException {
		reloadFbDtsg();
		FbError err = null;
		for (int i = 0; i < 2; i++) {
			String resp = sendMessage(cookies, threadId, fbDtsg, message, accounts);
			if (resp.startsWith("for (;;);")) {
				resp = resp.substring(9);
			}
			err = gson.fromJson(resp, FbError.class);
			if (err.error != null && err.error == 1357004) {
				this.lastRequest = 0;
				reloadFbDtsg();
			} else {
				break;
			}
		}
		if (err.error != null) {
			L.warning("Cannot send message: " + err);
		}
		return err.error;
	}

	private void reloadFbDtsg() throws IOException {
		if (System.currentTimeMillis() - this.lastRequest < TimeUnit.HOURS.toMillis(24))
			return;
		this.lastRequest = System.currentTimeMillis();
		this.fbDtsg = getFbDtsg(cookies);
	}

	private static String getFbDtsg(String cookies) throws IOException {
		String mainPage = Utils.download(Utils.FB_UA, cookies, "https://www.facebook.com/");
		Matcher m = Pattern.compile("\\{\"token\":\"([^\"]+)\"\\}").matcher(mainPage);
		if (!m.find())
			throw new IOException("fb_dtsg not found");
		return m.group(1);
	}

	private static final Random R = new Random();

	private static String generateTID() {
		long ret = System.currentTimeMillis();
		long value = R.nextLong() & 0xFFFFFFFL;
		String str = ("0000000000000000000000" + Long.toString(value, 2));
		str = str.substring(str.length() - 22);
		String msgs = Long.toString(ret, 2) + str;
		return Long.toString(Long.parseLong(msgs, 2));
	}

	private static final String FB_REQUEST = "fb_dtsg=%s" //
			+ "&client=mercury&" //
			+ "action_type=ma-type%%3Auser-generated-message&" //
			+ "body=%s&" //
			+ "ephemeral_ttl_mode=0&" //
			+ "has_attachment=false&" //
			+ "message_id=%s&" //
			+ "offline_threading_id=%s&" //
			+ "source=source%%3Atitan%%3Aweb&" //
			+ "thread_fbid=%s&" //
			+ "timestamp=%d&" //
			+ "__a=1&" //
			+ "__be=1&" //
			+ "__pc=PHASED%%3ADEFAULT";

	private static String sendMessage(String cookies, String threadId, String fbDtsg, String message,
			String... accounts) throws IOException {
		String gen = generateTID();
		String encoded = URLEncoder.encode(message, "utf-8");
		String data = String.format(FB_REQUEST, fbDtsg, encoded, gen, gen, threadId, System.currentTimeMillis());
		for (int i = 0; i < accounts.length; i++) {
			data += "&profile_xmd[" + i + "][id]=" + accounts[i] + "&" + "profile_xmd[" + i + "][offset]=0&"
					+ "profile_xmd[" + i + "][length]=" + message.length() + "&" + "profile_xmd[" + i + "][type]=p";
		}
		byte[] data_ = data.getBytes(StandardCharsets.UTF_8);
		HttpURLConnection conn = (HttpURLConnection) new URL("https://www.facebook.com/messaging/send/?dpr=1.5")
				.openConnection();
		conn.addRequestProperty("origin", "https://www.facebook.com");
		conn.addRequestProperty("accept-language", "pl,en-US;q=0.9,en;q=0.8,pl-PL;q=0.7");
		conn.addRequestProperty("cookie", cookies);
		conn.addRequestProperty("pragma", "no-cache");
		conn.addRequestProperty("x-msgr-region", "LLA");
		conn.addRequestProperty("user-agent", Utils.FB_UA);
		conn.addRequestProperty("content-type", "application/x-www-form-urlencoded");
		conn.addRequestProperty("accept", "*/*");
		conn.addRequestProperty("cache-control", "no-cache");
		conn.addRequestProperty("authority", "www.facebook.com");
		conn.addRequestProperty("content-length", Integer.toString(data_.length));
		conn.setRequestProperty("charset", "utf-8");
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.connect();
		OutputStream os = conn.getOutputStream();
		os.write(data_);
		os.flush();
		return Utils.readFully(conn.getInputStream());
	}

}

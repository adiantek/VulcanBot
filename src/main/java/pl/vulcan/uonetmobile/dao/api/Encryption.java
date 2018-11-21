package pl.vulcan.uonetmobile.dao.api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import okio.Buffer;
import pl.vulcan.uonetmobile.model.entities.inner.AccountEntity;

public class Encryption implements Interceptor {
	private AccountEntity a;

	public Encryption(AccountEntity accountEntity) {
		this.a = accountEntity;
	}

	public Response intercept(Chain chain) throws IOException {
		// e eVar;
		StringBuilder stringBuilder;
		Throwable th;
		Request request = chain.request();
		Buffer cVar = new Buffer();
		request.body().writeTo(cVar);
		ByteArrayInputStream byteArrayInputStream = null;
		try {
			KeyStore instance = KeyStore.getInstance("pkcs12");
			ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(
					Base64.getDecoder().decode(this.a.f().getBytes()));
			try {
				instance.load(byteArrayInputStream2, "CE75EA598C7743AD9B0B7328DED85B06".toCharArray());
				PrivateKey privateKey = (PrivateKey) instance.getKey("LoginCert",
						"CE75EA598C7743AD9B0B7328DED85B06".toCharArray());
				Signature instance2 = Signature.getInstance("SHA1withRSA");
				instance2.initSign(privateKey);
				instance2.update(cVar.readByteArray());
				Request build = request.newBuilder().addHeader("RequestSignatureValue",
						Base64.getEncoder().encodeToString(instance2.sign()).replaceAll("\\n", "")).build();
				request = build;
			} catch (Exception e2) {
				byteArrayInputStream = byteArrayInputStream2;
				// this.b.a("MobileApiManager intercepted error:", e);
				if (byteArrayInputStream != null) {
					byteArrayInputStream.close();
				}
				request = request.newBuilder().addHeader("Content-Type", "application/json")
						.addHeader("User-Agent", "MobileUserAgent").addHeader("Host", request.url().getHost())
						.addHeader("RequestCertificateKey", this.a.b()).build();
				// eVar = this.b;
				stringBuilder = new StringBuilder();
				stringBuilder.append("Sending Request to: ");
				stringBuilder.append(request.url());
				return chain.proceed(request);
			}
		} catch (Exception e3) {
			request = request.newBuilder().addHeader("Content-Type", "application/json")
					.addHeader("User-Agent", "MobileUserAgent").addHeader("Host", request.url().getHost())
					.addHeader("RequestCertificateKey", this.a.b()).build();
			stringBuilder = new StringBuilder();
			stringBuilder.append("Sending Request to: ");
			stringBuilder.append(request.url());
			return chain.proceed(request);
		}
		request = request.newBuilder().addHeader("Content-Type", "application/json")
				.addHeader("User-Agent", "MobileUserAgent").addHeader("Host", request.url().getHost())
				.addHeader("RequestCertificateKey", this.a.b()).build();
		stringBuilder = new StringBuilder();
		stringBuilder.append("Sending Request to: ");
		stringBuilder.append(request.url());
		return chain.proceed(request);
	}
}

package ovh.adiantek.app.vulcanbot;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Utils {
	public static final String FB_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36";
	public static final String VULCAN_UA = "MobileUserAgent";

	public static String readFully(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] b = new byte[8192];
		int n;
		while ((n = is.read(b)) != -1)
			baos.write(b, 0, n);
		return new String(baos.toByteArray(), StandardCharsets.UTF_8);
	}

//	public static String download(String ua, String cookies, String s) throws IOException {
//		URL u = new URL(s);
//		HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//		conn.addRequestProperty("authority", "www.facebook.com");
//		conn.addRequestProperty("pragma", "no-cache");
//		conn.addRequestProperty("cache-control", "no-cache");
//		conn.addRequestProperty("upgrade-insecure-requests", "1");
//		conn.addRequestProperty("user-agent", ua);
//		conn.addRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
//		conn.addRequestProperty("accept-language", "pl,en-US;q=0.9,en;q=0.8,pl-PL;q=0.7");
//		conn.addRequestProperty("cookie", cookies);
//		return readFully(conn.getInputStream());
//	}

	public static String download(String ua, String cookies, String s) throws IOException {
		URL u = new URL(s);
		HttpURLConnection conn = (HttpURLConnection) u.openConnection();
		conn.addRequestProperty("Cookie", cookies);
		conn.addRequestProperty("User-Agent", ua);
		return readFully(conn.getInputStream());
	}
}

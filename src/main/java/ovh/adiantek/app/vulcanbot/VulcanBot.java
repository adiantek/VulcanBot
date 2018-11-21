package ovh.adiantek.app.vulcanbot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.GeneralSecurityException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.squareup.okhttp.ResponseBody;

import ovh.adiantek.app.vulcanbot.api.req.CertyfikatRequest;
import ovh.adiantek.app.vulcanbot.api.resp.CertyfikatResponse;
import pl.vulcan.uonetmobile.dao.api.Api;
import pl.vulcan.uonetmobile.model.requests.impl.CertificateRequest;
import pl.vulcan.uonetmobile.model.responses.TokenResponse;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class VulcanBot {

	private static final Logger L = Logger.getLogger(VulcanBot.class.getSimpleName());

	public static void main(String[] args) throws Exception {
		System.setProperty("java.util.logging.SimpleFormatter.format",
				System.getProperty("java.util.logging.SimpleFormatter.format",
						"%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS [%4$s] [%3$s] %5$s%6$s%n"));
		FileHandler handler = null;
		try {
			File dir = new File("logs");
			dir.mkdirs();
			handler = new FileHandler(new File(dir, System.currentTimeMillis() + ".log").getAbsolutePath(), true);
			handler.setFormatter(new MyLogFormatter());
			Logger.getLogger("").addHandler(handler);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		new VulcanBot();
	}

	private Gson gson = new Gson();
	private Configuration conf = new Configuration();
	public FbApi api;
	public String versionName;

	public VulcanBot() throws Exception {
		L.info("Loading configuraiton...");
		try {
			this.loadConfiguration();
		} catch (FileNotFoundException ex) {
			L.severe("Configuration not found! Create file named config.json and insert data");
			System.exit(1);
		}
		if (conf == null) {
			L.severe("Configuration not loaded!");
			System.exit(2);
		}
		if (conf.fbCookies == null) {
			L.severe("fbCookies in configuration not found");
			System.exit(3);
		}
		if (conf.fbThreadId == null) {
			L.severe("fbThreadId in configuration not found");
			System.exit(4);
		}
		L.info("Connecting to fb api...");
		api = new FbApi(conf.fbCookies, conf.fbThreadId);
		L.info("Connected!");
		// System.out.println(api.sendMessage("@Zuck", "4"));
		if (conf.cert == null) {
			L.info("Certificate in configuration not found! Trying to register a new one...");
			if (conf.pin == null || conf.symbol == null || conf.token == null) {
				L.severe("Not found pin/symbol/token in configuration!");
				System.exit(5);
			} else {
//				conf.cert = register(conf.symbol, conf.pin, conf.token);
				conf.symbol = conf.pin = conf.token = null;
				Files.write(Paths.get("config.json"),
						new GsonBuilder().setPrettyPrinting().create().toJson(conf).getBytes(StandardCharsets.UTF_8),
						StandardOpenOption.CREATE);
			}
		}
		if (conf.cert == null) {
			L.severe("Vulcan certificate or symbol/pin/token not found");
			System.exit(6);
		}

		Api a = new Api();
		CertificateRequest req = new CertificateRequest(this);
		req.pin = "xyz";
		req.tokenKey = "xyz";
		Call<ResponseBody> call = a.a("https://lekcjaplus.vulcan.net.pl/poznan/mobile-api/").certificate(req);
		call.enqueue(new Callback<ResponseBody>() {

			@Override
			public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
				try {
					String resp = response.body().string();
					TokenResponse token = gson.fromJson(resp, TokenResponse.class);
					if (token.b) {
						L.log(Level.SEVERE, "Token failed: " + token);
						System.exit(9);
					} else if (token.f != null) {
						conf.symbol = conf.pin = conf.token = null;
						conf.cert = token.f;
						Files.write(Paths.get("config.json"),
								new GsonBuilder().setPrettyPrinting().create().toJson(conf).getBytes(StandardCharsets.UTF_8),
								StandardOpenOption.CREATE);
					} else {
						L.log(Level.SEVERE, "TokenCert is null: " + token);
						System.exit(10);
					}

				} catch (IOException e) {
					L.log(Level.SEVERE, "Request failed", e);
					System.exit(7);
				}

			}

			@Override
			public void onFailure(Throwable t) {
				L.log(Level.SEVERE, "Request failed", t);
				System.exit(8);
			}
		});

	}

	public void loadConfiguration() throws JsonSyntaxException, JsonIOException, IOException {
		if (!Files.exists(Paths.get("config.json")))
			throw new FileNotFoundException();
		conf = gson.fromJson(Files.newBufferedReader(Paths.get("config.json"), StandardCharsets.UTF_8),
				Configuration.class);
	}


}

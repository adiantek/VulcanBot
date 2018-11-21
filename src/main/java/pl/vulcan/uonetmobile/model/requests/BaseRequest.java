package pl.vulcan.uonetmobile.model.requests;

import java.io.Serializable;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

import ovh.adiantek.app.vulcanbot.VulcanBot;

@SuppressWarnings("serial")
public class BaseRequest implements Serializable {
	@SerializedName(value = "RemoteMobileTimeKey")
	protected Long remoteMobileTimeKey;
	@SerializedName(value = "TimeKey")
	protected Long timeKey;
	@SerializedName(value = "RequestId")
	protected String requestId;
	@SerializedName(value = "RemoteMobileAppVersion")
	protected String remoteMobileAppVersion;
	@SerializedName(value = "RemoteMobileAppName")
	protected String remoteMobileAppName;

	protected BaseRequest() {
	}

	protected BaseRequest(VulcanBot bot) {
		this.requestId = UUID.randomUUID().toString();
		this.timeKey = Long.valueOf(System.currentTimeMillis() / 1000L);
		this.remoteMobileTimeKey = Long.valueOf(1L + System.currentTimeMillis() / 1000L);
		this.remoteMobileAppName = "VULCAN-Android-ModulUcznia";
		this.remoteMobileAppVersion = bot.versionName;
		// or 0.0.0.0 if NameNotFoundException
	}

}

package ovh.adiantek.app.vulcanbot.api;

import java.util.UUID;

public abstract class BaseRequest<T> {

	public static final String APPLICATION_NAME = "VULCAN-Android-ModulUcznia";
	public static final String APPLICATION_VERSION = "18.4.1.388";

	private long RemoteMobileTimeKey;
	private long TimeKey;
	private String RemoteMobileAppVersion = APPLICATION_VERSION;
	private String RemoteMobileAppName = APPLICATION_NAME;
	private String RequestId = UUID.randomUUID().toString();

	public BaseRequest() {
		long time = System.currentTimeMillis();
		this.RemoteMobileTimeKey = time / 1000L + 1;
		this.TimeKey = time / 1000L;
	}

	public abstract String getPath();

	public long getRemoteMobileTimeKey() {
		return RemoteMobileTimeKey;
	}

	public void setRemoteMobileTimeKey(long remoteMobileTimeKey) {
		RemoteMobileTimeKey = remoteMobileTimeKey;
	}

	public long getTimeKey() {
		return TimeKey;
	}

	public void setTimeKey(long timeKey) {
		TimeKey = timeKey;
	}

	public String getRemoteMobileAppVersion() {
		return RemoteMobileAppVersion;
	}

	public void setRemoteMobileAppVersion(String remoteMobileAppVersion) {
		RemoteMobileAppVersion = remoteMobileAppVersion;
	}

	public String getRemoteMobileAppName() {
		return RemoteMobileAppName;
	}

	public void setRemoteMobileAppName(String remoteMobileAppName) {
		RemoteMobileAppName = remoteMobileAppName;
	}

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public abstract <T> Class<T> getResponseClass();

}

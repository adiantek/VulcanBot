package pl.vulcan.uonetmobile.model.requests.impl;

import com.google.gson.annotations.SerializedName;

import ovh.adiantek.app.vulcanbot.VulcanBot;
import pl.vulcan.uonetmobile.model.requests.BaseRequest;

@SuppressWarnings("serial")
public class ByIdRequest extends BaseRequest {
	@SerializedName(value = "EntityId")
	private int entityId;

	protected ByIdRequest(VulcanBot bot) {
		super(bot);
	}

	public static ByIdRequest a(VulcanBot bot, int i) {
		ByIdRequest byIdRequest = new ByIdRequest(bot);
		byIdRequest.entityId = i;
		return byIdRequest;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("ByIdRequest{mRemoteMobileAppName='");
		stringBuilder.append(this.remoteMobileAppName);
		stringBuilder.append('\'');
		stringBuilder.append(", mRemoteMobileAppVersion='");
		stringBuilder.append(this.remoteMobileAppVersion);
		stringBuilder.append('\'');
		stringBuilder.append(", mRequestId='");
		stringBuilder.append(this.requestId);
		stringBuilder.append('\'');
		stringBuilder.append(", mTimeKey=");
		stringBuilder.append(this.timeKey);
		stringBuilder.append(", mRemoteTimeKey=");
		stringBuilder.append(this.remoteMobileTimeKey);
		stringBuilder.append(", mEntityId=");
		stringBuilder.append(this.entityId);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

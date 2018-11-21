package pl.vulcan.uonetmobile.model.responses;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("serial")
public class SimpleResponse implements Serializable {
	@SerializedName(value = "ErrorCode")
	private String a;
	@SerializedName(value = "ErrorId")
	private String b;
	@SerializedName(value = "Message")
	private String c;
	@SerializedName(value = "MessageDetails")
	private String d;
	@SerializedName(value = "TimeKey")
	private String e;
	@SerializedName(value = "TimeValue")
	private String f;
	@SerializedName(value = "DayOfWeek")
	private int g;
	@SerializedName(value = "RequestId")
	private String h;
	@SerializedName(value = "AppVersion")
	private String i;
	@SerializedName(value = "Status")
	private String j;

	public String g() {
		return this.a;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SimpleResponse{mErrorCode='");
		stringBuilder.append(this.a);
		stringBuilder.append('\'');
		stringBuilder.append(", mErrorId='");
		stringBuilder.append(this.b);
		stringBuilder.append('\'');
		stringBuilder.append(", mMessage='");
		stringBuilder.append(this.c);
		stringBuilder.append('\'');
		stringBuilder.append(", mMessageDetails='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mTimeKey='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mTimeValue='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append(", mDayOfWeek=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mRequestId='");
		stringBuilder.append(this.h);
		stringBuilder.append('\'');
		stringBuilder.append(", mAppVersion='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mStatus='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

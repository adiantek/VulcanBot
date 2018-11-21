package pl.vulcan.uonetmobile.model.responses;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.inner.AccountEntity;

@SuppressWarnings("serial")
public class TokenResponse implements Serializable {
	@SerializedName(value = "Status")
	public String a;
	@SerializedName(value = "IsError")
	public boolean b;
	@SerializedName(value = "IsMessageForUser")
	public boolean c;
	@SerializedName(value = "Message")
	public String d;
	@SerializedName(value = "TokenKey")
	public String e;
	@SerializedName(value = "TokenCert")
	public AccountEntity f;

	public boolean a() {
		return this.c;
	}

	public boolean b() {
		return this.b;
	}

	public String c() {
		return this.d;
	}

	public AccountEntity d() {
		return this.f;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("TokenRequest{mStatus='");
		stringBuilder.append(this.a);
		stringBuilder.append('\'');
		stringBuilder.append(", mError=");
		stringBuilder.append(this.b);
		stringBuilder.append(", mNoDataMessage='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mTokenKey='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mAccount=");
		stringBuilder.append(this.f);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

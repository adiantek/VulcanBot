package pl.vulcan.uonetmobile.model.entities.mail;

//import com.google.gson.a.c;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MailAddress implements Serializable {
	@SerializedName(value = "LoginId")
	private int a;
	@SerializedName(value = "Nazwa")
	private String b;

	public MailAddress(int i, String str) {
		this.a = i;
		this.b = str;
	}

	public String a() {
		return this.b;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return this.a == ((MailAddress) obj).a;
	}

	public int hashCode() {
		return this.a;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("MailAddress{mID=");
		stringBuilder.append(this.a);
		stringBuilder.append(", mSender='");
		stringBuilder.append(this.b);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

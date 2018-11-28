package pl.vulcan.uonetmobile.model.entities.push;

import com.google.gson.annotations.SerializedName;

public class a {
	@SerializedName(value = "event")
	private String a;

	public boolean a() {
		return "CDC".equalsIgnoreCase(this.a);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("BasePush{mEvent='");
		stringBuilder.append(this.a);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

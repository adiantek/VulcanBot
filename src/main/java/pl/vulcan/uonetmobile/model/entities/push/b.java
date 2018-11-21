package pl.vulcan.uonetmobile.model.entities.push;

import com.google.gson.a.c;

public class b extends a {
	@SerializedName(value = "pupilid")
	private int a;
	@SerializedName(value = "unitid")
	private int b;
	@SerializedName(value = "loginid")
	private int c;
	@SerializedName(value = "table")
	private String d;
	@SerializedName(value = "day")
	private String e;
	@SerializedName(value = "id")
	private int f;

	public int b() {
		return this.a;
	}

	public int c() {
		return this.b;
	}

	public String d() {
		return this.d;
	}

	public int e() {
		return this.c;
	}

	public String f() {
		return this.e;
	}

	public int g() {
		return this.f;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("CDCPush{mPupilId=");
		stringBuilder.append(this.a);
		stringBuilder.append(", mUnitId=");
		stringBuilder.append(this.b);
		stringBuilder.append(", mLoginId=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mTable='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mDay='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mEntityId=");
		stringBuilder.append(this.f);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

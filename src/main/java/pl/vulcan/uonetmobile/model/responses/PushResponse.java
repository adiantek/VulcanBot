package pl.vulcan.uonetmobile.model.responses;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("serial")
public class PushResponse extends SimpleResponse {
	@SerializedName(value = "Data")
	private a a;

	class a {
		@SerializedName(value = "TokenObecny")
		private boolean a;
		@SerializedName(value = "PushOcena")
		private boolean b;
		@SerializedName(value = "PushFrekwencja")
		private boolean c;
		@SerializedName(value = "PushUwaga")
		private boolean d;
		@SerializedName(value = "PushWiadomosc")
		private boolean e;

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Data{mTokenPresent=");
			stringBuilder.append(this.a);
			stringBuilder.append(", mGrade=");
			stringBuilder.append(this.b);
			stringBuilder.append(", mAttendance=");
			stringBuilder.append(this.c);
			stringBuilder.append(", mNote=");
			stringBuilder.append(this.d);
			stringBuilder.append(", mMail=");
			stringBuilder.append(this.e);
			stringBuilder.append('}');
			return stringBuilder.toString();
		}
	}

	public boolean b() {
		return this.a.b;
	}

	public boolean c() {
		return this.a.c;
	}

	public boolean d() {
		return this.a.d;
	}

	public boolean e() {
		return this.a.e;
	}

	public boolean f() {
		return this.a.a;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PushResponse{mData=");
		stringBuilder.append(this.a);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

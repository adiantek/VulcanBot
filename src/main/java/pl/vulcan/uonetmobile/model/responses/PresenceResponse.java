package pl.vulcan.uonetmobile.model.responses;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.data.PresenceEntity;

@SuppressWarnings("serial")
public class PresenceResponse extends SimpleResponse {
	@SerializedName(value = "Data")
	private a a;
	@SerializedName(value = "DataPoczatkowaTekst")
	private String b;
	@SerializedName(value = "DataKoncowaTekst")
	private String c;
	@SerializedName(value = "DataPoczatkowa")
	private long d;
	@SerializedName(value = "DataKoncowa")
	private long e;

	private class a {
		@SerializedName(value = "Frekwencje")
		private PresenceEntity[] a;

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Data{mPresence=");
			stringBuilder.append(Arrays.toString(this.a));
			stringBuilder.append('}');
			return stringBuilder.toString();
		}
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PresenceResponse{mData=");
		stringBuilder.append(this.a);
		stringBuilder.append(", mDateFromText='");
		stringBuilder.append(this.b);
		stringBuilder.append('\'');
		stringBuilder.append(", mDateToText='");
		stringBuilder.append(this.c);
		stringBuilder.append('\'');
		stringBuilder.append(", mDateFrom=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mDateTo=");
		stringBuilder.append(this.e);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

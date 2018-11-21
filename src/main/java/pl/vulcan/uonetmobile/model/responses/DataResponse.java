package pl.vulcan.uonetmobile.model.responses;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@SuppressWarnings("serial")
public class DataResponse<T extends BaseEntity> extends SimpleResponse {
	@SerializedName(value = "Data")
	private T[] a;

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("DataResponse{mData=");
		stringBuilder.append(Arrays.toString(this.a));
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

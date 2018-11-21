package pl.vulcan.uonetmobile.model.responses;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@SuppressWarnings("serial")
public class ByIdResponse<T extends BaseEntity> extends SimpleResponse {
	@SerializedName(value = "Data")
	private T a;

	public T b() {
		return this.a;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("DataResponse{mData=");
		stringBuilder.append(this.a);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

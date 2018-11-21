package pl.vulcan.uonetmobile.model.responses;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.teachers.TeacherSchoolEntity;
import pl.vulcan.uonetmobile.model.entities.teachers.TeacherSubjectEntity;

@SuppressWarnings("serial")
public class TeacherResponse extends SimpleResponse {
	@SerializedName(value = "Data")
	private a a;

	private class a {
		@SerializedName(value = "NauczycieleSzkola")
		private TeacherSchoolEntity[] a;
		@SerializedName(value = "NauczycielePrzedmioty")
		private TeacherSubjectEntity[] b;

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Data{mTeacherSchool=");
			stringBuilder.append(Arrays.toString(this.a));
			stringBuilder.append(", mTeacherSubject=");
			stringBuilder.append(Arrays.toString(this.b));
			stringBuilder.append('}');
			return stringBuilder.toString();
		}
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("DataResponse{mData=");
		stringBuilder.append(this.a.toString());
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

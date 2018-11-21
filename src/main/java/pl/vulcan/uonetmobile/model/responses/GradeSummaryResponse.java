package pl.vulcan.uonetmobile.model.responses;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.grades.impl.AverageGradeEntity;
import pl.vulcan.uonetmobile.model.entities.grades.impl.EndGradeEntity;
import pl.vulcan.uonetmobile.model.entities.grades.impl.ProposedGradeEntity;

@SuppressWarnings("serial")
public class GradeSummaryResponse extends SimpleResponse {
	@SerializedName(value = "Data")
	private a a;

	private class a {
		@SerializedName(value = "OcenyPrzewidywane")
		private ProposedGradeEntity[] a;
		@SerializedName(value = "OcenyKlasyfikacyjne")
		private EndGradeEntity[] b;
		@SerializedName(value = "SrednieOcen")
		private AverageGradeEntity[] c;

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Data{mProposedGrades=");
			stringBuilder.append(Arrays.toString(this.a));
			stringBuilder.append(", mEndGrades=");
			stringBuilder.append(Arrays.toString(this.b));
			stringBuilder.append(", mAverages=");
			stringBuilder.append(Arrays.toString(this.c));
			stringBuilder.append('}');
			return stringBuilder.toString();
		}
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("DataResponse{mData=");
		stringBuilder.append(this.a == null ? "null" : this.a.toString());
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

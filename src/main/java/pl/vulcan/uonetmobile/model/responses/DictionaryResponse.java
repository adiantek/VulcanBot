package pl.vulcan.uonetmobile.model.responses;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

import pl.vulcan.uonetmobile.model.entities.dictionaries.EmployeeEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.GradeCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.NoteCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.PresenceCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.PresenceTypeEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TeacherEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TimeEntity;

public class DictionaryResponse extends SimpleResponse {
	@SerializedName(value = "Data")
	private a a;

	private class a {
		@SerializedName(value = "Nauczyciele")
		private TeacherEntity[] a;
		@SerializedName(value = "Pracownicy")
		private EmployeeEntity[] b;
		@SerializedName(value = "Przedmioty")
		private SubjectEntity[] c;
		@SerializedName(value = "PoryLekcji")
		private TimeEntity[] d;
		@SerializedName(value = "KategorieOcen")
		private GradeCategoryEntity[] e;
		@SerializedName(value = "KategorieUwag")
		private NoteCategoryEntity[] f;
		@SerializedName(value = "KategorieFrekwencji")
		private PresenceCategoryEntity[] g;
		@SerializedName(value = "TypyFrekwencji")
		private PresenceTypeEntity[] h;

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Data{mTeachers=");
			stringBuilder.append(Arrays.toString(this.a));
			stringBuilder.append(", mEmployees=");
			stringBuilder.append(Arrays.toString(this.b));
			stringBuilder.append(", mSubjects=");
			stringBuilder.append(Arrays.toString(this.c));
			stringBuilder.append(", mTime=");
			stringBuilder.append(Arrays.toString(this.d));
			stringBuilder.append(", mGradeCategory=");
			stringBuilder.append(Arrays.toString(this.e));
			stringBuilder.append(", mNoteCategory=");
			stringBuilder.append(Arrays.toString(this.f));
			stringBuilder.append(", mPresenceCategory=");
			stringBuilder.append(Arrays.toString(this.g));
			stringBuilder.append(", mPresenceType=");
			stringBuilder.append(Arrays.toString(this.h));
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

package pl.vulcan.uonetmobile.model.entities.grades.impl;

//import com.google.gson.a.c;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
//import me.dm7.barcodescanner.zxing.BuildConfig;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
//import pl.vulcan.uonetmobile.dao.a.a;
//import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.grades.SummaryGradeEntity;

@DatabaseTable(tableName = "AverageGrades")
public class AverageGradeEntity extends SummaryGradeEntity {
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int c;
	@DatabaseField(canBeNull = true, columnName = "IdPrzedmiotObject", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity d;
	@SerializedName(value = "SredniaOcen")
	@DatabaseField(canBeNull = true, columnName = "SredniaOcen", dataType = DataType.STRING)
	private String e;
	@SerializedName(value = "SumaPunktow")
	@DatabaseField(canBeNull = true, columnName = "SumaPunktow", dataType = DataType.STRING)
	private String f;

	public void a(AppState appState, b bVar) {
		this.d = (SubjectEntity) a.a(bVar, SubjectEntity.class).a(appState, b(), f());
	}

	public boolean c() {
		if (this.e == null) {
			if (this.c >= 0) {
				return false;
			}
		}
		return true;
	}

	public String d() {
		return this.d == null ? BuildConfig.FLAVOR : this.d.d();
	}

	public String d(int i) {
		return i == 0 ? this.e : this.f;
	}

	public int e() {
		return 2;
	}

	public int e(int i) {
		return i == 0 ? 2131493067 : 2131493073;
	}

	public boolean equals(Object obj) {
		boolean z = true;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		AverageGradeEntity averageGradeEntity = (AverageGradeEntity) obj;
		if (this.c != averageGradeEntity.c) {
			return false;
		}
		if (this.e != null) {
			if (!this.e.equals(averageGradeEntity.e)) {
			}
			return z;
		} else if (averageGradeEntity.e == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int f() {
		return this.c;
	}

	public int f(int i) {
		return super.f(0);
	}

	public String g() {
		return this.e;
	}

	public String h() {
		return this.f;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("AverageGradeEntity{mSubjectId=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mSubject=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mAverageGrade='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mSumPoints='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

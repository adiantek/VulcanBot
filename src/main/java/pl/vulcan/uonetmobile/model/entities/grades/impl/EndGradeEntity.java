package pl.vulcan.uonetmobile.model.entities.grades.impl;

import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import me.dm7.barcodescanner.zxing.BuildConfig;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.dao.a.a;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.grades.SummaryGradeEntity;

@DatabaseTable(tableName = "EndGrades")
public class EndGradeEntity extends SummaryGradeEntity {
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int c;
	@DatabaseField(canBeNull = true, columnName = "IdPrzedmiotObject", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity d;
	@SerializedName(value = "Wpis")
	@DatabaseField(canBeNull = true, columnName = "Wpis", dataType = DataType.STRING)
	private String e;

	public void a(AppState appState, b bVar) {
		this.d = (SubjectEntity) a.a(bVar, SubjectEntity.class).a(appState, b(), f());
	}

	public boolean c() {
		return this.c < 0;
	}

	public String d() {
		return this.d == null ? BuildConfig.FLAVOR : this.d.d();
	}

	public String d(int i) {
		return this.e;
	}

	public int e(int i) {
		return 2131493069;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		EndGradeEntity endGradeEntity = (EndGradeEntity) obj;
		return this.c != endGradeEntity.c ? false
				: this.e != null ? this.e.equals(endGradeEntity.e) : endGradeEntity.e == null;
	}

	public int f() {
		return this.c;
	}

	public int hashCode() {
		return (((super.hashCode() * 31) + this.c) * 31) + (this.e != null ? this.e.hashCode() : 0);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("EndGradeEntity{mSubjectId=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mSubject=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mEntry='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

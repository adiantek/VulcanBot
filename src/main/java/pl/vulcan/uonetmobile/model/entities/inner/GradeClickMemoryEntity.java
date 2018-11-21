package pl.vulcan.uonetmobile.model.entities.inner;

import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.IModel;

@DatabaseTable(tableName = "GradeClickMemory")
public class GradeClickMemoryEntity implements IModel<GradeClickMemoryEntity> {
	@SerializedName(value = "ID")
	@DatabaseField(columnName = "ID", dataType = DataType.STRING, id = true)
	private String a;
	@SerializedName(value = "WewIdUczen")
	@DatabaseField(columnName = "WewIdUczen", dataType = DataType.INTEGER, uniqueCombo = true)
	private int b;
	@SerializedName(value = "GRADE_ID")
	@DatabaseField(columnName = "GRADE_ID", dataType = DataType.INTEGER, uniqueCombo = true)
	private int c;

	public GradeClickMemoryEntity(int i, int i2) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(i2);
		stringBuilder.append("/");
		stringBuilder.append(i);
		this.a = stringBuilder.toString();
		this.c = i;
		this.b = i2;
	}

	public int a() {
		return this.c;
	}

	public int a(GradeClickMemoryEntity gradeClickMemoryEntity) {
		return this.b - gradeClickMemoryEntity.b;
	}

	public void a(AppState appState, b bVar) {
	}

	public Comparable c(int i) {
		return Integer.valueOf(this.b);
	}

	public boolean c() {
		return false;
	}

	public /* synthetic */ int compareTo(Object obj) {
		return a((GradeClickMemoryEntity) obj);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		GradeClickMemoryEntity gradeClickMemoryEntity = (GradeClickMemoryEntity) obj;
		return this.c == gradeClickMemoryEntity.c && this.b == gradeClickMemoryEntity.b;
	}

	public int hashCode() {
		return (this.c * 31) + this.b;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("GradeClickMemoryEntity{mGradeId=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mPupilId=");
		stringBuilder.append(this.b);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

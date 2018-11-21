package pl.vulcan.uonetmobile.model.entities.dictionaries;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Employee")
public class EmployeeEntity extends BaseEntity<EmployeeEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Imie")
	@DatabaseField(canBeNull = false, columnName = "Imie", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "Nazwisko")
	@DatabaseField(canBeNull = false, columnName = "Nazwisko", dataType = DataType.STRING)
	private String e;
	@SerializedName(value = "Kod")
	@DatabaseField(canBeNull = false, columnName = "Kod", dataType = DataType.STRING)
	private String f;
	@SerializedName(value = "Aktywny")
	@DatabaseField(canBeNull = false, columnName = "Aktywny", dataType = DataType.BOOLEAN)
	private boolean g;
	@SerializedName(value = "Nauczyciel")
	@DatabaseField(canBeNull = false, columnName = "Nauczyciel", dataType = DataType.BOOLEAN)
	private boolean h;
	@SerializedName(value = "LoginId")
	@DatabaseField(canBeNull = false, columnName = "LoginId", dataType = DataType.INTEGER)
	private int i;

	public int compareTo(EmployeeEntity employeeEntity) {
		if (!(employeeEntity == null || employeeEntity.e == null || employeeEntity.d == null || this.d == null)) {
			if (this.e != null) {
				int compareTo = this.e.compareTo(employeeEntity.e);
				return compareTo != 0 ? compareTo : this.d.compareTo(employeeEntity.d);
			}
		}
		return 0;
	}

	public boolean c() {
		return true;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		return this.c == ((EmployeeEntity) obj).c && super.equals(obj);
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("TeacherEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mName='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mSurname='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mCode='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append(", mActive=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mTeacher=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mUserId=");
		stringBuilder.append(this.i);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

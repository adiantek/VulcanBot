package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TeacherEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Homework")
public class HomeworkEntity extends BaseEntity<HomeworkEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "IdUczen")
	@DatabaseField(canBeNull = false, columnName = "IdUczen", dataType = DataType.INTEGER)
	private int d;
	@SerializedName(value = "Data")
	@DatabaseField(canBeNull = true, columnName = "Data", dataType = DataType.LONG)
	private long e;
	@SerializedName(value = "DataTekst")
	@DatabaseField(canBeNull = true, columnName = "DataTekst", dataType = DataType.STRING)
	private String f;
	@SerializedName(value = "IdPracownik")
	@DatabaseField(canBeNull = true, columnName = "IdPracownik", dataType = DataType.INTEGER)
	private int g;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownik", foreign = true, foreignAutoRefresh = true)
	private TeacherEntity h;
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int i;
	@DatabaseField(canBeNull = true, columnName = "WewIdPrzedmiot", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity j;
	@SerializedName(value = "Opis")
	@DatabaseField(canBeNull = true, columnName = "Opis", dataType = DataType.STRING)
	private String k;

	public int compareTo(HomeworkEntity homeworkEntity) {
		return (int) (this.e - homeworkEntity.e);
	}

	public boolean c() {
		if (this.j != null || this.i < 0) {
			if (this.h == null) {
				if (this.g < 0) {
				}
			}
			return true;
		}
		return false;
	}

	public boolean equals(Object obj) {
		boolean z = true;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		HomeworkEntity homeworkEntity = (HomeworkEntity) obj;
		if (this.e != homeworkEntity.e || this.c != homeworkEntity.c || this.d != homeworkEntity.d
				|| this.i != homeworkEntity.i || this.g != homeworkEntity.g) {
			return false;
		}
		if (this.f != null) {
			if (!this.f.equals(homeworkEntity.f)) {
				return false;
			}
		} else if (homeworkEntity.f != null) {
			return false;
		}
		if (this.k != null) {
			if (!this.k.equals(homeworkEntity.k)) {
				return false;
			}
		} else if (homeworkEntity.k != null) {
			return false;
		}
		if (this.j != null) {
			if (!this.j.equals(homeworkEntity.j)) {
				return false;
			}
		} else if (homeworkEntity.j != null) {
			return false;
		}
		if (this.h != null) {
			if (!this.h.equals(homeworkEntity.h)) {
			}
			return z;
		} else if (homeworkEntity.h == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}
}

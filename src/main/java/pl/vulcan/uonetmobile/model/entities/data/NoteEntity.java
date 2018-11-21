package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.NoteCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TeacherEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Note")
public class NoteEntity extends BaseEntity<NoteEntity> {
	@SerializedName(value = "IdPracownik")
	@DatabaseField(canBeNull = true, columnName = "IdPracownik", dataType = DataType.INTEGER)
	private int c;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownik", foreign = true, foreignAutoRefresh = true)
	private TeacherEntity d;
	@SerializedName(value = "DataWpisu")
	@DatabaseField(canBeNull = true, columnName = "DataWpisu", dataType = DataType.LONG)
	private long e;
	@SerializedName(value = "DataWpisuTekst")
	@DatabaseField(canBeNull = true, columnName = "DataWpisuTekst", dataType = DataType.STRING)
	private String f;
	@SerializedName(value = "UwagaKey")
	@DatabaseField(canBeNull = false, columnName = "UwagaKey", dataType = DataType.STRING)
	private String g;
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int h;
	@SerializedName(value = "TrescUwagi")
	@DatabaseField(columnName = "TrescUwagi", dataType = DataType.STRING)
	private String i;
	@SerializedName(value = "IdUczen")
	@DatabaseField(canBeNull = false, columnName = "IdUczen", dataType = DataType.INTEGER)
	private int j;
	@SerializedName(value = "IdKategoriaUwag")
	@DatabaseField(canBeNull = true, columnName = "IdKategoriaUwag", dataType = DataType.INTEGER)
	private int k;
	@DatabaseField(canBeNull = true, columnName = "WewIdKategoriaUwag", foreign = true, foreignAutoRefresh = true)
	private NoteCategoryEntity l;

	public int compareTo(NoteEntity noteEntity) {
		return (int) (noteEntity.e - this.e);
	}

	public boolean c() {
		if (this.d != null || this.c <= 0) {
			if (this.l == null) {
				if (this.k <= 0) {
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
		NoteEntity noteEntity = (NoteEntity) obj;
		if (this.e != noteEntity.e || this.h != noteEntity.h || this.j != noteEntity.j || this.k != noteEntity.k
				|| this.c != noteEntity.c) {
			return false;
		}
		if (this.f != null) {
			if (!this.f.equals(noteEntity.f)) {
				return false;
			}
		} else if (noteEntity.f != null) {
			return false;
		}
		if (this.g != null) {
			if (!this.g.equals(noteEntity.g)) {
				return false;
			}
		} else if (noteEntity.g != null) {
			return false;
		}
		if (this.l != null) {
			if (!this.l.equals(noteEntity.l)) {
				return false;
			}
		} else if (noteEntity.l != null) {
			return false;
		}
		if (this.d != null) {
			if (!this.d.equals(noteEntity.d)) {
				return false;
			}
		} else if (noteEntity.d != null) {
			return false;
		}
		if (this.i != null) {
			if (!this.i.equals(noteEntity.i)) {
			}
			return z;
		} else if (noteEntity.i == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.h;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("NoteEntity{mTeacherId=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mTeacher=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mDate=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mDateText='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append(", mKey='");
		stringBuilder.append(this.g);
		stringBuilder.append('\'');
		stringBuilder.append(", mID=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mText='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mIdPupil=");
		stringBuilder.append(this.j);
		stringBuilder.append(", mNoteCategoryId=");
		stringBuilder.append(this.k);
		stringBuilder.append(", mNoteCategory=");
		stringBuilder.append(this.l);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

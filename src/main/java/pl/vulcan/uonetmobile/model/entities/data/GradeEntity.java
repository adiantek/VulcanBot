package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.GradeCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TeacherEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Grades")
public class GradeEntity extends BaseEntity<GradeEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Pozycja")
	@DatabaseField(canBeNull = false, columnName = "Pozycja", dataType = DataType.INTEGER)
	private int d;
	@SerializedName(value = "PrzedmiotPozycja")
	@DatabaseField(canBeNull = false, columnName = "PrzedmiotPozycja", dataType = DataType.INTEGER)
	private int e;
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int f;
	@DatabaseField(canBeNull = true, columnName = "WewIdPrzedmiot", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity g;
	@SerializedName(value = "IdKategoria")
	@DatabaseField(canBeNull = false, columnName = "IdKategoria", dataType = DataType.INTEGER)
	private int h;
	@DatabaseField(canBeNull = true, columnName = "WewIdKategoria", foreign = true, foreignAutoRefresh = true)
	private GradeCategoryEntity i;
	@SerializedName(value = "Wpis")
	@DatabaseField(canBeNull = true, columnName = "Wpis", dataType = DataType.STRING)
	private String j;
	@SerializedName(value = "Komentarz")
	@DatabaseField(canBeNull = true, columnName = "Komentarz", dataType = DataType.STRING)
	private String k;
	@SerializedName(value = "Waga")
	@DatabaseField(canBeNull = true, columnName = "Waga", dataType = DataType.STRING)
	private String l;
	@SerializedName(value = "Opis")
	@DatabaseField(canBeNull = true, columnName = "Opis", dataType = DataType.STRING)
	private String m;
	@SerializedName(value = "DataUtworzenia")
	@DatabaseField(canBeNull = true, columnName = "DataUtworzenia", dataType = DataType.LONG)
	private long n;
	@SerializedName(value = "DataUtworzeniaTekst")
	@DatabaseField(canBeNull = true, columnName = "DataUtworzeniaTekst", dataType = DataType.STRING)
	private String o;
	@SerializedName(value = "DataModyfikacji")
	@DatabaseField(canBeNull = true, columnName = "DataModyfikacji", dataType = DataType.LONG)
	private long p;
	@SerializedName(value = "DataModyfikacjiTekst")
	@DatabaseField(canBeNull = true, columnName = "DataModyfikacjiTekst", dataType = DataType.STRING)
	private String q;
	@SerializedName(value = "IdPracownikD")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikD", dataType = DataType.INTEGER)
	private int r;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownikD", foreign = true, foreignAutoRefresh = true)
	private TeacherEntity s;
	@SerializedName(value = "IdPracownikM")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikM", dataType = DataType.INTEGER)
	private int t;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownikM", foreign = true, foreignAutoRefresh = true)
	private TeacherEntity u;

	public int compareTo(GradeEntity gradeEntity) {
		int i = this.e - gradeEntity.e;
		return i == 0 ? this.d - gradeEntity.d : i;
	}

	public boolean c() {
		if (this.g != null || this.f <= 0) {
			if (this.i == null) {
				if (this.h <= 0) {
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
		GradeEntity gradeEntity = (GradeEntity) obj;
		if (this.h != gradeEntity.h || this.n != gradeEntity.n || this.r != gradeEntity.r || this.c != gradeEntity.c
				|| this.p != gradeEntity.p || this.t != gradeEntity.t || this.d != gradeEntity.d
				|| this.f != gradeEntity.f || this.e != gradeEntity.e) {
			return false;
		}
		if (this.i != null) {
			if (!this.i.equals(gradeEntity.i)) {
				return false;
			}
		} else if (gradeEntity.i != null) {
			return false;
		}
		if (this.k != null) {
			if (!this.k.equals(gradeEntity.k)) {
				return false;
			}
		} else if (gradeEntity.k != null) {
			return false;
		}
		if (this.o != null) {
			if (!this.o.equals(gradeEntity.o)) {
				return false;
			}
		} else if (gradeEntity.o != null) {
			return false;
		}
		if (this.s != null) {
			if (!this.s.equals(gradeEntity.s)) {
				return false;
			}
		} else if (gradeEntity.s != null) {
			return false;
		}
		if (this.m != null) {
			if (!this.m.equals(gradeEntity.m)) {
				return false;
			}
		} else if (gradeEntity.m != null) {
			return false;
		}
		if (this.j != null) {
			if (!this.j.equals(gradeEntity.j)) {
				return false;
			}
		} else if (gradeEntity.j != null) {
			return false;
		}
		if (this.q != null) {
			if (!this.q.equals(gradeEntity.q)) {
				return false;
			}
		} else if (gradeEntity.q != null) {
			return false;
		}
		if (this.u != null) {
			if (!this.u.equals(gradeEntity.u)) {
				return false;
			}
		} else if (gradeEntity.u != null) {
			return false;
		}
		if (this.g != null) {
			if (!this.g.equals(gradeEntity.g)) {
				return false;
			}
		} else if (gradeEntity.g != null) {
			return false;
		}
		if (this.l != null) {
			if (!this.l.equals(gradeEntity.l)) {
			}
			return z;
		} else if (gradeEntity.l == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("GradeEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mPosition=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mSubjectPosition=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mSubjectId=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mSubject=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mCategoryId=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mCategory=");
		stringBuilder.append(this.i);
		stringBuilder.append(", mGrade='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mComment='");
		stringBuilder.append(this.k);
		stringBuilder.append('\'');
		stringBuilder.append(", mWeight='");
		stringBuilder.append(this.l);
		stringBuilder.append('\'');
		stringBuilder.append(", mDescription='");
		stringBuilder.append(this.m);
		stringBuilder.append('\'');
		stringBuilder.append(", mCreateDate=");
		stringBuilder.append(this.n);
		stringBuilder.append(", mCreateDateText='");
		stringBuilder.append(this.o);
		stringBuilder.append('\'');
		stringBuilder.append(", mModifyDate=");
		stringBuilder.append(this.p);
		stringBuilder.append(", mModifyDateText='");
		stringBuilder.append(this.q);
		stringBuilder.append('\'');
		stringBuilder.append(", mCreatingTeacherId=");
		stringBuilder.append(this.r);
		stringBuilder.append(", mCreatingTeacher=");
		stringBuilder.append(this.s);
		stringBuilder.append(", mModifyingTeacherId=");
		stringBuilder.append(this.t);
		stringBuilder.append(", mModifyingTeacher=");
		stringBuilder.append(this.u);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

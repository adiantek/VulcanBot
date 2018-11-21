package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.EmployeeEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Exams")
public class ExamEntity extends BaseEntity<ExamEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int d;
	@DatabaseField(canBeNull = true, columnName = "WewIdPrzedmiot", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity e;
	@SerializedName(value = "IdPracownik")
	@DatabaseField(canBeNull = false, columnName = "IdPracownik", dataType = DataType.INTEGER)
	private int f;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownk", foreign = true, foreignAutoRefresh = true)
	private EmployeeEntity g;
	@SerializedName(value = "IdOddzial")
	@DatabaseField(canBeNull = false, columnName = "IdOddzial", dataType = DataType.INTEGER)
	private int h;
	@SerializedName(value = "IdPodzial")
	@DatabaseField(canBeNull = true, columnName = "IdPodzial", dataType = DataType.INTEGER)
	private int i;
	@SerializedName(value = "PodzialNazwa")
	@DatabaseField(canBeNull = true, columnName = "PodzialNazwa", dataType = DataType.STRING)
	private String j;
	@SerializedName(value = "PodzialSkrot")
	@DatabaseField(canBeNull = true, columnName = "PodzialSkrot", dataType = DataType.STRING)
	private String k;
	@SerializedName(value = "Rodzaj")
	@DatabaseField(canBeNull = true, columnName = "Rodzaj", dataType = DataType.BOOLEAN)
	private boolean l;
	@SerializedName(value = "RodzajNumer")
	@DatabaseField(canBeNull = true, columnName = "RodzajNumer", dataType = DataType.INTEGER)
	private int m;
	@SerializedName(value = "Opis")
	@DatabaseField(canBeNull = true, columnName = "Opis", dataType = DataType.STRING)
	private String n;
	@SerializedName(value = "Data")
	@DatabaseField(canBeNull = true, columnName = "Data", dataType = DataType.LONG)
	private long o;
	@SerializedName(value = "DataTekst")
	@DatabaseField(canBeNull = true, columnName = "DataTekst", dataType = DataType.STRING)
	private String p;

	public int compareTo(ExamEntity examEntity) {
		return (int) (this.o - examEntity.o);
	}

	public boolean c() {
		if (this.e == null) {
			if (this.d >= 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(Object obj) {
		boolean z = true;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		ExamEntity examEntity = (ExamEntity) obj;
		if (this.l != examEntity.l || this.o != examEntity.o || this.h != examEntity.h || this.c != examEntity.c
				|| this.i != examEntity.i || this.d != examEntity.d) {
			return false;
		}
		if (this.p != null) {
			if (!this.p.equals(examEntity.p)) {
				return false;
			}
		} else if (examEntity.p != null) {
			return false;
		}
		if (this.n != null) {
			if (!this.n.equals(examEntity.n)) {
				return false;
			}
		} else if (examEntity.n != null) {
			return false;
		}
		if (this.j != null) {
			if (!this.j.equals(examEntity.j)) {
				return false;
			}
		} else if (examEntity.j != null) {
			return false;
		}
		if (this.k != null) {
			if (!this.k.equals(examEntity.k)) {
				return false;
			}
		} else if (examEntity.k != null) {
			return false;
		}
		if (this.e != null) {
			if (!this.e.equals(examEntity.e)) {
			}
			return z;
		} else if (examEntity.e == null) {
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
		stringBuilder.append("ExamEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mSubjectId=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mSubject=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mEmployeeId=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mEmployee=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mGroupId=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mSplitId=");
		stringBuilder.append(this.i);
		stringBuilder.append(", mSplitName='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mSplitShort='");
		stringBuilder.append(this.k);
		stringBuilder.append('\'');
		stringBuilder.append(", isExam=");
		stringBuilder.append(this.l);
		stringBuilder.append(", mDescription='");
		stringBuilder.append(this.n);
		stringBuilder.append('\'');
		stringBuilder.append(", mDate=");
		stringBuilder.append(this.o);
		stringBuilder.append(", mDateText='");
		stringBuilder.append(this.p);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

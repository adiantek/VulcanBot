package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.PresenceCategoryEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TimeEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Presence")
public class PresenceEntity extends BaseEntity<PresenceEntity> {
	@SerializedName(value = "IdKategoria")
	@DatabaseField(canBeNull = false, columnName = "IdKategoria", dataType = DataType.INTEGER)
	private int c;
	@DatabaseField(canBeNull = true, columnName = "WewIdKategoria", foreign = true, foreignAutoRefresh = true)
	private PresenceCategoryEntity d;
	@SerializedName(value = "Numer")
	@DatabaseField(canBeNull = false, columnName = "Numer", dataType = DataType.INTEGER)
	private int e;
	@SerializedName(value = "IdPoraLekcji")
	@DatabaseField(canBeNull = false, columnName = "IdPoraLekcji", dataType = DataType.INTEGER)
	private int f;
	@DatabaseField(canBeNull = true, columnName = "IdWewPoraLekcji", foreign = true, foreignAutoRefresh = true)
	private TimeEntity g;
	@SerializedName(value = "Dzien")
	@DatabaseField(canBeNull = true, columnName = "Dzien", dataType = DataType.LONG)
	private long h;
	@SerializedName(value = "DzienTekst")
	@DatabaseField(canBeNull = true, columnName = "DzienTekst", dataType = DataType.STRING)
	private String i;
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int j;
	@DatabaseField(canBeNull = true, columnName = "WewIdPrzedmiot", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity k;
	@SerializedName(value = "PrzedmiotNazwa")
	@DatabaseField(canBeNull = true, columnName = "PrzedmiotNazwa", dataType = DataType.STRING)
	private String l;

	public int compareTo(PresenceEntity presenceEntity) {
		return (presenceEntity.g == null && this.g == null) ? 0
				: this.g == null ? -1 : presenceEntity.g == null ? 1 : this.g.a(presenceEntity.g);
	}

	public boolean c() {
		if ((this.k != null || this.j < 0) && (this.g != null || this.f < 0)) {
			if (this.d == null) {
				if (this.c < 0) {
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
		PresenceEntity presenceEntity = (PresenceEntity) obj;
		if (this.h != presenceEntity.h || this.e != presenceEntity.e || this.c != presenceEntity.c
				|| this.j != presenceEntity.j || this.f != presenceEntity.f) {
			return false;
		}
		if (this.d != null) {
			if (!this.d.equals(presenceEntity.d)) {
				return false;
			}
		} else if (presenceEntity.d != null) {
			return false;
		}
		if (this.i != null) {
			if (!this.i.equals(presenceEntity.i)) {
				return false;
			}
		} else if (presenceEntity.i != null) {
			return false;
		}
		if (this.k != null) {
			if (!this.k.equals(presenceEntity.k)) {
				return false;
			}
		} else if (presenceEntity.k != null) {
			return false;
		}
		if (this.g != null) {
			if (!this.g.equals(presenceEntity.g)) {
			}
			return z;
		} else if (presenceEntity.g == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int hashCode() {
		return (((super.hashCode() * 31) + (this.f ^ (this.f >>> 32))) * 31) + this.i.hashCode();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PresenceEntity{mPresenceCategoryID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mCategory=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mNumber=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mTimeId=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mTime=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mDate=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mDateText='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mSubjectId=");
		stringBuilder.append(this.j);
		stringBuilder.append(", mSubject=");
		stringBuilder.append(this.k);
		stringBuilder.append(", mSubjectText='");
		stringBuilder.append(this.l);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

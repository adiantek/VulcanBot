package pl.vulcan.uonetmobile.model.entities.dictionaries;

import android.content.Context;
import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "Time")
public class TimeEntity extends BaseEntity<TimeEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Numer")
	@DatabaseField(canBeNull = false, columnName = "Numer", dataType = DataType.INTEGER)
	private int d;
	@SerializedName(value = "Poczatek")
	@DatabaseField(canBeNull = false, columnName = "Poczatek", dataType = DataType.LONG)
	private long e;
	@SerializedName(value = "PoczatekTekst")
	@DatabaseField(canBeNull = false, columnName = "PoczatekTekst", dataType = DataType.STRING)
	private String f;
	@SerializedName(value = "Koniec")
	@DatabaseField(canBeNull = false, columnName = "Koniec", dataType = DataType.LONG)
	private long g;
	@SerializedName(value = "KoniecTekst")
	@DatabaseField(canBeNull = false, columnName = "KoniecTekst", dataType = DataType.STRING)
	private String h;

	public int a(TimeEntity timeEntity) {
		return (int) (this.e - timeEntity.e);
	}

	public String a(Context context) {
		if (this.f != null) {
			if (this.h != null) {
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(this.f);
				stringBuilder.append(" - ");
				stringBuilder.append(this.h);
				return stringBuilder.toString();
			}
		}
		return context.getString(2131492968);
	}

	public void a(AppState appState, b bVar) {
	}

	public Comparable c(int i) {
		return Integer.valueOf(this.c);
	}

	public boolean c() {
		return true;
	}

	public /* synthetic */ int compareTo(Object obj) {
		return a((TimeEntity) obj);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		return this.c == ((TimeEntity) obj).c && super.equals(obj);
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("TimeEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mNumber=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mBegin=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mBeginText='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append(", mEnd=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mEndText='");
		stringBuilder.append(this.h);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

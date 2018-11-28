package pl.vulcan.uonetmobile.model.entities.dictionaries;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "PresenceCategory")
public class PresenceCategoryEntity extends BaseEntity<PresenceCategoryEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Nazwa")
	@DatabaseField(canBeNull = false, columnName = "Nazwa", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "Pozycja")
	@DatabaseField(canBeNull = false, columnName = "Pozycja", dataType = DataType.INTEGER)
	private int e;
	@SerializedName(value = "Obecnosc")
	@DatabaseField(canBeNull = false, columnName = "Obecnosc", dataType = DataType.BOOLEAN)
	private boolean f;
	@SerializedName(value = "Nieobecnosc")
	@DatabaseField(canBeNull = false, columnName = "Nieobecnosc", dataType = DataType.BOOLEAN)
	private boolean g;
	@SerializedName(value = "Zwolnienie")
	@DatabaseField(canBeNull = false, columnName = "Zwolnienie", dataType = DataType.BOOLEAN)
	private boolean h;
	@SerializedName(value = "Spoznienie")
	@DatabaseField(canBeNull = false, columnName = "Spoznienie", dataType = DataType.BOOLEAN)
	private boolean i;
	@SerializedName(value = "Usprawiedliwione")
	@DatabaseField(canBeNull = false, columnName = "Usprawiedliwione", dataType = DataType.BOOLEAN)
	private boolean j;
	@SerializedName(value = "Usuniete")
	@DatabaseField(canBeNull = false, columnName = "Usuniete", dataType = DataType.BOOLEAN)
	private boolean k;

	public int compareTo(PresenceCategoryEntity presenceCategoryEntity) {
		if (presenceCategoryEntity != null) {
			if (presenceCategoryEntity.d != null) {
				return this.d == null ? -1 : this.d.compareTo(presenceCategoryEntity.d);
			}
		}
		return 1;
	}

//	public void a(AppState appState, b bVar) {
//	}

	public Comparable c(int i) {
		return this.d;
	}

	public boolean c() {
		return true;
	}

	public int d() {
		return this.c;
	}

	public String e() {
		return this.d;
	}

	public boolean f() {
		return this.k;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PresenceCategoryEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mName='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mPosition=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mPresence=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mAbsence=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mOff=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mLate=");
		stringBuilder.append(this.i);
		stringBuilder.append(", mJustified=");
		stringBuilder.append(this.j);
		stringBuilder.append(", mRemoved=");
		stringBuilder.append(this.k);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

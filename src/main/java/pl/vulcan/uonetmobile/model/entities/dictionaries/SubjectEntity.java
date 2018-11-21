package pl.vulcan.uonetmobile.model.entities.dictionaries;

import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "Subjects")
public class SubjectEntity extends BaseEntity<SubjectEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Kod")
	@DatabaseField(canBeNull = false, columnName = "Kod", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "Nazwa")
	@DatabaseField(canBeNull = false, columnName = "Nazwa", dataType = DataType.STRING)
	private String e;
	@SerializedName(value = "Aktywny")
	@DatabaseField(canBeNull = false, columnName = "Aktywny", dataType = DataType.BOOLEAN)
	private boolean f;
	@SerializedName(value = "Pozycja")
	@DatabaseField(canBeNull = false, columnName = "Pozycja", dataType = DataType.INTEGER)
	private int g;

	public int a(SubjectEntity subjectEntity) {
		return subjectEntity.e == null ? 1 : this.e == null ? -1 : this.e.compareTo(subjectEntity.e);
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
		return a((SubjectEntity) obj);
	}

	public String d() {
		return this.e;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		return this.c == ((SubjectEntity) obj).c && super.equals(obj);
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SubjectEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mName='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mCode='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mActive=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mPosition=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mPupil=");
		stringBuilder.append(this.b);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

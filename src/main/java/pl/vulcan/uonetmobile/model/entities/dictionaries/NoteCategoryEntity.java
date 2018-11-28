package pl.vulcan.uonetmobile.model.entities.dictionaries;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "NoteCategories")
public class NoteCategoryEntity extends BaseEntity<NoteCategoryEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Nazwa")
	@DatabaseField(canBeNull = false, columnName = "Nazwa", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "Aktywna")
	@DatabaseField(canBeNull = false, columnName = "Aktywna", dataType = DataType.BOOLEAN)
	private boolean e;
	@SerializedName(value = "Aktywny")
	@DatabaseField(canBeNull = false, columnName = "Aktywny", dataType = DataType.BOOLEAN)
	private boolean f;

	public int compareTo(NoteCategoryEntity noteCategoryEntity) {
		if (noteCategoryEntity != null) {
			if (noteCategoryEntity.d != null) {
				return this.d == null ? -1 : this.d.compareTo(noteCategoryEntity.d);
			}
		}
		return 1;
	}

//	public void a(AppState appState, b bVar) {
//	}

	public Comparable c(int i) {
		return Integer.valueOf(this.c);
	}

	public boolean c() {
		return true;
	}

//	@Override
//	public int compareTo(NoteCategoryEntity o) {
//		return a(o);
//	}

	public String d() {
		return this.d;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		return this.c == ((NoteCategoryEntity) obj).c && super.equals(obj);
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("NoteCategoryEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mName='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mActiveNote=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mActive=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mPupil=");
		stringBuilder.append(this.b);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}

}

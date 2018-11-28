package pl.vulcan.uonetmobile.model.entities.dictionaries;

//import android.content.Context;
//import com.google.gson.a.c;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "Teachers")
public class TeacherEntity extends BaseEntity<TeacherEntity> {
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

	public int compareTo(TeacherEntity teacherEntity) {
		if (!(teacherEntity == null || teacherEntity.e == null || teacherEntity.d == null || this.d == null)) {
			if (this.e != null) {
				int compareTo = this.e.compareTo(teacherEntity.e);
				return compareTo != 0 ? compareTo : this.d.compareTo(teacherEntity.d);
			}
		}
		return 0;
	}

//	public String a(Context context) {
//		if (this.d != null) {
//			if (this.e != null) {
//				StringBuilder stringBuilder = new StringBuilder();
//				stringBuilder.append(this.e);
//				stringBuilder.append(" ");
//				stringBuilder.append(this.d);
//				return stringBuilder.toString();
//			}
//		}
//		return context.getString(2131492968);
//	}

//	public void a(AppState appState, b bVar) {
//	}

	public Comparable c(int i) {
		return Integer.valueOf(this.c);
	}

	public boolean c() {
		return true;
	}

//	public /* synthetic */ int compareTo(Object obj) {
//		return a((TeacherEntity) obj);
//	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		return this.c == ((TeacherEntity) obj).c && super.equals(obj);
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

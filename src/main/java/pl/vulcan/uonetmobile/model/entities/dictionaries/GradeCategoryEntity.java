package pl.vulcan.uonetmobile.model.entities.dictionaries;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "GradeCategories")
public class GradeCategoryEntity extends BaseEntity<GradeCategoryEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "Kod")
	@DatabaseField(canBeNull = false, columnName = "Kod", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "Nazwa")
	@DatabaseField(canBeNull = false, columnName = "Nazwa", dataType = DataType.STRING)
	private String e;

	public int compareTo(GradeCategoryEntity gradeCategoryEntity) {
		if (gradeCategoryEntity != null) {
			if (gradeCategoryEntity.e != null) {
				return this.e == null ? -1 : this.e.compareTo(gradeCategoryEntity.e);
			}
		}
		return 1;
	}

	public Comparable c(int i) {
		return Integer.valueOf(this.c);
	}

	public boolean c() {
		return true;
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
		return this.c == ((GradeCategoryEntity) obj).c && super.equals(obj);
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.c;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("GradeCategoryEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mCode='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mName='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mPupil=");
		stringBuilder.append(this.b);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

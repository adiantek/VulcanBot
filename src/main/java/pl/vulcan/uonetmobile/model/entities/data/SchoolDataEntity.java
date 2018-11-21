package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "SchoolDataEntity")
public class SchoolDataEntity extends BaseEntity<SchoolDataEntity> {
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	private int c = 0;
	@SerializedName(value = "Dyrektor")
	@DatabaseField(canBeNull = true, columnName = "Dyrektor", dataType = DataType.STRING)
	private String d;

	public int compareTo(SchoolDataEntity schoolDataEntity) {
		return this.c - schoolDataEntity.c;
	}

	public boolean c() {
		return true;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		SchoolDataEntity schoolDataEntity = (SchoolDataEntity) obj;
		return this.c == schoolDataEntity.c && this.d.equals(schoolDataEntity.d);
	}

	public int hashCode() {
		return ((super.hashCode() * 31) + this.c) + this.d.hashCode();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SchoolDataEntity{mID=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mHeadmaster='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

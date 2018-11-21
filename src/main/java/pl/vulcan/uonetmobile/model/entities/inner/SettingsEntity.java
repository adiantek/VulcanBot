package pl.vulcan.uonetmobile.model.entities.inner;

import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.IModel;

@DatabaseTable(tableName = "Settings")
public class SettingsEntity implements IModel<SettingsEntity> {
	@DatabaseField(allowGeneratedIdInsert = true, columnName = "ID", dataType = DataType.INTEGER, generatedId = true)
	private int a;
	@SerializedName(value = "Key")
	@DatabaseField(columnName = "Key", dataType = DataType.STRING)
	private String b;
	@SerializedName(value = "Value")
	@DatabaseField(columnName = "Value", dataType = DataType.STRING)
	private String c;

	public int a(SettingsEntity settingsEntity) {
		return this.a - settingsEntity.a;
	}

	public void a(AppState appState, b bVar) {
	}

	public Comparable c(int i) {
		return Integer.valueOf(this.a);
	}

	public boolean c() {
		return true;
	}

	public /* synthetic */ int compareTo(Object obj) {
		return a((SettingsEntity) obj);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return this.a == ((SettingsEntity) obj).a;
	}

	public int hashCode() {
		return this.a;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SettingsEntity{mIdentifier=");
		stringBuilder.append(this.a);
		stringBuilder.append(", mKey='");
		stringBuilder.append(this.b);
		stringBuilder.append('\'');
		stringBuilder.append(", mValue='");
		stringBuilder.append(this.c);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

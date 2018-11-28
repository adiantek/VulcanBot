package pl.vulcan.uonetmobile.model.entities.dictionaries;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;

@DatabaseTable(tableName = "PresenceType")
public class PresenceTypeEntity extends BaseEntity<PresenceTypeEntity> {
   @SerializedName(value =  "Id")
    @DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
    private int c;
   @SerializedName(value =  "Symbol")
    @DatabaseField(canBeNull = false, columnName = "Symbol", dataType = DataType.STRING)
    private String d;
   @SerializedName(value =  "Nazwa")
    @DatabaseField(canBeNull = false, columnName = "Nazwa", dataType = DataType.STRING)
    private String e;
   @SerializedName(value =  "Aktywny")
    @DatabaseField(canBeNull = false, columnName = "Aktywny", dataType = DataType.BOOLEAN)
    private boolean f;
   @SerializedName(value =  "WpisDomyslny")
    @DatabaseField(canBeNull = false, columnName = "WpisDomyslny", dataType = DataType.BOOLEAN)
    private boolean g;
   @SerializedName(value =  "IdKategoriaFrek")
    @DatabaseField(canBeNull = false, columnName = "IdKategoriaFrek", dataType = DataType.INTEGER)
    private int h;
    @DatabaseField(canBeNull = true, columnName = "WewIdKategoriaFrek", foreign = true, foreignAutoRefresh = true)
    private PresenceCategoryEntity i;

    public int compareTo(PresenceTypeEntity presenceTypeEntity) {
        if (presenceTypeEntity != null) {
            if (presenceTypeEntity.e != null) {
                return this.e == null ? -1 : this.e.compareTo(presenceTypeEntity.e);
            }
        }
        return 1;
    }

//    public void a(AppState appState, b bVar) {
//        this.i = (PresenceCategoryEntity) a.a(bVar, PresenceCategoryEntity.class).a(appState, b(), d());
//    }

    public Comparable c(int i) {
        return this.e;
    }

    public boolean c() {
        if (this.i == null) {
            if (this.h >= 0) {
                return false;
            }
        }
        return true;
    }

//    public /* synthetic */ int compareTo(Object obj) {
//        return a((PresenceTypeEntity) obj);
//    }

    public int d() {
        return this.h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PresenceTypeEntity{mID=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mSymbol='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", mName='");
        stringBuilder.append(this.e);
        stringBuilder.append('\'');
        stringBuilder.append(", mActive=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mDefault=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mPresenceCategoryID=");
        stringBuilder.append(this.h);
        stringBuilder.append(", mCategory=");
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

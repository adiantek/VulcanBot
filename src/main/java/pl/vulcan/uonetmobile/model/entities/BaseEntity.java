package pl.vulcan.uonetmobile.model.entities;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

public abstract class BaseEntity<T> implements IModel<T> {
    @DatabaseField(allowGeneratedIdInsert = true, columnName = "WierszID", dataType = DataType.INTEGER, generatedId = true)
    protected int a;
    @DatabaseField(canBeNull = false, columnName = "WewIdUczen", dataType = DataType.INTEGER)
    protected int b;

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b == ((BaseEntity) obj).b;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BaseEntity{mIdentifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mPupil=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

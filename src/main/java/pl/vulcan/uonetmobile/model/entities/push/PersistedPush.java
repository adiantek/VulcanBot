package pl.vulcan.uonetmobile.model.entities.push;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.auxilary.enums.CDCPushEnum;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;

@DatabaseTable(tableName = "PersistedPush")
public class PersistedPush extends BaseEntity<PersistedPush> {
    @DatabaseField(canBeNull = true, columnName = "Title", dataType = DataType.STRING)
    private String c;
    @DatabaseField(canBeNull = true, columnName = "Message", dataType = DataType.STRING)
    private String d;
    @DatabaseField(canBeNull = true, columnName = "Content", dataType = DataType.STRING)
    private String e;
    @DatabaseField(canBeNull = true, columnName = "FormattedPupil", dataType = DataType.STRING)
    private String f;
    @DatabaseField(canBeNull = true, columnName = "Timestamp", dataType = DataType.LONG)
    private long g;
    @DatabaseField(canBeNull = true, columnName = "EventEnum", dataType = DataType.SERIALIZABLE)
    private CDCPushEnum h;
    @DatabaseField(canBeNull = true, columnName = "LoginId", dataType = DataType.INTEGER)
    private int i;

    public int a(PersistedPush persistedPush) {
        return (int) (persistedPush.g - this.g);
    }

    public void a(String str) {
        this.c = str;
    }

    public void a(AppState appState, b bVar) {
    }

    public void a(CDCPushEnum cDCPushEnum) {
        this.h = cDCPushEnum;
    }

    public void a(PupilEntity pupilEntity, int i) {
        this.g = DateTime.now().getMillis();
        this.b = pupilEntity.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pupilEntity.l());
        stringBuilder.append(" ");
        stringBuilder.append(pupilEntity.k());
        this.f = stringBuilder.toString();
        this.i = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public Comparable c(int i) {
        return this.c;
    }

    public void c(String str) {
        this.e = str;
    }

    public boolean c() {
        return false;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((PersistedPush) obj);
    }

    public String d() {
        DateTime dateTime = new DateTime(this.g);
        DateTime now = DateTime.now();
        String str = (now.getDayOfYear() == dateTime.getDayOfYear() && now.getYear() == dateTime.getYear()) ? "HH:mm" : "yyyy-MM-dd HH:mm";
        return DateTimeFormat.forPattern(str).print(this.g);
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public CDCPushEnum h() {
        return this.h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PersistedPush{mTitle='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", mMessage='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", mContent='");
        stringBuilder.append(this.e);
        stringBuilder.append('\'');
        stringBuilder.append(", mFormattedPupil='");
        stringBuilder.append(this.f);
        stringBuilder.append('\'');
        stringBuilder.append(", mTimestamp=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mEvent=");
        stringBuilder.append(this.h);
        stringBuilder.append(", mLoginId=");
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

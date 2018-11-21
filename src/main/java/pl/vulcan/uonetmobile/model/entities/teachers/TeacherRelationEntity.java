package pl.vulcan.uonetmobile.model.entities.teachers;

import android.content.Context;
import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.dao.a.a;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.EmployeeEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;

public abstract class TeacherRelationEntity extends BaseEntity<TeacherRelationEntity> {
   @SerializedName(value =  "IdPracownik")
    @DatabaseField(canBeNull = false, columnName = "IdPracownik", dataType = DataType.INTEGER)
    private int c;
    @DatabaseField(canBeNull = true, columnName = "WewIdPracownik", foreign = true, foreignAutoRefresh = true)
    private EmployeeEntity d;
   @SerializedName(value =  "IdPrzedmiot")
    @DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
    private int e;
    @DatabaseField(canBeNull = true, columnName = "WewIdPrzedmiot", foreign = true, foreignAutoRefresh = true)
    private SubjectEntity f;
   @SerializedName(value =  "Rola")
    @DatabaseField(canBeNull = false, columnName = "Rola", dataType = DataType.STRING)
    private String g;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(pl.vulcan.uonetmobile.model.entities.teachers.TeacherRelationEntity r3) {
        /*
        r2 = this;
        r0 = r2.d;
        r1 = 0;
        if (r0 == 0) goto L_0x0039;
    L_0x0005:
        r0 = r2.g;
        if (r0 == 0) goto L_0x0039;
    L_0x0009:
        r0 = r2.f;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r0 = r3.d;
        if (r0 == 0) goto L_0x0039;
    L_0x0012:
        r0 = r3.g;
        if (r0 == 0) goto L_0x0039;
    L_0x0016:
        r0 = r3.f;
        if (r0 != 0) goto L_0x001b;
    L_0x001a:
        return r1;
    L_0x001b:
        r0 = r2.f;
        r1 = r3.f;
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r2.g;
        r1 = r3.g;
        r0 = r0.compareTo(r1);
        if (r0 != 0) goto L_0x0038;
    L_0x0030:
        r0 = r2.d;
        r3 = r3.d;
        r0 = r0.a(r3);
    L_0x0038:
        return r0;
    L_0x0039:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.vulcan.uonetmobile.model.entities.teachers.TeacherRelationEntity.a(pl.vulcan.uonetmobile.model.entities.teachers.TeacherRelationEntity):int");
    }

    public String a(Context context) {
        return this.d == null ? context.getString(2131492968) : this.d.a(context);
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(AppState appState, b bVar) {
        this.d = (EmployeeEntity) a.a(bVar, EmployeeEntity.class).a(appState, b(), d());
        this.f = (SubjectEntity) a.a(bVar, SubjectEntity.class).a(appState, b(), f());
    }

    public Comparable c(int i) {
        return Integer.valueOf(this.c);
    }

    public boolean c() {
        if (this.f != null || this.e < 0) {
            if (this.d == null) {
                if (this.c < 0) {
                }
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((TeacherRelationEntity) obj);
    }

    public int d() {
        return this.c;
    }

    public EmployeeEntity e() {
        return this.d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x0066;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r2 = super.equals(r5);
        if (r2 != 0) goto L_0x0019;
    L_0x0018:
        return r1;
    L_0x0019:
        r5 = (pl.vulcan.uonetmobile.model.entities.teachers.TeacherRelationEntity) r5;
        r2 = r4.e;
        r3 = r5.e;
        if (r2 == r3) goto L_0x0022;
    L_0x0021:
        return r1;
    L_0x0022:
        r2 = r4.c;
        r3 = r5.c;
        if (r2 == r3) goto L_0x0029;
    L_0x0028:
        return r1;
    L_0x0029:
        r2 = r4.g;
        if (r2 == 0) goto L_0x0038;
    L_0x002d:
        r2 = r4.g;
        r3 = r5.g;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x003d;
    L_0x0037:
        return r1;
    L_0x0038:
        r2 = r5.g;
        if (r2 == 0) goto L_0x003d;
    L_0x003c:
        return r1;
    L_0x003d:
        r2 = r4.f;
        if (r2 == 0) goto L_0x004c;
    L_0x0041:
        r2 = r4.f;
        r3 = r5.f;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0050;
    L_0x004b:
        goto L_0x0064;
    L_0x004c:
        r2 = r5.f;
        if (r2 != 0) goto L_0x0064;
    L_0x0050:
        r2 = r4.d;
        if (r2 == 0) goto L_0x005f;
    L_0x0054:
        r2 = r4.d;
        r5 = r5.d;
        r5 = r2.equals(r5);
        if (r5 != 0) goto L_0x0065;
    L_0x005e:
        goto L_0x0064;
    L_0x005f:
        r5 = r5.d;
        if (r5 != 0) goto L_0x0064;
    L_0x0063:
        return r0;
    L_0x0064:
        r0 = 0;
    L_0x0065:
        return r0;
    L_0x0066:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.vulcan.uonetmobile.model.entities.teachers.TeacherRelationEntity.equals(java.lang.Object):boolean");
    }

    public int f() {
        return this.e;
    }

    public SubjectEntity g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + this.c) * 31) + (this.d != null ? this.d.hashCode() : 0)) * 31) + this.e) * 31) + (this.f != null ? this.f.hashCode() : 0)) * 31;
        if (this.g != null) {
            i = this.g.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TeacherRelationEntity{mTeacherId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mTeacher=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mSubjectId=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mSubject=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mRole='");
        stringBuilder.append(this.g);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

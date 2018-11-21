package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.SubjectEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TeacherEntity;
import pl.vulcan.uonetmobile.model.entities.dictionaries.TimeEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Schedule")
public class ScheduleEntity extends BaseEntity<ScheduleEntity> {
	@SerializedName(value = "PlanUcznia")
	@DatabaseField(canBeNull = true, columnName = "PlanUcznia", dataType = DataType.BOOLEAN)
	private boolean A;
	@SerializedName(value = "Dzien")
	@DatabaseField(canBeNull = false, columnName = "Dzien", dataType = DataType.LONG)
	private long c;
	@SerializedName(value = "DzienTekst")
	@DatabaseField(canBeNull = false, columnName = "DzienTekst", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "NumerLekcji")
	@DatabaseField(canBeNull = false, columnName = "NumerLekcji", dataType = DataType.INTEGER)
	private int e;
	@SerializedName(value = "IdPoraLekcji")
	@DatabaseField(canBeNull = false, columnName = "IdPoraLekcji", dataType = DataType.INTEGER)
	private int f;
	@DatabaseField(canBeNull = true, columnName = "WewIdPoraLekcji", foreign = true, foreignAutoRefresh = true)
	private TimeEntity g;
	@SerializedName(value = "IdPrzedmiot")
	@DatabaseField(canBeNull = false, columnName = "IdPrzedmiot", dataType = DataType.INTEGER)
	private int h;
	@DatabaseField(canBeNull = true, columnName = "WewIdPrzedmiot", foreign = true, foreignAutoRefresh = true)
	private SubjectEntity i;
	@SerializedName(value = "PrzedmiotNazwa")
	@DatabaseField(canBeNull = true, columnName = "PrzedmiotNazwa", dataType = DataType.STRING)
	private String j;
	@SerializedName(value = "PodzialSkrot")
	@DatabaseField(canBeNull = true, columnName = "PodzialSkrot", dataType = DataType.STRING)
	private String k;
	@SerializedName(value = "Sala")
	@DatabaseField(canBeNull = true, columnName = "Sala", dataType = DataType.STRING)
	private String l;
	@SerializedName(value = "IdPracownik")
	@DatabaseField(canBeNull = true, columnName = "IdPracownik", dataType = DataType.INTEGER)
	private int m;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownik", foreign = true, foreignAutoRefresh = true)
	private TeacherEntity n;
	@SerializedName(value = "IdPracownikPlanLekcji")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikPlanLekcji", dataType = DataType.INTEGER)
	private int o;
	@SerializedName(value = "IdPracownikWspomagajacyPlanLekcji")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikWspomagajacyPlanLekcji", dataType = DataType.INTEGER)
	private int p;
	@SerializedName(value = "IdPracownikWspomagajacyLekcja")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikWspomagajacyLekcja", dataType = DataType.INTEGER)
	private int q;
	@SerializedName(value = "IdPlanLekcji")
	@DatabaseField(canBeNull = true, columnName = "IdPlanLekcji", dataType = DataType.INTEGER)
	private int r;
	@SerializedName(value = "IdLekcja")
	@DatabaseField(canBeNull = true, columnName = "IdLekcja", dataType = DataType.INTEGER)
	private int s;
	@SerializedName(value = "IdPracownikWspomagajacy")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikWspomagajacy", dataType = DataType.INTEGER)
	private int t;
	@SerializedName(value = "IdPracownikOld")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikOld", dataType = DataType.INTEGER)
	private int u;
	@DatabaseField(canBeNull = true, columnName = "WewIdPracownikOld", foreign = true, foreignAutoRefresh = true)
	private TeacherEntity v;
	@SerializedName(value = "IdPracownikWspomagajacyOld")
	@DatabaseField(canBeNull = true, columnName = "IdPracownikWspomagajacyOld", dataType = DataType.INTEGER)
	private int w;
	@SerializedName(value = "AdnotacjaOZmianie")
	@DatabaseField(canBeNull = true, columnName = "AdnotacjaOZmianie", dataType = DataType.STRING)
	private String x;
	@SerializedName(value = "PrzekreslonaNazwa")
	@DatabaseField(canBeNull = true, columnName = "PrzekreslonaNazwa", dataType = DataType.BOOLEAN)
	private boolean y;
	@SerializedName(value = "PogrubionaNazwa")
	@DatabaseField(canBeNull = true, columnName = "PogrubionaNazwa", dataType = DataType.BOOLEAN)
	private boolean z;

	public int compareTo(ScheduleEntity scheduleEntity) {
		int i = (int) (this.c - scheduleEntity.c);
		return i != 0 ? i
				: (scheduleEntity.g == null && this.g == null) ? 0
						: this.g == null ? -1 : scheduleEntity.g == null ? 1 : this.g.a(scheduleEntity.g);
	}

	public boolean c() {
		if ((this.i != null || this.h <= 0) && (this.g != null || this.f <= 0)) {
			if (this.n == null) {
				if (this.m <= 0) {
				}
			}
			return true;
		}
		return false;
	}

	public boolean equals(Object obj) {
		boolean z = true;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		ScheduleEntity scheduleEntity = (ScheduleEntity) obj;
		if (this.c != scheduleEntity.c || this.s != scheduleEntity.s || this.e != scheduleEntity.e
				|| this.r != scheduleEntity.r || this.h != scheduleEntity.h || this.q != scheduleEntity.q
				|| this.p != scheduleEntity.p || this.m != scheduleEntity.m || this.o != scheduleEntity.o
				|| this.f != scheduleEntity.f) {
			return false;
		}
		if (this.d != null) {
			if (!this.d.equals(scheduleEntity.d)) {
				return false;
			}
		} else if (scheduleEntity.d != null) {
			return false;
		}
		if (this.l != null) {
			if (!this.l.equals(scheduleEntity.l)) {
				return false;
			}
		} else if (scheduleEntity.l != null) {
			return false;
		}
		if (this.k != null) {
			if (!this.k.equals(scheduleEntity.k)) {
				return false;
			}
		} else if (scheduleEntity.k != null) {
			return false;
		}
		if (this.i != null) {
			if (!this.i.equals(scheduleEntity.i)) {
				return false;
			}
		} else if (scheduleEntity.i != null) {
			return false;
		}
		if (this.n != null) {
			if (!this.n.equals(scheduleEntity.n)) {
				return false;
			}
		} else if (scheduleEntity.n != null) {
			return false;
		}
		if (this.g != null) {
			if (!this.g.equals(scheduleEntity.g)) {
			}
			return z;
		} else if (scheduleEntity.g == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int hashCode() {
		return (((super.hashCode() * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + this.e;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("ScheduleEntity{mID=");
		stringBuilder.append(this.a);
		stringBuilder.append(",mPupilID=");
		stringBuilder.append(this.b);
		stringBuilder.append(",mDay=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mDayText='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mLessonNumber=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mTimeId=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mTime=");
		stringBuilder.append(this.g);
		stringBuilder.append(", mSubjectId=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mSubject=");
		stringBuilder.append(this.i);
		stringBuilder.append(", mSubjectText='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mSplitShort='");
		stringBuilder.append(this.k);
		stringBuilder.append('\'');
		stringBuilder.append(", mRoom='");
		stringBuilder.append(this.l);
		stringBuilder.append('\'');
		stringBuilder.append(", mTeacherId=");
		stringBuilder.append(this.m);
		stringBuilder.append(", mTeacher=");
		stringBuilder.append(this.n);
		stringBuilder.append(", mTeacherPlanId=");
		stringBuilder.append(this.o);
		stringBuilder.append(", mTeacherAuxSubjectId=");
		stringBuilder.append(this.p);
		stringBuilder.append(", mTeacherAuxLessonId=");
		stringBuilder.append(this.q);
		stringBuilder.append(", mScheduleId=");
		stringBuilder.append(this.r);
		stringBuilder.append(", mLessonId=");
		stringBuilder.append(this.s);
		stringBuilder.append(", mSupportTeacherId=");
		stringBuilder.append(this.t);
		stringBuilder.append(", mOldTeacherId=");
		stringBuilder.append(this.u);
		stringBuilder.append(", mOldTeacher=");
		stringBuilder.append(this.v);
		stringBuilder.append(", mOldSupportTeacherId=");
		stringBuilder.append(this.w);
		stringBuilder.append(", mScheduleChanges='");
		stringBuilder.append(this.x);
		stringBuilder.append('\'');
		stringBuilder.append(", mUnderlineName=");
		stringBuilder.append(this.y);
		stringBuilder.append(", mBoldName=");
		stringBuilder.append(this.z);
		stringBuilder.append(", mPupilPlan=");
		stringBuilder.append(this.A);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

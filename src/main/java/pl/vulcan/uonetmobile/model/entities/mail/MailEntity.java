package pl.vulcan.uonetmobile.model.entities.mail;

import com.google.gson.a.c;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import java.util.Arrays;
import me.dm7.barcodescanner.zxing.BuildConfig;
import org.joda.time.DateTime;
import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.managers.a.b;
import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.data.PupilEntity;
import pl.vulcan.uonetmobile.model.entities.mail.impl.WorkingCopyMailEntity;

public abstract class MailEntity extends BaseEntity<MailEntity> {
	@SerializedName(value = "WiadomoscId")
	@DatabaseField(canBeNull = false, columnName = "WiadomoscId", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "NadawcaId")
	@DatabaseField(canBeNull = true, columnName = "NadawcaId", dataType = DataType.INTEGER)
	private int d;
	@SerializedName(value = "Nadawca")
	@DatabaseField(canBeNull = true, columnName = "Nadawca", dataType = DataType.STRING)
	private String e;
	@SerializedName(value = "Adresaci")
	@DatabaseField(canBeNull = true, columnName = "Adresaci", dataType = DataType.SERIALIZABLE)
	private MailAddress[] f;
	@SerializedName(value = "Tytul")
	@DatabaseField(canBeNull = false, columnName = "Tytul", dataType = DataType.STRING)
	private String g;
	@SerializedName(value = "Tresc")
	@DatabaseField(canBeNull = true, columnName = "Tresc", dataType = DataType.STRING)
	private String h;
	@SerializedName(value = "DataWyslania")
	@DatabaseField(canBeNull = true, columnName = "DataWyslania", dataType = DataType.STRING)
	private String i;
	@SerializedName(value = "GodzinaWyslania")
	@DatabaseField(canBeNull = true, columnName = "GodzinaWyslania", dataType = DataType.STRING)
	private String j;
	@SerializedName(value = "DataWyslaniaUnixEpoch")
	@DatabaseField(canBeNull = true, columnName = "DataWyslaniaUnixEpoch", dataType = DataType.LONG)
	private long k;
	@SerializedName(value = "DataPrzeczytania")
	@DatabaseField(canBeNull = true, columnName = "DataPrzeczytania", dataType = DataType.STRING)
	private String l;
	@SerializedName(value = "GodzinaPrzeczytania")
	@DatabaseField(canBeNull = true, columnName = "GodzinaPrzeczytania", dataType = DataType.STRING)
	private String m;
	@SerializedName(value = "DataPrzeczytaniaUnixEpoch")
	@DatabaseField(canBeNull = true, columnName = "DataPrzeczytaniaUnixEpoch", dataType = DataType.LONG)
	private long n;
	@SerializedName(value = "StatusWiadomosci")
	@DatabaseField(canBeNull = true, columnName = "StatusWiadomosci", dataType = DataType.STRING)
	private String o;
	@SerializedName(value = "FolderWiadomosci")
	@DatabaseField(canBeNull = true, columnName = "FolderWiadomosci", dataType = DataType.STRING)
	private String p;
	@SerializedName(value = "Nieprzeczytane")
	@DatabaseField(canBeNull = true, columnName = "Nieprzeczytane", dataType = DataType.STRING)
	private String q;
	@SerializedName(value = "Przeczytane")
	@DatabaseField(canBeNull = true, columnName = "Przeczytane", dataType = DataType.STRING)
	private String r;
	private boolean s;

	public MailEntity(MailEntity mailEntity) {
		this.c = mailEntity.c;
		this.d = mailEntity.d;
		this.e = mailEntity.e;
		this.f = mailEntity.f;
		this.g = mailEntity.g;
		this.h = mailEntity.h;
		this.i = mailEntity.i;
		this.j = mailEntity.j;
		this.l = mailEntity.l;
		this.m = mailEntity.m;
		this.o = mailEntity.o;
		this.p = mailEntity.p;
		this.q = mailEntity.q;
		this.r = mailEntity.r;
		this.b = mailEntity.b;
	}

	public int a(MailEntity mailEntity) {
		return -new DateTime(this.k * 1000).compareTo(new DateTime(mailEntity.k * 1000));
	}

	public WorkingCopyMailEntity a(PupilEntity pupilEntity, boolean z) {
		WorkingCopyMailEntity workingCopyMailEntity = new WorkingCopyMailEntity();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(z ? "RE:" : "FW:");
		stringBuilder.append(this.g);
		workingCopyMailEntity.a(stringBuilder.toString());
		if (this.e != null) {
			MailAddress[] mailAddressArr = new MailAddress[1];
			int i = this.d;
			StringBuilder stringBuilder2 = new StringBuilder();
			stringBuilder2.append(this.e);
			stringBuilder2.append(" - pracownik [");
			stringBuilder2.append(pupilEntity.g());
			stringBuilder2.append("]");
			mailAddressArr[0] = new MailAddress(i, stringBuilder2.toString());
			workingCopyMailEntity.a(mailAddressArr);
		}
		workingCopyMailEntity.b(z ? BuildConfig.FLAVOR : this.h);
		workingCopyMailEntity.a(z);
		return workingCopyMailEntity;
	}

	public void a(long j) {
		this.k = j;
	}

	public void a(String str) {
		this.g = str;
	}

	public void a(AppState appState, b bVar) {
	}

	public void a(boolean z) {
		this.s = z;
	}

	public void a(MailAddress[] mailAddressArr) {
		this.f = mailAddressArr;
	}

	public void b(long j) {
		this.n = j;
	}

	public void b(String str) {
		this.h = str;
	}

	public Comparable c(int i) {
		return this.g;
	}

	public void c(String str) {
		this.i = str;
	}

	public boolean c() {
		return true;
	}

	public /* synthetic */ int compareTo(Object obj) {
		return a((MailEntity) obj);
	}

	public int d() {
		return this.c;
	}

	public void d(String str) {
		this.j = str;
	}

	public String e() {
		return this.g;
	}

	public void e(String str) {
		this.l = str;
	}

	public boolean equals(Object obj) {
		boolean z = true;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		MailEntity mailEntity = (MailEntity) obj;
		if (this.c != mailEntity.c) {
			return false;
		}
		if (this.e != null) {
			if (!this.e.equals(mailEntity.e)) {
				return false;
			}
		} else if (mailEntity.e != null) {
			return false;
		}
		if (this.l != null) {
			if (!this.l.equals(mailEntity.l)) {
				return false;
			}
		} else if (mailEntity.l != null) {
			return false;
		}
		if (this.m != null) {
			if (!this.m.equals(mailEntity.m)) {
			}
			return z;
		} else if (mailEntity.m == null) {
			return true;
		}
		z = false;
		return z;
	}

	public String f() {
		return this.h;
	}

	public String g() {
		return this.i;
	}

	public String h() {
		return this.p;
	}

	public int hashCode() {
		return this.c;
	}

	public MailAddress[] i() {
		return this.f;
	}

	public String j() {
		return this.l;
	}

	public boolean k() {
		return this.s;
	}

	public String l() {
		if (this.i == null) {
			return BuildConfig.FLAVOR;
		}
		if (this.j == null) {
			return this.i;
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.i);
		stringBuilder.append(" ");
		stringBuilder.append(this.j);
		return stringBuilder.toString();
	}

	public String m() {
		if (this.e != null) {
			return this.e;
		}
		StringBuilder stringBuilder = new StringBuilder(BuildConfig.FLAVOR);
		if (this.f.length > 2) {
			return "Do wielu adresat\u00f3w";
		}
		int i = 0;
		while (i < this.f.length) {
			stringBuilder.append(this.f[i].a());
			stringBuilder.append(i < this.f.length + -1 ? ", " : BuildConfig.FLAVOR);
			i++;
		}
		return stringBuilder.toString();
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("MailEntity{mReply=");
		stringBuilder.append(this.s);
		stringBuilder.append(", mRead='");
		stringBuilder.append(this.r);
		stringBuilder.append('\'');
		stringBuilder.append(", mNotRead='");
		stringBuilder.append(this.q);
		stringBuilder.append('\'');
		stringBuilder.append(", mFolder='");
		stringBuilder.append(this.p);
		stringBuilder.append('\'');
		stringBuilder.append(", mStatus='");
		stringBuilder.append(this.o);
		stringBuilder.append('\'');
		stringBuilder.append(", mReceiveHour='");
		stringBuilder.append(this.m);
		stringBuilder.append('\'');
		stringBuilder.append(", mReceiveDate='");
		stringBuilder.append(this.l);
		stringBuilder.append('\'');
		stringBuilder.append(", mSendHour='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mSendDate='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mContent='");
		stringBuilder.append(this.h);
		stringBuilder.append('\'');
		stringBuilder.append(", mSubject='");
		stringBuilder.append(this.g);
		stringBuilder.append('\'');
		stringBuilder.append(", mAddresses=");
		stringBuilder.append(Arrays.toString(this.f));
		stringBuilder.append(", mSender='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mSenderId=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mID=");
		stringBuilder.append(this.c);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

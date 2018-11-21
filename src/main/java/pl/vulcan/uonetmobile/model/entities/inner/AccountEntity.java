package pl.vulcan.uonetmobile.model.entities.inner;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.auxilary.collections.AppState;
import pl.vulcan.uonetmobile.model.entities.IModel;
import pl.vulcan.uonetmobile.model.entities.push.b;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Accounts")
public class AccountEntity implements IModel<AccountEntity> {
	@DatabaseField(allowGeneratedIdInsert = true, columnName = "KontoID", dataType = DataType.INTEGER, generatedId = true)
	private int a;
	@SerializedName(value = "CertyfikatKlucz")
	@DatabaseField(columnName = "CertyfikatKlucz", dataType = DataType.STRING)
	private String b;
	@SerializedName(value = "CertyfikatKluczSformatowanyTekst")
	@DatabaseField(columnName = "CertyfikatKluczSformatowanyTekst", dataType = DataType.STRING)
	private String c;
	@SerializedName(value = "CertyfikatDataUtworzenia")
	@DatabaseField(columnName = "CertyfikatDataUtworzenia", dataType = DataType.STRING)
	private String d;
	@SerializedName(value = "CertyfikatDataUtworzeniaSformatowanyTekst")
	@DatabaseField(columnName = "CertyfikatDataUtworzeniaSformatowanyTekst", dataType = DataType.STRING)
	private String e;
	@SerializedName(value = "CertyfikatPfx")
	@DatabaseField(columnName = "CertyfikatPfx", dataType = DataType.STRING)
	private String f;
	@SerializedName(value = "GrupaKlientow")
	@DatabaseField(columnName = "GrupaKlientow", dataType = DataType.STRING)
	private String g;
	@SerializedName(value = "AdresBazowyRestApi")
	@DatabaseField(columnName = "AdresBazowyRestApi", dataType = DataType.STRING)
	private String h;
	@SerializedName(value = "UzytkownikLogin")
	@DatabaseField(columnName = "UzytkownikLogin", dataType = DataType.STRING)
	private String i;
	@SerializedName(value = "UzytkownikNazwa")
	@DatabaseField(columnName = "UzytkownikNazwa", dataType = DataType.STRING)
	private String j;
	@SerializedName(value = "TypKonta")
	@DatabaseField(columnName = "TypKonta", dataType = DataType.STRING)
	private String k;

	public int a() {
		return this.a;
	}

	public int compareTo(AccountEntity accountEntity) {
		return this.i == null ? -1 : accountEntity.i == null ? 1 : this.i.compareTo(accountEntity.i);
	}

	public void a(AppState appState, b bVar) {
	}

	public String b() {
		return this.b;
	}

	public Comparable c(int i) {
		return Integer.valueOf(this.a);
	}

	public boolean c() {
		return true;
	}

	public String d() {
		return this.c;
	}

	public String e() {
		return this.e;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		return this.a == ((AccountEntity) obj).a;
	}

	public String f() {
		return this.f;
	}

	public String g() {
		return this.g;
	}

	public String h() {
		return this.h;
	}

	public int hashCode() {
		return this.a;
	}

	public String i() {
		return this.i;
	}

	public boolean j() {
		return "debug".equals(this.k);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("AccountEntity{mIdentifier=");
		stringBuilder.append(this.a);
		stringBuilder.append(", mCertificate='");
		stringBuilder.append(this.b);
		stringBuilder.append('\'');
		stringBuilder.append(", mCertificateFormatted='");
		stringBuilder.append(this.c);
		stringBuilder.append('\'');
		stringBuilder.append(", mCertificateDate='");
		stringBuilder.append(this.d);
		stringBuilder.append('\'');
		stringBuilder.append(", mCertificateDateFormatted='");
		stringBuilder.append(this.e);
		stringBuilder.append('\'');
		stringBuilder.append(", mCertData='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append(", mClientGroup='");
		stringBuilder.append(this.g);
		stringBuilder.append('\'');
		stringBuilder.append(", mBaseRest='");
		stringBuilder.append(this.h);
		stringBuilder.append('\'');
		stringBuilder.append(", mUserLogin='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mUserName='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mDebug='");
		stringBuilder.append(this.k);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

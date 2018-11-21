package pl.vulcan.uonetmobile.model.entities.data;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import pl.vulcan.uonetmobile.model.entities.BaseEntity;
import pl.vulcan.uonetmobile.model.entities.inner.AccountEntity;

@SuppressWarnings("serial")
@DatabaseTable(tableName = "Pupils")
public class PupilEntity extends BaseEntity<PupilEntity> {
	@SerializedName(value = "Nazwisko")
	@DatabaseField(canBeNull = true, columnName = "Nazwisko", dataType = DataType.STRING)
	private String A;
	@SerializedName(value = "Alias")
	@DatabaseField(canBeNull = true, columnName = "Alias", dataType = DataType.STRING)
	private String B;
	@SerializedName(value = "UczenPlec")
	@DatabaseField(canBeNull = false, columnName = "UczenPlec", dataType = DataType.STRING)
	private String C;
	@SerializedName(value = "Pozycja")
	@DatabaseField(canBeNull = false, columnName = "Pozycja", dataType = DataType.STRING)
	private String D;
	@SerializedName(value = "Konto")
	@DatabaseField(canBeNull = false, columnName = "Konto", foreign = true, foreignAutoRefresh = true)
	private AccountEntity E;
	@SerializedName(value = "IdOkresKlasyfikacyjny")
	@DatabaseField(canBeNull = false, columnName = "IdOkresKlasyfikacyjny", dataType = DataType.INTEGER)
	private int c;
	@SerializedName(value = "OkresPoziom")
	@DatabaseField(canBeNull = true, columnName = "OkresPoziom", dataType = DataType.INTEGER)
	private int d;
	@SerializedName(value = "OkresNumer")
	@DatabaseField(canBeNull = true, columnName = "OkresNumer", dataType = DataType.INTEGER)
	private int e;
	@SerializedName(value = "OkresDataOd")
	@DatabaseField(canBeNull = true, columnName = "OkresDataOd", dataType = DataType.LONG)
	private long f;
	@SerializedName(value = "OkresDataOdTekst")
	@DatabaseField(canBeNull = true, columnName = "OkresDataOdTekst", dataType = DataType.STRING)
	private String g;
	@SerializedName(value = "OkresDataDo")
	@DatabaseField(canBeNull = true, columnName = "OkresDataDo", dataType = DataType.LONG)
	private long h;
	@SerializedName(value = "OkresDataDoTekst")
	@DatabaseField(canBeNull = true, columnName = "OkresDataDoTekst", dataType = DataType.STRING)
	private String i;
	@SerializedName(value = "IdJednostkaSprawozdawcza")
	@DatabaseField(canBeNull = false, columnName = "IdJednostkaSprawozdawcza", dataType = DataType.STRING)
	private String j;
	@SerializedName(value = "JednostkaSprawozdawczaSkrot")
	@DatabaseField(canBeNull = true, columnName = "JednostkaSprawozdawczaSkrot", dataType = DataType.STRING)
	private String k;
	@SerializedName(value = "JednostkaSprawozdawczaNazwa")
	@DatabaseField(canBeNull = true, columnName = "JednostkaSprawozdawczaNazwa", dataType = DataType.STRING)
	private String l;
	@SerializedName(value = "JednostkaSprawozdawczaSymbol")
	@DatabaseField(canBeNull = false, columnName = "JednostkaSprawozdawczaSymbol", dataType = DataType.STRING)
	private String m;
	@SerializedName(value = "IdJednostka")
	@DatabaseField(canBeNull = false, columnName = "IdJednostka", dataType = DataType.STRING)
	private String n;
	@SerializedName(value = "JednostkaNazwa")
	@DatabaseField(canBeNull = true, columnName = "JednostkaNazwa", dataType = DataType.STRING)
	private String o;
	@SerializedName(value = "JednostkaSkrot")
	@DatabaseField(canBeNull = true, columnName = "JednostkaSkrot", dataType = DataType.STRING)
	private String p;
	@SerializedName(value = "UzytkownikRola")
	@DatabaseField(canBeNull = true, columnName = "UzytkownikRola", dataType = DataType.STRING)
	private String q;
	@SerializedName(value = "UzytkownikLogin")
	@DatabaseField(canBeNull = true, columnName = "UzytkownikLogin", dataType = DataType.STRING)
	private String r;
	@SerializedName(value = "UzytkownikLoginId")
	@DatabaseField(canBeNull = true, columnName = "UzytkownikLoginId", dataType = DataType.INTEGER)
	private int s;
	@SerializedName(value = "UzytkownikNazwa")
	@DatabaseField(canBeNull = true, columnName = "UzytkownikNazwa", dataType = DataType.STRING)
	private String t;
	@SerializedName(value = "Id")
	@DatabaseField(canBeNull = false, columnName = "Id", dataType = DataType.INTEGER)
	public int u;
	@SerializedName(value = "OddzialSymbol")
	@DatabaseField(canBeNull = true, columnName = "OddzialSymbol", dataType = DataType.STRING)
	private String v;
	@SerializedName(value = "OddzialKod")
	@DatabaseField(canBeNull = true, columnName = "OddzialKod", dataType = DataType.STRING)
	private String w;
	@SerializedName(value = "IdOddzial")
	@DatabaseField(canBeNull = false, columnName = "IdOddzial", dataType = DataType.INTEGER)
	private int x;
	@SerializedName(value = "Imie")
	@DatabaseField(canBeNull = true, columnName = "Imie", dataType = DataType.STRING)
	private String y;
	@SerializedName(value = "Imie2")
	@DatabaseField(canBeNull = true, columnName = "Imie2", dataType = DataType.STRING)
	private String z;

	public int compareTo(PupilEntity pupilEntity) {
		int compareTo = this.A.compareTo(pupilEntity.A);
		return compareTo != 0 ? compareTo : this.y.compareTo(pupilEntity.y);
	}

	public boolean c() {
		return true;
	}

	public boolean equals(Object obj) {
		boolean z = true;
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
			return false;
		}
		PupilEntity pupilEntity = (PupilEntity) obj;
		if (this.c != pupilEntity.c || this.d != pupilEntity.d || this.e != pupilEntity.e || this.f != pupilEntity.f
				|| this.h != pupilEntity.h || this.s != pupilEntity.s || this.u != pupilEntity.u
				|| this.x != pupilEntity.x) {
			return false;
		}
		if (this.g != null) {
			if (!this.g.equals(pupilEntity.g)) {
				return false;
			}
		} else if (pupilEntity.g != null) {
			return false;
		}
		if (this.i != null) {
			if (!this.i.equals(pupilEntity.i)) {
				return false;
			}
		} else if (pupilEntity.i != null) {
			return false;
		}
		if (this.j != null) {
			if (!this.j.equals(pupilEntity.j)) {
				return false;
			}
		} else if (pupilEntity.j != null) {
			return false;
		}
		if (this.k != null) {
			if (!this.k.equals(pupilEntity.k)) {
				return false;
			}
		} else if (pupilEntity.k != null) {
			return false;
		}
		if (this.l != null) {
			if (!this.l.equals(pupilEntity.l)) {
				return false;
			}
		} else if (pupilEntity.l != null) {
			return false;
		}
		if (this.m != null) {
			if (!this.m.equals(pupilEntity.m)) {
				return false;
			}
		} else if (pupilEntity.m != null) {
			return false;
		}
		if (this.n != null) {
			if (!this.n.equals(pupilEntity.n)) {
				return false;
			}
		} else if (pupilEntity.n != null) {
			return false;
		}
		if (this.o != null) {
			if (!this.o.equals(pupilEntity.o)) {
				return false;
			}
		} else if (pupilEntity.o != null) {
			return false;
		}
		if (this.p != null) {
			if (!this.p.equals(pupilEntity.p)) {
				return false;
			}
		} else if (pupilEntity.p != null) {
			return false;
		}
		if (this.q != null) {
			if (!this.q.equals(pupilEntity.q)) {
				return false;
			}
		} else if (pupilEntity.q != null) {
			return false;
		}
		if (this.r != null) {
			if (!this.r.equals(pupilEntity.r)) {
				return false;
			}
		} else if (pupilEntity.r != null) {
			return false;
		}
		if (this.t != null) {
			if (!this.t.equals(pupilEntity.t)) {
				return false;
			}
		} else if (pupilEntity.t != null) {
			return false;
		}
		if (this.v != null) {
			if (!this.v.equals(pupilEntity.v)) {
				return false;
			}
		} else if (pupilEntity.v != null) {
			return false;
		}
		if (this.w != null) {
			if (!this.w.equals(pupilEntity.w)) {
				return false;
			}
		} else if (pupilEntity.w != null) {
			return false;
		}
		if (this.y != null) {
			if (!this.y.equals(pupilEntity.y)) {
				return false;
			}
		} else if (pupilEntity.y != null) {
			return false;
		}
		if (this.z != null) {
			if (!this.z.equals(pupilEntity.z)) {
				return false;
			}
		} else if (pupilEntity.z != null) {
			return false;
		}
		if (this.A != null) {
			if (!this.A.equals(pupilEntity.A)) {
				return false;
			}
		} else if (pupilEntity.A != null) {
			return false;
		}
		if (this.B != null) {
			if (!this.B.equals(pupilEntity.B)) {
				return false;
			}
		} else if (pupilEntity.B != null) {
			return false;
		}
		if (this.C != null) {
			if (!this.C.equals(pupilEntity.C)) {
				return false;
			}
		} else if (pupilEntity.C != null) {
			return false;
		}
		if (this.D != null) {
			if (!this.D.equals(pupilEntity.D)) {
			}
			return z;
		} else if (pupilEntity.D == null) {
			return true;
		}
		z = false;
		return z;
	}

	public int hashCode() {
		return (super.hashCode() * 31) + this.u;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PupilEntity{mTermId=");
		stringBuilder.append(this.c);
		stringBuilder.append(", mTermLevel=");
		stringBuilder.append(this.d);
		stringBuilder.append(", mTermNumber=");
		stringBuilder.append(this.e);
		stringBuilder.append(", mTermFrom=");
		stringBuilder.append(this.f);
		stringBuilder.append(", mTermFromText='");
		stringBuilder.append(this.g);
		stringBuilder.append('\'');
		stringBuilder.append(", mTermTo=");
		stringBuilder.append(this.h);
		stringBuilder.append(", mTermToText='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mUnitId='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mUnitNameShort='");
		stringBuilder.append(this.k);
		stringBuilder.append('\'');
		stringBuilder.append(", mUnitName='");
		stringBuilder.append(this.l);
		stringBuilder.append('\'');
		stringBuilder.append(", mUnitSymbol='");
		stringBuilder.append(this.m);
		stringBuilder.append('\'');
		stringBuilder.append(", mSchoolId='");
		stringBuilder.append(this.n);
		stringBuilder.append('\'');
		stringBuilder.append(", mSchoolName='");
		stringBuilder.append(this.o);
		stringBuilder.append('\'');
		stringBuilder.append(", mSchoolNameShort='");
		stringBuilder.append(this.p);
		stringBuilder.append('\'');
		stringBuilder.append(", mUserRole='");
		stringBuilder.append(this.q);
		stringBuilder.append('\'');
		stringBuilder.append(", mUserLogin='");
		stringBuilder.append(this.r);
		stringBuilder.append('\'');
		stringBuilder.append(", mUserId=");
		stringBuilder.append(this.s);
		stringBuilder.append(", mUserName='");
		stringBuilder.append(this.t);
		stringBuilder.append('\'');
		stringBuilder.append(", mID=");
		stringBuilder.append(this.u);
		stringBuilder.append(", mGroupSymbol='");
		stringBuilder.append(this.v);
		stringBuilder.append('\'');
		stringBuilder.append(", mGroupCode='");
		stringBuilder.append(this.w);
		stringBuilder.append('\'');
		stringBuilder.append(", mGroupId=");
		stringBuilder.append(this.x);
		stringBuilder.append(", mPupilName='");
		stringBuilder.append(this.y);
		stringBuilder.append('\'');
		stringBuilder.append(", mPupilName2='");
		stringBuilder.append(this.z);
		stringBuilder.append('\'');
		stringBuilder.append(", mPupilSurname='");
		stringBuilder.append(this.A);
		stringBuilder.append('\'');
		stringBuilder.append(", mPupilAlias='");
		stringBuilder.append(this.B);
		stringBuilder.append('\'');
		stringBuilder.append(", mPupilSex='");
		stringBuilder.append(this.C);
		stringBuilder.append('\'');
		stringBuilder.append(", mPosition='");
		stringBuilder.append(this.D);
		stringBuilder.append('\'');
		stringBuilder.append(", mAccount=");
		stringBuilder.append(this.E);
		stringBuilder.append('}');
		return stringBuilder.toString();
	}

	public long f() {
		return this.h;
	}

	public String g() {
		return this.k;
	}

	public String h() {
		return this.m;
	}

	public int i() {
		return this.u;
	}

	public int j() {
		return this.x;
	}

	public String k() {
		return this.y;
	}

	public String l() {
		return this.A;
	}

	public AccountEntity m() {
		return this.E;
	}

	public String n() {
		return this.p;
	}

	public String o() {
		return this.g;
	}

	public String p() {
		return this.i;
	}

	public String q() {
		return this.q;
	}

	public String r() {
		return this.r;
	}

	public int s() {
		return this.s;
	}

	public String t() {
		return this.t;
	}
}

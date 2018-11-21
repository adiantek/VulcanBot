package pl.vulcan.uonetmobile.model.requests.impl;

import com.google.gson.annotations.SerializedName;

import ovh.adiantek.app.vulcanbot.VulcanBot;
import pl.vulcan.uonetmobile.model.entities.mail.MailAddress;
import pl.vulcan.uonetmobile.model.requests.BaseRequest;

@SuppressWarnings("serial")
public class MobileApiRequest extends BaseRequest {
	@SerializedName(value = "PIN")
	private String f;
	@SerializedName(value = "TokenKey")
	private String g;
	@SerializedName(value = "Token")
	private String h;
	@SerializedName(value = "NadawcaWiadomosci")
	private String i;
	@SerializedName(value = "Tytul")
	private String j;
	@SerializedName(value = "Tresc")
	private String k;
	@SerializedName(value = "Adresaci")
	private MailAddress[] l;
	@SerializedName(value = "WiadomoscId")
	private Integer m;
	@SerializedName(value = "FolderWiadomosci")
	private String n;
	@SerializedName(value = "Status")
	private String o;
	@SerializedName(value = "DataPoczatkowa")
	private Object p;
	@SerializedName(value = "DataKoncowa")
	private Object q;
	@SerializedName(value = "LoginId")
	private Integer r;
	@SerializedName(value = "IdOddzial")
	private Integer s;
	@SerializedName(value = "IdOkresKlasyfikacyjny")
	private Integer t;
	@SerializedName(value = "IdUczen")
	private Integer u;
	@SerializedName(value = "PushOcena")
	private Boolean v;
	@SerializedName(value = "PushFrekwencja")
	private Boolean w;
	@SerializedName(value = "PushUwaga")
	private Boolean x;
	@SerializedName(value = "PushWiadomosc")
	private Boolean y;

	private MobileApiRequest() {
	}

	private MobileApiRequest(VulcanBot bot) {
		super(bot);
	}

	public static MobileApiRequest a(VulcanBot bot) {
		return new MobileApiRequest(bot);
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("MobileApiRequest{mRemoteMobileAppName='");
		stringBuilder.append(this.remoteMobileAppName);
		stringBuilder.append('\'');
		stringBuilder.append(", mRemoteMobileAppVersion='");
		stringBuilder.append(this.remoteMobileAppVersion);
		stringBuilder.append('\'');
		stringBuilder.append(", mRequestId='");
		stringBuilder.append(this.requestId);
		stringBuilder.append('\'');
		stringBuilder.append(", mTimeKey=");
		stringBuilder.append(this.timeKey);
		stringBuilder.append(", mRemoteTimeKey=");
		stringBuilder.append(this.remoteMobileTimeKey);
		stringBuilder.append(", mPupilId=");
		stringBuilder.append(this.u);
		stringBuilder.append(", mTermId=");
		stringBuilder.append(this.t);
		stringBuilder.append(", mClassId=");
		stringBuilder.append(this.s);
		stringBuilder.append(", mLoginId=");
		stringBuilder.append(this.r);
		stringBuilder.append(", mDateTo=");
		stringBuilder.append(this.q);
		stringBuilder.append(", mDateFrom=");
		stringBuilder.append(this.p);
		stringBuilder.append(", mStatus='");
		stringBuilder.append(this.o);
		stringBuilder.append('\'');
		stringBuilder.append(", mFolder='");
		stringBuilder.append(this.n);
		stringBuilder.append('\'');
		stringBuilder.append(", mMessageId=");
		stringBuilder.append(this.m);
		stringBuilder.append(", mReceivers='");
		stringBuilder.append(this.l);
		stringBuilder.append('\'');
		stringBuilder.append(", mContent='");
		stringBuilder.append(this.k);
		stringBuilder.append('\'');
		stringBuilder.append(", mTitle='");
		stringBuilder.append(this.j);
		stringBuilder.append('\'');
		stringBuilder.append(", mSender='");
		stringBuilder.append(this.i);
		stringBuilder.append('\'');
		stringBuilder.append(", mToken='");
		stringBuilder.append(this.h);
		stringBuilder.append('\'');
		stringBuilder.append(", mTokenKey='");
		stringBuilder.append(this.g);
		stringBuilder.append('\'');
		stringBuilder.append(", mPIN='");
		stringBuilder.append(this.f);
		stringBuilder.append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}

package ovh.adiantek.app.vulcanbot.api.resp;

import ovh.adiantek.app.vulcanbot.Certificate;

public class CertyfikatResponse {
	public boolean IsError;
	public boolean IsMessageForUser;
	public String Message;
	public String TokenKey;
	public String TokenStatus;
	public Certificate TokenCert;
}

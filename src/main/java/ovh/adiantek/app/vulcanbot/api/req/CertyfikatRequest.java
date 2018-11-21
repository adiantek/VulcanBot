package ovh.adiantek.app.vulcanbot.api.req;

import java.util.UUID;

import ovh.adiantek.app.vulcanbot.api.BaseRequest;
import ovh.adiantek.app.vulcanbot.api.resp.CertyfikatResponse;

public class CertyfikatRequest extends BaseRequest<CertyfikatResponse> {

	public String PIN;
	public String TokenKey;
	public String AppVersion = getRemoteMobileAppName();
	public String DeviceId = UUID.randomUUID().toString();
	public String DeviceName = "google#Pixel XL";
	public String DeviceNameUser = "";
	public String DeviceDescription = "";
	public String DeviceSystemType = "Android";
	public String DeviceSystemVersion = "9";

	@Override
	public String getPath() {
		return "Certyfikat";
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<CertyfikatResponse> getResponseClass() {
		return CertyfikatResponse.class;
	}

}

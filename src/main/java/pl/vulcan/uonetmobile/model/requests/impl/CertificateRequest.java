package pl.vulcan.uonetmobile.model.requests.impl;

import java.util.UUID;

import com.google.gson.annotations.SerializedName;

import ovh.adiantek.app.vulcanbot.VulcanBot;
import pl.vulcan.uonetmobile.model.requests.BaseRequest;

@SuppressWarnings("serial")
public class CertificateRequest extends BaseRequest {
	@SerializedName(value = "PIN")
	public String pin;
	@SerializedName(value = "TokenKey")
	public String tokenKey;
	@SerializedName(value = "AppVersion")
	public String appVersion = "VULCAN-Android-ModulUcznia";
	@SerializedName(value = "DeviceId")
	public String deviceId = UUID.randomUUID().toString();
	@SerializedName(value = "DeviceName")
	public String deviceName = "google#Pixel XL";
	@SerializedName(value = "DeviceNameUser")
	public String deviceNameUser = "";
	@SerializedName(value = "DeviceDescription")
	public String deviceDescription = "";
	@SerializedName(value = "DeviceSystemType")
	public String deviceSystemType = "Android";
	@SerializedName(value = "DeviceSystemVersion")
	public String deviceSystemVersion = "9";

	public CertificateRequest(VulcanBot bot) {
		super(bot);
//		throw new UnsupportedOperationException(
//				"Method not decompiled: pl.vulcan.uonetmobile.model.requests.impl.CertificateRequest.<init>(android.content.Context):void");
	}

//	public static CertificateRequest a(VulcanBot bot, String str, String str2) {
//		CertificateRequest certificateRequest = new CertificateRequest(bot);
//		certificateRequest.pin = str;
//		certificateRequest.tokenKey = str2;
//		return certificateRequest;
//	}
}

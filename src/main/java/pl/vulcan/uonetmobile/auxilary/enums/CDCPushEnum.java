package pl.vulcan.uonetmobile.auxilary.enums;

public enum CDCPushEnum {
	UNDEFINED("undefined"), GRADE("ocena"), NOTES("uwaga"), MAIL("wiadomosc"), ATTENDANCE("frekwencja");

	private String name;

	private CDCPushEnum(String name) {
		this.name = name;
	}

	public static CDCPushEnum a(String str) {
		for (CDCPushEnum cDCPushEnum : values()) {
			if (cDCPushEnum.a().equalsIgnoreCase(str)) {
				return cDCPushEnum;
			}
		}
		return UNDEFINED;
	}

	public String a() {
		return this.name;
	}
}

package ovh.adiantek.app.vulcanbot.api;

public class BaseResponse<T> {
	public String Status;
	public long TimeKey;
	public String TimeValue;
	public String RequestId;
	public int DayOfWeek;
	public String AppVersion;
	public T Data;
}

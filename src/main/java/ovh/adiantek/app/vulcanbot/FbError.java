package ovh.adiantek.app.vulcanbot;

public class FbError {
	public Integer error;
	public String errorSummary;
	public String errorDescription;

	@Override
	public String toString() {
		return String.format("FbError [error=%s, errorSummary=%s, errorDescription=%s]", error, errorSummary,
				errorDescription);
	}

}

package jp.co.myapp.api.app.data;

public class ExecuteResponseJson extends AbstractResponseJson {
	private String result = "0";
	private String entryNo = "";

	public ExecuteResponseJson() {
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getEntryNo() {
		return entryNo;
	}

	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}
}

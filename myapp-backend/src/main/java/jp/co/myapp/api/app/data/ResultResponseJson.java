package jp.co.myapp.api.app.data;


public class ResultResponseJson extends AbstractResponseJson {
    private AbstractResultData result;
    
	public ResultResponseJson(AbstractResultData result) {
		this.setResult(result);
	}

    public AbstractResultData getResult() {
        return result;
    }
    public void setResult(AbstractResultData result) {
        this.result = result;
    }
}

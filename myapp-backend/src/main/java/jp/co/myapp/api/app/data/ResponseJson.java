package jp.co.myapp.api.app.data;


public class ResponseJson extends AbstractResponseJson {

    private AbstractResultData result;

	public ResponseJson() {

	}
    
	public ResponseJson(AbstractResultData result) {

		this.setResult(result);
	}
    
    public AbstractResultData getResult() {
        return result;
    }
    public void setResult(AbstractResultData result) {
        this.result = result;
    }
	 
}

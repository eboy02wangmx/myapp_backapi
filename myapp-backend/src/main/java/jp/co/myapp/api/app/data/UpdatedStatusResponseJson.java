package jp.co.myapp.api.app.data;


public class UpdatedStatusResponseJson extends AbstractResponseJson {
    private String result = "0";
    
    public UpdatedStatusResponseJson() {
    }

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}

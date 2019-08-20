package jp.co.myapp.api.app.data.error;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jp.co.myapp.api.app.data.AbstractResponseJson;


@SuppressWarnings("serial")
public class ErrorResponseJson extends AbstractResponseJson implements Serializable {
	
    private List<ErrorInfoData> result;
    
    public List<ErrorInfoData> getResult() {
        return result;
    }
    public void setResult(List<ErrorInfoData> result) {
        this.result = result;
    }
    public void addErrors(ErrorInfoData error) {
    	if (result == null) {
    		result = new ArrayList<ErrorInfoData>();
    	}
        this.result.add(error);
    }
}

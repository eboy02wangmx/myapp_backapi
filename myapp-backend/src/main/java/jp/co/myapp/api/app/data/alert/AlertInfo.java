package jp.co.myapp.api.app.data.alert;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL) 
@SuppressWarnings("serial")
public class AlertInfo  implements Serializable, Comparable<AlertInfo> {
    private String parametersName;
    private String alertCode;
    private String messageDesc;
        
    public AlertInfo(String parametersName, String alertCode, String messageDesc) {
    	this.setParametersName(parametersName);
    	this.setAlertCode(alertCode);
    	this.setMessageDesc(messageDesc);
    }

    public String getParametersName() {
        return parametersName;
    }
    public void setParametersName(String parametersName) {
        this.parametersName = parametersName;
    }
    
    public String getAlertCode() {
        return alertCode;
    }
    public void setAlertCode(String alertCode) {
        this.alertCode = alertCode;
    }

    public String getMessageDesc() {
        return messageDesc;
    }
    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
    }
    
    @Override  
    public int compareTo(AlertInfo o) {
    	int result = parametersName.compareTo(o.getParametersName());
    	if (result == 0) {
    		result = alertCode.compareTo(o.getAlertCode());
    	}
    	
    	return result;  
    }  
}

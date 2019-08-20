package jp.co.myapp.api.app.data.error;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonInclude(Include.NON_NULL) 
@SuppressWarnings("serial")
public class ErrorInfoData implements Serializable, Comparable<ErrorInfoData> {
    private String param;
    private String errorid;
    private String discription;
    @JsonIgnore 
    private String[] msgParams;
    
    public ErrorInfoData(String param, String errorId) {
    	this.setParam(param);
    	this.setErrorId(errorId);
    }
    
    public ErrorInfoData(String param, String errorId, String discription) {
    	this.setParam(param);
    	this.setErrorId(errorId);
    	this.setDiscription(discription);
    }
    
    public ErrorInfoData(String param, String errorId, String[] params) {
        this.setParam(param);
        this.setErrorId(errorId);
        this.setMsgParams(params);
    }

    public String getParam() {
        return param;
    }
    public void setParam(String param) {
        this.param = param;
    }
    
    public String getErrorId() {
        return errorid;
    }
    public void setErrorId(String errorid) {
        this.errorid = errorid;
    }

    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
    }
    
    public String[] getMsgParams() {
        return msgParams;
    }
    public void setMsgParams(String[] msgParams) {
        this.msgParams = msgParams;
    }
    
    @Override  
    public int compareTo(ErrorInfoData o) {
    	int result = param.compareTo(o.getParam());
    	if (result == 0) {
    		result = errorid.compareTo(o.getErrorId());
    	}
    	
    	return result;  
    }  
}


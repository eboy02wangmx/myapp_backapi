package jp.co.myapp.api.app.data.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Fotter")
public class HaEvaluationXMLFooter {
	
	/**
	 * ErrorCode(errorCode)
	 */
	private String errorCode;

	/**
	 * ErrorName(errorName)
	 */
	private String errorName;

	/**
	 * ErrorMsg(errorMsg)
	 */
	private String errorMsg;

	/**
	 * ErrorCode(errorCode)の取得
	 * @return errorCode
	 */
	@XmlElement(name="ErrorCode")
	public String getErrorCode() {
	    return this.errorCode;
	}
	/**
	 * ErrorCode(errorCode)の設定
	 * @param errorCode String
	 */
	public void setErrorCode(String errorCode) {
	    this.errorCode = errorCode;
	}

	/**
	 * ErrorName(errorName)の取得
	 * @return errorName
	 */
	@XmlElement(name="ErrorName")
	public String getErrorName() {
	    return this.errorName;
	}
	/**
	 * ErrorName(errorName)の設定
	 * @param errorName String
	 */
	public void setErrorName(String errorName) {
	    this.errorName = errorName;
	}

	/**
	 * ErrorMsg(errorMsg)の取得
	 * @return errorMsg
	 */
	@XmlElement(name="ErrorMsg")
	public String getErrorMsg() {
	    return this.errorMsg;
	}
	/**
	 * ErrorMsg(errorMsg)の設定
	 * @param errorMsg String
	 */
	public void setErrorMsg(String errorMsg) {
	    this.errorMsg = errorMsg;
	}

}

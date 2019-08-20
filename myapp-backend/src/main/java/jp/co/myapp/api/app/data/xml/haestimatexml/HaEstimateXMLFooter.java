package jp.co.myapp.api.app.data.xml.haestimatexml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Fotter")
public class HaEstimateXMLFooter {

	/**
	 * エラーコード(errorCD)
	 */
	private String errorCode;

	/**
	 * エラーメッセージ(errorMsg)
	 */
	private String errorMsg;

	/**
	 * エラーコード(errorCode)の取得
	 *
	 * @return errorCode
	 */
	@XmlElement(name = "ErrorCode")
	public String getErrorCode() {
		return this.errorCode;
	}

	/**
	 * エラーコード(errorCode)の設定
	 *
	 * @param errorCode
	 *            String
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * エラーメッセージ(errorMsg)の取得
	 *
	 * @return errorMsg
	 */
	@XmlElement(name = "ErrorMsg")
	public String getErrorMsg() {
		return this.errorMsg;
	}

	/**
	 * エラーメッセージ(errorMsg)の設定
	 *
	 * @param errorMsg
	 *            String
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}

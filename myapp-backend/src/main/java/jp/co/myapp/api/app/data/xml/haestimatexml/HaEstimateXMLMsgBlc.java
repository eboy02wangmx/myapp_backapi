package jp.co.myapp.api.app.data.xml.haestimatexml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MsgBlc")
public class HaEstimateXMLMsgBlc {
	
	private String msgID;
	
	private String responseID;
	
	private String msgType;
	
	private String msgTimeStamp;
	

	/**
	 * MsgID(msgID)の取得
	 * @return msgID
	 */
	@XmlElement(name="MsgID")
	public String getMsgID() {
	    return this.msgID;
	}
	/**
	 * MsgID(msgID)の設定
	 * @param msgID String
	 */
	public void setMsgID(String msgID) {
	    this.msgID = msgID;
	}
	
	/**
	 * ResponseID(responseID)の取得
	 * @return responseID
	 */
	@XmlElement(name="ResponseID")
	public String getResponseID() {
	    return this.responseID;
	}
	/**
	 * ResponseID(responseID)の設定
	 * @param responseID String
	 */
	public void setResponseID(String responseID) {
	    this.responseID = responseID;
	}
	
	/**
	 * MsgType(msgType)の取得
	 * @return msgType
	 */
	@XmlElement(name="MsgType")
	public String getMsgType() {
	    return this.msgType;
	}
	/**
	 * MsgType(msgType)の設定
	 * @param msgType String
	 */
	public void setMsgType(String msgType) {
	    this.msgType = msgType;
	}
	
	/**
	 * MsgTimeStamp(msgTimeStamp)の取得
	 * @return msgTimeStamp
	 */
	@XmlElement(name="MsgTimeStamp")
	public String getMsgTimeStamp() {
	    return this.msgTimeStamp;
	}
	/**
	 * MsgTimeStamp(msgTimeStamp)の設定
	 * @param msgTimeStamp String
	 */
	public void setMsgTimeStamp(String msgTimeStamp) {
	    this.msgTimeStamp = msgTimeStamp;
	}
}

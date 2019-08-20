package jp.co.myapp.api.app.data.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Header")
public class HaEvaluationXMLHeader {

	private String ver = "1.0";
	
	private String xmlLang = "ja";
	
	private HaEvaluationXMLMsgBlc msgBlc;
	
	public HaEvaluationXMLHeader() {
		msgBlc = new HaEvaluationXMLMsgBlc();
	}
	
	/**
	 * verの取得
	 * @return ver
	 */
	@XmlAttribute(name="Ver")
	public String getVer() {
	    return this.ver;
	}
	/**
	 * verの設定
	 * @param var String
	 */
	public void setVer(String ver) {
	    this.ver = ver;
	}
	
	/**
	 * xmlLangの取得
	 * @return xmlLang
	 */
	@XmlAttribute(name="xml:lang")
	public String getXmlLang() {
	    return this.xmlLang;
	}
	/**
	 * xmlLangの設定
	 * @param xmlLang String
	 */
	public void setXmlLang(String xmlLang) {
	    this.xmlLang = xmlLang;
	}
	
	/**
	 * MsgID(msgID)の取得
	 * @return msgID
	 */
	@XmlElement(name="MsgBlc")
	public HaEvaluationXMLMsgBlc getMsgBlc() {
	    return this.msgBlc;
	}
	/**
	 * MsgID(msgID)の設定
	 * @param msgID String
	 */
	public void setMsgBlc(HaEvaluationXMLMsgBlc msgBlc) {
	    this.msgBlc = msgBlc;
	}
}

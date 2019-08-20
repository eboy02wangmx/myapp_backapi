package jp.co.myapp.api.app.data.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Message")
public class HaEvaluationXML {
	
	/**
	 * Header(header)
	 */
	private HaEvaluationXMLHeader header;

	/**
	 * Body(body)
	 */
	private HaEvaluationXMLBody body;

	/**
	 * Footer(footer)
	 */
	private HaEvaluationXMLFooter footer;
	
	public HaEvaluationXML() {
		header = new HaEvaluationXMLHeader();
		body = new HaEvaluationXMLBody();
		footer =  new HaEvaluationXMLFooter();
	}

	/**
	 * Header(header)の取得
	 * @return header
	 */
	@XmlElement(name="Header")
	public HaEvaluationXMLHeader getHeader() {
	    return this.header;
	}
	/**
	 * Header(header)の設定
	 * @param header String
	 */
	public void setHeader(HaEvaluationXMLHeader header) {
	    this.header = header;
	}

	/**
	 * Body(body)の取得
	 * @return body
	 */
	@XmlElement(name="Body")
	public HaEvaluationXMLBody getBody() {
	    return this.body;
	}
	/**
	 * Body(body)の設定
	 * @param body String
	 */
	public void setBody(HaEvaluationXMLBody body) {
	    this.body = body;
	}

	/**
	 * Footer(footer)の取得
	 * @return footer
	 */
	@XmlElement(name="Footer")
	public HaEvaluationXMLFooter getFooter() {
	    return this.footer;
	}
	/**
	 * Footer(footer)の設定
	 * @param footer String
	 */
	public void setFooter(HaEvaluationXMLFooter footer) {
	    this.footer = footer;
	}

}

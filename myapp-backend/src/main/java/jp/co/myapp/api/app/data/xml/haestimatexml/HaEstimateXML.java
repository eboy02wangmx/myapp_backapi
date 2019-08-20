package jp.co.myapp.api.app.data.xml.haestimatexml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Message")
public class HaEstimateXML {
	
	/**
	 * Header(header)
	 */
	private HaEstimateXMLHeader header;

	/**
	 * Body(body)
	 */
	private HaEstimateXMLBody body;

	/**
	 * Footer(footer)
	 */
	private HaEstimateXMLFooter footer;
	
	public HaEstimateXML() {
		header = new HaEstimateXMLHeader();
		body = new HaEstimateXMLBody();
		footer =  new HaEstimateXMLFooter();
	}

	/**
	 * Header(header)の取得
	 * @return header
	 */
	@XmlElement(name="Header")
	public HaEstimateXMLHeader getHeader() {
	    return this.header;
	}
	/**
	 * Header(header)の設定
	 * @param header String
	 */
	public void setHeader(HaEstimateXMLHeader header) {
	    this.header = header;
	}

	/**
	 * Body(body)の取得
	 * @return body
	 */
	@XmlElement(name="Body")
	public HaEstimateXMLBody getBody() {
	    return this.body;
	}
	/**
	 * Body(body)の設定
	 * @param body String
	 */
	public void setBody(HaEstimateXMLBody body) {
	    this.body = body;
	}

	/**
	 * Footer(footer)の取得
	 * @return footer
	 */
	@XmlElement(name="Footer")
	public HaEstimateXMLFooter getFooter() {
	    return this.footer;
	}
	/**
	 * Footer(footer)の設定
	 * @param footer String
	 */
	public void setFooter(HaEstimateXMLFooter footer) {
	    this.footer = footer;
	}

}

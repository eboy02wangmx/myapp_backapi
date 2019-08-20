package jp.co.myapp.api.app.data.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Body")
public class HaEvaluationXMLBody {
	
	private HaEvaluationXMLAppDataFormat appDataFormat;
	private HaEvaluationXMLResultBlc resultBlc;
	
	public HaEvaluationXMLBody() {
		appDataFormat = new HaEvaluationXMLAppDataFormat();
		resultBlc = new HaEvaluationXMLResultBlc();
	}
	
	/**
	 * appDataFormatの取得
	 * @return appDataFormat
	 */
	@XmlElement(name="AppDataFormat")
	public HaEvaluationXMLAppDataFormat getAppDataFormat() {
	    return this.appDataFormat;
	}
	/**
	 * appDataFormatの設定
	 * @param appDataFormat
	 */
	public void setAppDataFormat(HaEvaluationXMLAppDataFormat appDataFormat) {
	    this.appDataFormat = appDataFormat;
	}

	/**
	 * resultBlcの取得
	 * @return resultBlc
	 */
	@XmlElement(name="ResultBlc")
	public HaEvaluationXMLResultBlc getResultBlc() {
	    return this.resultBlc;
	}
	/**
	 * resultBlcrの設定
	 * @param resultBlcr
	 */
	public void setResultBlc(HaEvaluationXMLResultBlc resultBlc) {
	    this.resultBlc = resultBlc;
	}
}

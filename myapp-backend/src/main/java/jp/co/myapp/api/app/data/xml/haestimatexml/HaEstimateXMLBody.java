package jp.co.myapp.api.app.data.xml.haestimatexml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Body")
public class HaEstimateXMLBody {

	private HaEstimateXMLAppDataFormat appDataFormat;
	private HaEstimateXMLResultBlc resultBlc;

	public HaEstimateXMLBody() {
		appDataFormat = new HaEstimateXMLAppDataFormat();
		resultBlc = new HaEstimateXMLResultBlc();
	}

	/**
	 * appDataFormatの取得
	 * 
	 * @return appDataFormat
	 */
	@XmlElement(name = "AppDataFormat")
	public HaEstimateXMLAppDataFormat getAppDataFormat() {
		return this.appDataFormat;
	}

	/**
	 * appDataFormatの設定
	 * 
	 * @param appDataFormat
	 */
	public void setAppDataFormat(HaEstimateXMLAppDataFormat appDataFormat) {
		this.appDataFormat = appDataFormat;
	}

	/**
	 * resultBlcの取得
	 * 
	 * @return resultBlc
	 */
	@XmlElement(name = "ResultBlc")
	public HaEstimateXMLResultBlc getResultBlc() {
		return this.resultBlc;
	}

	/**
	 * resultBlcの設定
	 * 
	 * @param resultBlc
	 */
	public void setResultBlc(HaEstimateXMLResultBlc resultBlc) {
		this.resultBlc = resultBlc;
	}
}

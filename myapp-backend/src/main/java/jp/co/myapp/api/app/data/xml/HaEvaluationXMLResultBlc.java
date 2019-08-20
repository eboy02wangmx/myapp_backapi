package jp.co.myapp.api.app.data.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ResultBlc")
public class HaEvaluationXMLResultBlc {
	
	/**
	 * エラーコード(errorCD)
	 */
	private String errorCD = "0";

	/**
	 * 建物のみ評価額（調整率選択用）(tatemonoNomiHyokaGaku)
	 */
	private String tatemonoNomiHyokaGaku = "";

	/**
	 * 建物のみ評価額上限(tatemonoNomiHyokaGakuMax)
	 */
	private String tatemonoNomiHyokaGakuMax = "";

	/**
	 * 建物のみ評価額下限(tatemonoNomiHyokaGakuMin)
	 */
	private String tatemonoNomiHyokaGakuMin = "";

	/**
	 * 建物他の基本保険金額(tatemonoHokaAmt)
	 */
	private String tatemonoHokaAmt = "";

	/**
	 * 建物他の地震保険金額(tatemonoHokaJishinAmt)
	 */
	private String tatemonoHokaJishinAmt = "";

	/**
	 * 家財簡易評価額(kazaiKanniHyokagaku)
	 */
	private String kazaiKanniHyokagaku = "";

	/**
	 * 家財他の基本保険金額(kazaiHokaAmt)
	 */
	private String kazaiHokaAmt = "";

	/**
	 * 家財他の地震保険金額(kazaiHokaJishinAmt)
	 */
	private String kazaiHokaJishinAmt = "";

	/**
	 * 建物評価額算出結果(tatemonoHyokagakuResult)
	 */
	private String tatemonoHyokagakuResult = "";

	/**
	 * 家財評価額算出結果(kazaiHyokagakuResult)
	 */
	private String kazaiHyokagakuResult = "";

	/**
	 * 建物保険金額上限(tatemonoAmtMax)
	 */
	private String tatemonoAmtMax = "";

	/**
	 * 家財保険金額上限(kazaiAmtMax)
	 */
	private String kazaiAmtMax = "";

	/**
	 * エラーコード(errorCD)の取得
	 * @return errorCD
	 */
	@XmlElement(name="ErrorCD")
	public String getErrorCD() {
	    return this.errorCD;
	}
	/**
	 * エラーコード(errorCD)の設定
	 * @param errorCD String
	 */
	public void setErrorCD(String errorCD) {
	    this.errorCD = errorCD;
	}

	/**
	 * 建物のみ評価額（調整率選択用）(tatemonoNomiHyokaGaku)の取得
	 * @return tatemonoNomiHyokaGaku
	 */
	@XmlElement(name="TatemonoNomiHyokaGaku")
	public String getTatemonoNomiHyokaGaku() {
	    return this.tatemonoNomiHyokaGaku;
	}
	/**
	 * 建物のみ評価額（調整率選択用）(tatemonoNomiHyokaGaku)の設定
	 * @param tatemonoNomiHyokaGaku String
	 */
	public void setTatemonoNomiHyokaGaku(String tatemonoNomiHyokaGaku) {
	    this.tatemonoNomiHyokaGaku = tatemonoNomiHyokaGaku;
	}

	/**
	 * 建物のみ評価額上限(tatemonoNomiHyokaGakuMax)の取得
	 * @return tatemonoNomiHyokaGakuMax
	 */
	@XmlElement(name="TatemonoNomiHyokaGakuMax")
	public String getTatemonoNomiHyokaGakuMax() {
	    return this.tatemonoNomiHyokaGakuMax;
	}
	/**
	 * 建物のみ評価額上限(tatemonoNomiHyokaGakuMax)の設定
	 * @param tatemonoNomiHyokaGakuMax String
	 */
	public void setTatemonoNomiHyokaGakuMax(String tatemonoNomiHyokaGakuMax) {
	    this.tatemonoNomiHyokaGakuMax = tatemonoNomiHyokaGakuMax;
	}

	/**
	 * 建物のみ評価額下限(tatemonoNomiHyokaGakuMin)の取得
	 * @return tatemonoNomiHyokaGakuMin
	 */
	@XmlElement(name="TatemonoNomiHyokaGakuMin")
	public String getTatemonoNomiHyokaGakuMin() {
	    return this.tatemonoNomiHyokaGakuMin;
	}
	/**
	 * 建物のみ評価額下限(tatemonoNomiHyokaGakuMin)の設定
	 * @param tatemonoNomiHyokaGakuMin String
	 */
	public void setTatemonoNomiHyokaGakuMin(String tatemonoNomiHyokaGakuMin) {
	    this.tatemonoNomiHyokaGakuMin = tatemonoNomiHyokaGakuMin;
	}

	/**
	 * 建物他の基本保険金額(tatemonoHokaAmt)の取得
	 * @return tatemonoHokaAmt
	 */
	@XmlElement(name="TatemonoHokaAmt")
	public String getTatemonoHokaAmt() {
	    return this.tatemonoHokaAmt;
	}
	/**
	 * 建物他の基本保険金額(tatemonoHokaAmt)の設定
	 * @param tatemonoHokaAmt String
	 */
	public void setTatemonoHokaAmt(String tatemonoHokaAmt) {
	    this.tatemonoHokaAmt = tatemonoHokaAmt;
	}

	/**
	 * 建物他の地震保険金額(tatemonoHokaJishinAmt)の取得
	 * @return tatemonoHokaJishinAmt
	 */
	@XmlElement(name="TatemonoHokaJishinAmt")
	public String getTatemonoHokaJishinAmt() {
	    return this.tatemonoHokaJishinAmt;
	}
	/**
	 * 建物他の地震保険金額(tatemonoHokaJishinAmt)の設定
	 * @param tatemonoHokaJishinAmt String
	 */
	public void setTatemonoHokaJishinAmt(String tatemonoHokaJishinAmt) {
	    this.tatemonoHokaJishinAmt = tatemonoHokaJishinAmt;
	}

	/**
	 * 家財簡易評価額(kazaiKanniHyokagaku)の取得
	 * @return kazaiKanniHyokagaku
	 */
	@XmlElement(name="KazaiKanniHyokagaku")
	public String getKazaiKanniHyokagaku() {
	    return this.kazaiKanniHyokagaku;
	}
	/**
	 * 家財簡易評価額(kazaiKanniHyokagaku)の設定
	 * @param kazaiKanniHyokagaku String
	 */
	public void setKazaiKanniHyokagaku(String kazaiKanniHyokagaku) {
	    this.kazaiKanniHyokagaku = kazaiKanniHyokagaku;
	}

	/**
	 * 家財他の基本保険金額(kazaiHokaAmt)の取得
	 * @return kazaiHokaAmt
	 */
	@XmlElement(name="KazaiHokaAmt")
	public String getKazaiHokaAmt() {
	    return this.kazaiHokaAmt;
	}
	/**
	 * 家財他の基本保険金額(kazaiHokaAmt)の設定
	 * @param kazaiHokaAmt String
	 */
	public void setKazaiHokaAmt(String kazaiHokaAmt) {
	    this.kazaiHokaAmt = kazaiHokaAmt;
	}

	/**
	 * 家財他の地震保険金額(kazaiHokaJishinAmt)の取得
	 * @return kazaiHokaJishinAmt
	 */
	@XmlElement(name="KazaiHokaJishinAmt")
	public String getKazaiHokaJishinAmt() {
	    return this.kazaiHokaJishinAmt;
	}
	/**
	 * 家財他の地震保険金額(kazaiHokaJishinAmt)の設定
	 * @param kazaiHokaJishinAmt String
	 */
	public void setKazaiHokaJishinAmt(String kazaiHokaJishinAmt) {
	    this.kazaiHokaJishinAmt = kazaiHokaJishinAmt;
	}

	/**
	 * 建物評価額算出結果(tatemonoHyokagakuResult)の取得
	 * @return tatemonoHyokagakuResult
	 */
	@XmlElement(name="TatemonoHyokagakuResult")
	public String getTatemonoHyokagakuResult() {
	    return this.tatemonoHyokagakuResult;
	}
	/**
	 * 建物評価額算出結果(tatemonoHyokagakuResult)の設定
	 * @param tatemonoHyokagakuResult String
	 */
	public void setTatemonoHyokagakuResult(String tatemonoHyokagakuResult) {
	    this.tatemonoHyokagakuResult = tatemonoHyokagakuResult;
	}

	/**
	 * 家財評価額算出結果(kazaiHyokagakuResult)の取得
	 * @return kazaiHyokagakuResult
	 */
	@XmlElement(name="KazaiHyokagakuResult")
	public String getKazaiHyokagakuResult() {
	    return this.kazaiHyokagakuResult;
	}
	/**
	 * 家財評価額算出結果(kazaiHyokagakuResult)の設定
	 * @param kazaiHyokagakuResult String
	 */
	public void setKazaiHyokagakuResult(String kazaiHyokagakuResult) {
	    this.kazaiHyokagakuResult = kazaiHyokagakuResult;
	}

	/**
	 * 建物保険金額上限(tatemonoAmtMax)の取得
	 * @return tatemonoAmtMax
	 */
	@XmlElement(name="TatemonoAmtMax")
	public String getTatemonoAmtMax() {
	    return this.tatemonoAmtMax;
	}
	/**
	 * 建物保険金額上限(tatemonoAmtMax)の設定
	 * @param tatemonoAmtMax String
	 */
	public void setTatemonoAmtMax(String tatemonoAmtMax) {
	    this.tatemonoAmtMax = tatemonoAmtMax;
	}

	/**
	 * 家財保険金額上限(kazaiAmtMax)の取得
	 * @return kazaiAmtMax
	 */
	@XmlElement(name="KazaiAmtMax")
	public String getKazaiAmtMax() {
	    return this.kazaiAmtMax;
	}
	/**
	 * 家財保険金額上限(kazaiAmtMax)の設定
	 * @param kazaiAmtMax String
	 */
	public void setKazaiAmtMax(String kazaiAmtMax) {
	    this.kazaiAmtMax = kazaiAmtMax;
	}

}

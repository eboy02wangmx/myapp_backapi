package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class HaEvaluationQuaRequest implements Serializable {
	/**
	 * 画面ID(screenID)
	 */
    @CustomizeNoNull(message="E00002", params="{screenID.label;enter.event}")
    @CustomizeTypeSizeString(max=128, regexp="", message="E00001", params="{screenID.label;max.128;enter.event}")
	private String screenID;

	/**
	 * 申込依頼№(entryNo)
	 */
    @CustomizeNoNull(message="E00002", params="{entryNo.label;enter.event}")
    @CustomizeTypeSizeString(max = 6, regexp = "", message = "E00001", params = "{entryNo.label;max.6;enter.event}")
	private String entryNo;

	/**
	 * 建物地震保険加入有無(withBuildingEarthquakeInsurance)
	 */
    @CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withBuildingEarthquakeInsurance.label;max.1;enter.event}")
	private String withBuildingEarthquakeInsurance;

	/**
	 * 家財地震保険加入有無(withHouseholdEarthquakeInsurance)
	 */
    @CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withHouseholdEarthquakeInsurance.label;max.1;enter.event}")
	private String withHouseholdEarthquakeInsurance;

	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)
	 */
    @CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{confirmEarthquakeDiscount.label;max.1;enter.event}")
	private String confirmEarthquakeDiscount;

	/**
	 * 耐震等級割引等級(seismicGradeDiscountGrade)
	 */
    @CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{seismicGradeDiscountGrade.label;max.1;enter.event}")
	private String seismicGradeDiscountGrade;

	/**
	 * 耐震診断年月日(seismicDiagnosisDate)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'耐震診断年月日';'日付';'ご入力'}")
	@CustomizeTypeSizeString(max=8, regexp="", message="E00001", params="{seismicDiagnosisDate.label;max.8;enter.event}")
	private String seismicDiagnosisDate;

	/**
	 * 画面ID(screenID)の取得
	 * @return screenID
	 */
	public String getScreenID() {
	    return this.screenID;
	}
	/**
	 * 画面ID(screenID)の設定
	 * @param screenID String
	 */
	public void setScreenID(String screenID) {
	    this.screenID = screenID;
	}

	/**
	 * 申込依頼№(entryNo)の取得
	 * @return entryNo
	 */
	public String getEntryNo() {
	    return this.entryNo;
	}
	/**
	 * 申込依頼№(entryNo)の設定
	 * @param entryNo String
	 */
	public void setEntryNo(String entryNo) {
	    this.entryNo = entryNo;
	}

	/**
	 * 建物地震保険加入有無(withBuildingEarthquakeInsurance)の取得
	 * @return withBuildingEarthquakeInsurance
	 */
	public String getWithBuildingEarthquakeInsurance() {
	    return this.withBuildingEarthquakeInsurance;
	}
	/**
	 * 建物地震保険加入有無(withBuildingEarthquakeInsurance)の設定
	 * @param withBuildingEarthquakeInsurance String
	 */
	public void setWithBuildingEarthquakeInsurance(String withBuildingEarthquakeInsurance) {
	    this.withBuildingEarthquakeInsurance = withBuildingEarthquakeInsurance;
	}

	/**
	 * 家財地震保険加入有無(withHouseholdEarthquakeInsurance)の取得
	 * @return withHouseholdEarthquakeInsurance
	 */
	public String getWithHouseholdEarthquakeInsurance() {
	    return this.withHouseholdEarthquakeInsurance;
	}
	/**
	 * 家財地震保険加入有無(withHouseholdEarthquakeInsurance)の設定
	 * @param withHouseholdEarthquakeInsurance String
	 */
	public void setWithHouseholdEarthquakeInsurance(String withHouseholdEarthquakeInsurance) {
	    this.withHouseholdEarthquakeInsurance = withHouseholdEarthquakeInsurance;
	}

	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)の取得
	 * @return confirmEarthquakeDiscount
	 */
	public String getConfirmEarthquakeDiscount() {
	    return this.confirmEarthquakeDiscount;
	}
	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)の設定
	 * @param confirmEarthquakeDiscount String
	 */
	public void setConfirmEarthquakeDiscount(String confirmEarthquakeDiscount) {
	    this.confirmEarthquakeDiscount = confirmEarthquakeDiscount;
	}

	/**
	 * 耐震等級割引等級(seismicGradeDiscountGrade)の取得
	 * @return seismicGradeDiscountGrade
	 */
	public String getSeismicGradeDiscountGrade() {
	    return this.seismicGradeDiscountGrade;
	}
	/**
	 * 耐震等級割引等級(seismicGradeDiscountGrade)の設定
	 * @param seismicGradeDiscountGrade String
	 */
	public void setSeismicGradeDiscountGrade(String seismicGradeDiscountGrade) {
	    this.seismicGradeDiscountGrade = seismicGradeDiscountGrade;
	}

	/**
	 * 耐震診断年月日(seismicDiagnosisDate)の取得
	 * @return seismicDiagnosisDate
	 */
	public String getSeismicDiagnosisDate() {
	    return this.seismicDiagnosisDate;
	}
	/**
	 * 耐震診断年月日(seismicDiagnosisDate)の設定
	 * @param seismicDiagnosisDate String
	 */
	public void setSeismicDiagnosisDate(String seismicDiagnosisDate) {
	    this.seismicDiagnosisDate = seismicDiagnosisDate;
	}

}

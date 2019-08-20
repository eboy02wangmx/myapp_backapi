package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeInteger;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeLong;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

/**
 * 申込一時保存地震 リクエストパラメータ
 */
public class EntrySaveEarthquakeRequest extends BaseEntrySaveRequest implements Serializable {

	private static final long serialVersionUID = -3559749537004071427L;

	/**
	 * 保険始期日(startDate)
	 */
	@CustomizeTypeSizeString(max = 8, regexp = "", message = "E00001", params = "{startDate.label;max.8;enter.event}")
	private String startDate;

	/**
	 * 営業課店コード(salesCode)
	 */
    @CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{salesCode.label;salesCode.size;enter.event}")
	private String salesCode;

	/**
	 * 代理店コード(agentCode)
	 */
    @CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{agentCode.label;agentCode.size;enter.event}")
	private String agentCode;
	
	/**
	 * 代理店名称(agentName)
	 */
    @CustomizeTypeSizeString(max=20, regexp="", message="E00001", params="{agentName.label;agentName.size;enter.event}")
	private String agentName;

	/**
	 * 建物地震保険加入有無(withBuildingEarthquakeInsurance)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withBuildingEarthquakeInsurance.label;max.1;enter.event}")
	private String withBuildingEarthquakeInsurance;

	/**
	 * 家財地震保険加入有無(withHouseholdEarthquakeInsurance)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{withHouseholdEarthquakeInsurance.label;max.1;enter.event}")
	private String withHouseholdEarthquakeInsurance;

	/**
	 * 地震保険建物保険金額(earthquakeBuildingAmount)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{earthquakeBuildingAmount.label;max.9;enter.event}")
	private Long earthquakeBuildingAmount;

	/**
	 * 建物の地震保険保険金額（下限）(earthquakeBuildingAmountLower)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{earthquakeBuildingAmountLower.label;max.9;enter.event}")
	private Long earthquakeBuildingAmountLower;

	/**
	 * 建物の地震保険保険金額（上限）(earthquakeBuildingAmountUpper)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{earthquakeBuildingAmountUpper.label;max.9;enter.event}")
	private Long earthquakeBuildingAmountUpper;

	/**
	 * 地震保険家財保険金額(earthquakeHouseholdAmount)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{earthquakeHouseholdAmount.label;max.9;enter.event}")
	private Long earthquakeHouseholdAmount;

	/**
	 * 家財の地震保険保険金額（下限）(earthquakeHouseholdAmountLower)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{earthquakeHouseholdAmountLower.label;max.9;enter.event}")
	private Long earthquakeHouseholdAmountLower;

	/**
	 * 家財の地震保険保険金額（上限）(earthquakeHouseholdAmountUpper)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{earthquakeHouseholdAmountUpper.label;max.9;enter.event}")
	private Long earthquakeHouseholdAmountUpper;

	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{confirmEarthquakeDiscount.label;max.1;enter.event}")
	private String confirmEarthquakeDiscount;

	/**
	 * 地震保険割引率(earthquakeInsuranceDiscountPercent)
	 */
	@CustomizeTypeSizeInteger(max = 2, regexp = "", message = "E00001", params = "{earthquakeInsuranceDiscountPercent.label;max.2;enter.event}")
	private Integer earthquakeInsuranceDiscountPercent;

	/**
	 * 耐震等級割引等級(seismicGradeDiscountGrade)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{seismicGradeDiscountGrade.label;max.1;enter.event}")
	private String seismicGradeDiscountGrade;

	/**
	 * 耐震診断年月日(seismicDiagnosisDate)
	 */
	@CustomizeTypeSizeString(max = 8, regexp = "", message = "E00001", params = "{seismicDiagnosisDate.label;max.8;enter.event}")
	private String seismicDiagnosisDate;

	/**
	 * 建築年月確認済み(buildingDateConfirmed)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{buildingDateConfirmed.label;max.1;enter.event}")
	private String buildingDateConfirmed;

	/**
	 * 割引証明書類注意事項確認済み(discountCertificateConfirmed)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{discountCertificateConfirmed.label;max.1;enter.event}")
	private String discountCertificateConfirmed;

	/**
	 * 保険始期日(startDate)の取得
	 * 
	 * @return startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 保険始期日(startDate)の設定
	 * 
	 * @param startDate String
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * 営業課店コード(salesCode)の取得
	 * @return salesCode
	 */
	public String getSalesCode() {
	    return salesCode;
	}
	/**
	 * 営業課店コード(salesCode)の設定
	 * @param salesCode String
	 */
	public void setSalesCode(String salesCode) {
	    this.salesCode = salesCode;
	}
	
	/**
	 * 代理店コード(agentCode)の取得
	 * @return agentCode
	 */
	public String getAgentCode() {
	    return agentCode;
	}
	/**
	 * 代理店コード(agentCode)の設定
	 * @param agentCode String
	 */
	public void setAgentCode(String agentCode) {
	    this.agentCode = agentCode;
	}
	
	/**
	 * 代理店名称(agentName)の取得
	 * @return agentName
	 */
	public String getAgentName() {
	    return agentName;
	}
	/**
	 * 代理店名称(agentName)の設定
	 * @param agentName String
	 */
	public void setAgentName(String agentName) {
	    this.agentName = agentName;
	}

	/**
	 * 建物地震保険加入有無(withBuildingEarthquakeInsurance)の取得
	 * 
	 * @return withBuildingEarthquakeInsurance
	 */
	public String getWithBuildingEarthquakeInsurance() {
		return withBuildingEarthquakeInsurance;
	}

	/**
	 * 建物地震保険加入有無(withBuildingEarthquakeInsurance)の設定
	 * 
	 * @param withBuildingEarthquakeInsurance String
	 */
	public void setWithBuildingEarthquakeInsurance(String withBuildingEarthquakeInsurance) {
		this.withBuildingEarthquakeInsurance = withBuildingEarthquakeInsurance;
	}

	/**
	 * 家財地震保険加入有無(withHouseholdEarthquakeInsurance)の取得
	 * 
	 * @return withHouseholdEarthquakeInsurance
	 */
	public String getWithHouseholdEarthquakeInsurance() {
		return withHouseholdEarthquakeInsurance;
	}

	/**
	 * 家財地震保険加入有無(withHouseholdEarthquakeInsurance)の設定
	 * 
	 * @param withHouseholdEarthquakeInsurance String
	 */
	public void setWithHouseholdEarthquakeInsurance(String withHouseholdEarthquakeInsurance) {
		this.withHouseholdEarthquakeInsurance = withHouseholdEarthquakeInsurance;
	}

	/**
	 * 地震保険建物保険金額(earthquakeBuildingAmount)の取得
	 * 
	 * @return earthquakeBuildingAmount
	 */
	public Long getEarthquakeBuildingAmount() {
		return earthquakeBuildingAmount;
	}

	/**
	 * 地震保険建物保険金額(earthquakeBuildingAmount)の設定
	 * 
	 * @param earthquakeBuildingAmount Long
	 */
	public void setEarthquakeBuildingAmount(Long earthquakeBuildingAmount) {
		this.earthquakeBuildingAmount = earthquakeBuildingAmount;
	}

	/**
	 * 建物の地震保険保険金額（下限）(earthquakeBuildingAmountLower)の取得
	 * 
	 * @return earthquakeBuildingAmountLower
	 */
	public Long getEarthquakeBuildingAmountLower() {
		return earthquakeBuildingAmountLower;
	}

	/**
	 * 建物の地震保険保険金額（下限）(earthquakeBuildingAmountLower)の設定
	 * 
	 * @param earthquakeBuildingAmountLower Long
	 */
	public void setEarthquakeBuildingAmountLower(Long earthquakeBuildingAmountLower) {
		this.earthquakeBuildingAmountLower = earthquakeBuildingAmountLower;
	}

	/**
	 * 建物の地震保険保険金額（上限）(earthquakeBuildingAmountUpper)の取得
	 * 
	 * @return earthquakeBuildingAmountUpper
	 */
	public Long getEarthquakeBuildingAmountUpper() {
		return earthquakeBuildingAmountUpper;
	}

	/**
	 * 建物の地震保険保険金額（上限）(earthquakeBuildingAmountUpper)の設定
	 * 
	 * @param earthquakeBuildingAmountUpper Long
	 */
	public void setEarthquakeBuildingAmountUpper(Long earthquakeBuildingAmountUpper) {
		this.earthquakeBuildingAmountUpper = earthquakeBuildingAmountUpper;
	}

	/**
	 * 地震保険家財保険金額(earthquakeHouseholdAmount)の取得
	 * 
	 * @return earthquakeHouseholdAmount
	 */
	public Long getEarthquakeHouseholdAmount() {
		return earthquakeHouseholdAmount;
	}

	/**
	 * 地震保険家財保険金額(earthquakeHouseholdAmount)の設定
	 * 
	 * @param earthquakeHouseholdAmount Long
	 */
	public void setEarthquakeHouseholdAmount(Long earthquakeHouseholdAmount) {
		this.earthquakeHouseholdAmount = earthquakeHouseholdAmount;
	}

	/**
	 * 家財の地震保険保険金額（下限）(earthquakeHouseholdAmountLower)の取得
	 * 
	 * @return earthquakeHouseholdAmountLower
	 */
	public Long getEarthquakeHouseholdAmountLower() {
		return earthquakeHouseholdAmountLower;
	}

	/**
	 * 家財の地震保険保険金額（下限）(earthquakeHouseholdAmountLower)の設定
	 * 
	 * @param earthquakeHouseholdAmountLower Long
	 */
	public void setEarthquakeHouseholdAmountLower(Long earthquakeHouseholdAmountLower) {
		this.earthquakeHouseholdAmountLower = earthquakeHouseholdAmountLower;
	}

	/**
	 * 家財の地震保険保険金額（上限）(earthquakeHouseholdAmountUpper)の取得
	 * 
	 * @return earthquakeHouseholdAmountUpper
	 */
	public Long getEarthquakeHouseholdAmountUpper() {
		return earthquakeHouseholdAmountUpper;
	}

	/**
	 * 家財の地震保険保険金額（上限）(earthquakeHouseholdAmountUpper)の設定
	 * 
	 * @param earthquakeHouseholdAmountUpper Long
	 */
	public void setEarthquakeHouseholdAmountUpper(Long earthquakeHouseholdAmountUpper) {
		this.earthquakeHouseholdAmountUpper = earthquakeHouseholdAmountUpper;
	}

	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)の取得
	 * 
	 * @return confirmEarthquakeDiscount
	 */
	public String getConfirmEarthquakeDiscount() {
		return confirmEarthquakeDiscount;
	}

	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)の設定
	 * 
	 * @param confirmEarthquakeDiscount String
	 */
	public void setConfirmEarthquakeDiscount(String confirmEarthquakeDiscount) {
		this.confirmEarthquakeDiscount = confirmEarthquakeDiscount;
	}

	/**
	 * 地震保険割引率(earthquakeInsuranceDiscountPercent)の取得
	 * 
	 * @return earthquakeInsuranceDiscountPercent
	 */
	public Integer getEarthquakeInsuranceDiscountPercent() {
		return earthquakeInsuranceDiscountPercent;
	}

	/**
	 * 地震保険割引率(earthquakeInsuranceDiscountPercent)の設定
	 * 
	 * @param earthquakeInsuranceDiscountPercent Integer
	 */
	public void setEarthquakeInsuranceDiscountPercent(Integer earthquakeInsuranceDiscountPercent) {
		this.earthquakeInsuranceDiscountPercent = earthquakeInsuranceDiscountPercent;
	}

	/**
	 * 耐震等級割引等級(seismicGradeDiscountGrade)の取得
	 * 
	 * @return seismicGradeDiscountGrade
	 */
	public String getSeismicGradeDiscountGrade() {
		return seismicGradeDiscountGrade;
	}

	/**
	 * 耐震等級割引等級(seismicGradeDiscountGrade)の設定
	 * 
	 * @param seismicGradeDiscountGrade String
	 */
	public void setSeismicGradeDiscountGrade(String seismicGradeDiscountGrade) {
		this.seismicGradeDiscountGrade = seismicGradeDiscountGrade;
	}

	/**
	 * 耐震診断年月日(seismicDiagnosisDate)の取得
	 * 
	 * @return seismicDiagnosisDate
	 */
	public String getSeismicDiagnosisDate() {
		return seismicDiagnosisDate;
	}

	/**
	 * 耐震診断年月日(seismicDiagnosisDate)の設定
	 * 
	 * @param seismicDiagnosisDate String
	 */
	public void setSeismicDiagnosisDate(String seismicDiagnosisDate) {
		this.seismicDiagnosisDate = seismicDiagnosisDate;
	}

	/**
	 * 建築年月確認済み(buildingDateConfirmed)の取得
	 * 
	 * @return buildingDateConfirmed
	 */
	public String getBuildingDateConfirmed() {
		return buildingDateConfirmed;
	}

	/**
	 * 建築年月確認済み(buildingDateConfirmed)の設定
	 * 
	 * @param buildingDateConfirmed String
	 */
	public void setBuildingDateConfirmed(String buildingDateConfirmed) {
		this.buildingDateConfirmed = buildingDateConfirmed;
	}

	/**
	 * 割引証明書類注意事項確認済み(discountCertificateConfirmed)の取得
	 * 
	 * @return discountCertificateConfirmed
	 */
	public String getDiscountCertificateConfirmed() {
		return discountCertificateConfirmed;
	}

	/**
	 * 割引証明書類注意事項確認済み(discountCertificateConfirmed)の設定
	 * 
	 * @param discountCertificateConfirmed String
	 */
	public void setDiscountCertificateConfirmed(String discountCertificateConfirmed) {
		this.discountCertificateConfirmed = discountCertificateConfirmed;
	}
}

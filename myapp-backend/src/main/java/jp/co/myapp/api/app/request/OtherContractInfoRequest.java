package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

/**
 * 申込一時保存他契約情報 リクエストパラメータ
 */
public class OtherContractInfoRequest extends BaseEntrySaveRequest implements Serializable {

	private static final long serialVersionUID = 3946388810251155282L;

	/**
	 * 申込依頼№(entryNo)
	 */
	private String entryNo;
	
	/**
	 * 一時保存画面ID(screenID)
	 */
	@CustomizeNoNull(message="E00002", params="{screenID.label;enter.event}")
	@CustomizeTypeSizeString(max = 128, regexp = "", message = "E00001", params = "{screenID.label;max.128;enter.event}")
	private String screenID;

	/**
	 * 他契約有無(withOtherContract)
	 */
	@CustomizeNoNull(message="E00002", params="{withOtherContract.label;enter.event}")
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{withOtherContract.label;max.1;enter.event}")
	private String withOtherContract;

	/**
	 * 保険の種類カナ1(insuranceTypeKanaFirst)
	 */
	private String insuranceTypeKanaFirst;

	/**
	 * 保険会社カナ1(insuranceCompanyKanaFirst)
	 */
	private String insuranceCompanyKanaFirst;

	/**
	 * 楽天損保1(myappFirst)
	 */
	private String myappFirst;

	/**
	 * 保険の対象1(insuranceTargetFirst)
	 */
	private String insuranceTargetFirst;

	/**
	 * 基本保険金額1(basicInsuranceAmountFirst)
	 */
	private Long basicInsuranceAmountFirst;

	/**
	 * 地震保険金額1(earthquakeInsuranceAmountFirst)
	 */
	private Long earthquakeInsuranceAmountFirst;

	/**
	 * 満期日1(dueDateFirst)
	 */
	private String dueDateFirst;
	
	/**
	 * 2件目入力有無(withSecondOtherContract)
	 */
	private String withSecondOtherContract;

	/**
	 * 保険の種類カナ2(insuranceTypeKanaSecond)
	 */
	private String insuranceTypeKanaSecond;

	/**
	 * 保険会社カナ2(insuranceCompanyKanaSecond)
	 */
	private String insuranceCompanyKanaSecond;

	/**
	 * 楽天損保2(myappSecond)
	 */
	private String myappSecond;

	/**
	 * 保険の対象2(insuranceTargetSecond)
	 */
	private String insuranceTargetSecond;

	/**
	 * 基本保険金額2(basicInsuranceAmountSecond)
	 */
	private Long basicInsuranceAmountSecond;

	/**
	 * 地震保険金額2(earthquakeInsuranceAmountSecond)
	 */
	private Long earthquakeInsuranceAmountSecond;

	/**
	 * 満期日2(dueDateSecond)
	 */
	private String dueDateSecond;

	/**
	 * 始期日(startDate)
	 */
	private String startDate;

	/**
	 * 保険期間(confirmTerm)
	 */
	private String confirmTerm;

	/**
	 * 申込依頼№(entryNo)の取得
	 * @return entryNo
	 */
	public String getEntryNo() {
	    return entryNo;
	}
	/**
	 * 申込依頼№(entryNo)の設定
	 * @param entryNo String
	 */
	public void setEntryNo(String entryNo) {
	    this.entryNo = entryNo;
	}

	/**
	 * 一時保存画面ID(screenID)の取得
	 * @return screenID
	 */
	public String getScreenID() {
	    return screenID;
	}
	/**
	 * 一時保存画面ID(screenID)の設定
	 * @param screenID String
	 */
	public void setScreenID(String screenID) {
	    this.screenID = screenID;
	}

	/**
	 * 他契約有無(withOtherContract)の取得
	 * @return withOtherContract
	 */
	public String getWithOtherContract() {
	    return withOtherContract;
	}
	/**
	 * 他契約有無(withOtherContract)の設定
	 * @param withOtherContract String
	 */
	public void setWithOtherContract(String withOtherContract) {
	    this.withOtherContract = withOtherContract;
	}

	/**
	 * 保険の種類カナ1(insuranceTypeKanaFirst)の取得
	 * @return insuranceTypeKanaFirst
	 */
	public String getInsuranceTypeKanaFirst() {
	    return insuranceTypeKanaFirst;
	}
	/**
	 * 保険の種類カナ1(insuranceTypeKanaFirst)の設定
	 * @param insuranceTypeKanaFirst String
	 */
	public void setInsuranceTypeKanaFirst(String insuranceTypeKanaFirst) {
	    this.insuranceTypeKanaFirst = insuranceTypeKanaFirst;
	}

	/**
	 * 保険会社カナ1(insuranceCompanyKanaFirst)の取得
	 * @return insuranceCompanyKanaFirst
	 */
	public String getInsuranceCompanyKanaFirst() {
	    return insuranceCompanyKanaFirst;
	}
	/**
	 * 保険会社カナ1(insuranceCompanyKanaFirst)の設定
	 * @param insuranceCompanyKanaFirst String
	 */
	public void setInsuranceCompanyKanaFirst(String insuranceCompanyKanaFirst) {
	    this.insuranceCompanyKanaFirst = insuranceCompanyKanaFirst;
	}

	/**
	 * 楽天損保1(myappFirst)の取得
	 * @return myappFirst
	 */
	public String getmyappFirst() {
	    return myappFirst;
	}
	/**
	 * 楽天損保1(myappFirst)の設定
	 * @param myappFirst String
	 */
	public void setmyappFirst(String myappFirst) {
	    this.myappFirst = myappFirst;
	}

	/**
	 * 保険の対象1(insuranceTargetFirst)の取得
	 * @return insuranceTargetFirst
	 */
	public String getInsuranceTargetFirst() {
	    return insuranceTargetFirst;
	}
	/**
	 * 保険の対象1(insuranceTargetFirst)の設定
	 * @param insuranceTargetFirst String
	 */
	public void setInsuranceTargetFirst(String insuranceTargetFirst) {
	    this.insuranceTargetFirst = insuranceTargetFirst;
	}

	/**
	 * 基本保険金額1(basicInsuranceAmountFirst)の取得
	 * @return basicInsuranceAmountFirst
	 */
	public Long getBasicInsuranceAmountFirst() {
	    return basicInsuranceAmountFirst;
	}
	/**
	 * 基本保険金額1(basicInsuranceAmountFirst)の設定
	 * @param basicInsuranceAmountFirst Long
	 */
	public void setBasicInsuranceAmountFirst(Long basicInsuranceAmountFirst) {
	    this.basicInsuranceAmountFirst = basicInsuranceAmountFirst;
	}

	/**
	 * 地震保険金額1(earthquakeInsuranceAmountFirst)の取得
	 * @return earthquakeInsuranceAmountFirst
	 */
	public Long getEarthquakeInsuranceAmountFirst() {
	    return earthquakeInsuranceAmountFirst;
	}
	/**
	 * 地震保険金額1(earthquakeInsuranceAmountFirst)の設定
	 * @param earthquakeInsuranceAmountFirst Long
	 */
	public void setEarthquakeInsuranceAmountFirst(Long earthquakeInsuranceAmountFirst) {
	    this.earthquakeInsuranceAmountFirst = earthquakeInsuranceAmountFirst;
	}

	/**
	 * 満期日1(dueDateFirst)の取得
	 * @return dueDateFirst
	 */
	public String getDueDateFirst() {
	    return dueDateFirst;
	}
	/**
	 * 満期日1(dueDateFirst)の設定
	 * @param dueDateFirst String
	 */
	public void setDueDateFirst(String dueDateFirst) {
	    this.dueDateFirst = dueDateFirst;
	}

	/**
	 * 2件目入力有無(withSecondOtherContract)の取得
	 * @return withSecondOtherContract
	 */
	public String getWithSecondOtherContract() {
	    return withSecondOtherContract;
	}
	/**
	 * 2件目入力有無(withSecondOtherContract)の設定
	 * @param withSecondOtherContract String
	 */
	public void setWithSecondOtherContract(String withSecondOtherContract) {
	    this.withSecondOtherContract = withSecondOtherContract;
	}
	
	/**
	 * 保険の種類カナ2(insuranceTypeKanaSecond)の取得
	 * @return insuranceTypeKanaSecond
	 */
	public String getInsuranceTypeKanaSecond() {
	    return insuranceTypeKanaSecond;
	}
	/**
	 * 保険の種類カナ2(insuranceTypeKanaSecond)の設定
	 * @param insuranceTypeKanaSecond String
	 */
	public void setInsuranceTypeKanaSecond(String insuranceTypeKanaSecond) {
	    this.insuranceTypeKanaSecond = insuranceTypeKanaSecond;
	}

	/**
	 * 保険会社カナ2(insuranceCompanyKanaSecond)の取得
	 * @return insuranceCompanyKanaSecond
	 */
	public String getInsuranceCompanyKanaSecond() {
	    return insuranceCompanyKanaSecond;
	}
	/**
	 * 保険会社カナ2(insuranceCompanyKanaSecond)の設定
	 * @param insuranceCompanyKanaSecond String
	 */
	public void setInsuranceCompanyKanaSecond(String insuranceCompanyKanaSecond) {
	    this.insuranceCompanyKanaSecond = insuranceCompanyKanaSecond;
	}

	/**
	 * 楽天損保2(myappSecond)の取得
	 * @return myappSecond
	 */
	public String getmyappSecond() {
	    return myappSecond;
	}
	/**
	 * 楽天損保2(myappSecond)の設定
	 * @param myappSecond String
	 */
	public void setmyappSecond(String myappSecond) {
	    this.myappSecond = myappSecond;
	}

	/**
	 * 保険の対象2(insuranceTargetSecond)の取得
	 * @return insuranceTargetSecond
	 */
	public String getInsuranceTargetSecond() {
	    return insuranceTargetSecond;
	}
	/**
	 * 保険の対象2(insuranceTargetSecond)の設定
	 * @param insuranceTargetSecond String
	 */
	public void setInsuranceTargetSecond(String insuranceTargetSecond) {
	    this.insuranceTargetSecond = insuranceTargetSecond;
	}

	/**
	 * 基本保険金額2(basicInsuranceAmountSecond)の取得
	 * @return basicInsuranceAmountSecond
	 */
	public Long getBasicInsuranceAmountSecond() {
	    return basicInsuranceAmountSecond;
	}
	/**
	 * 基本保険金額2(basicInsuranceAmountSecond)の設定
	 * @param basicInsuranceAmountSecond Long
	 */
	public void setBasicInsuranceAmountSecond(Long basicInsuranceAmountSecond) {
	    this.basicInsuranceAmountSecond = basicInsuranceAmountSecond;
	}

	/**
	 * 地震保険金額2(earthquakeInsuranceAmountSecond)の取得
	 * @return earthquakeInsuranceAmountSecond
	 */
	public Long getEarthquakeInsuranceAmountSecond() {
	    return earthquakeInsuranceAmountSecond;
	}
	/**
	 * 地震保険金額2(earthquakeInsuranceAmountSecond)の設定
	 * @param earthquakeInsuranceAmountSecond Long
	 */
	public void setEarthquakeInsuranceAmountSecond(Long earthquakeInsuranceAmountSecond) {
	    this.earthquakeInsuranceAmountSecond = earthquakeInsuranceAmountSecond;
	}

	/**
	 * 満期日2(dueDateSecond)の取得
	 * @return dueDateSecond
	 */
	public String getDueDateSecond() {
	    return dueDateSecond;
	}
	/**
	 * 満期日2(dueDateSecond)の設定
	 * @param dueDateSecond String
	 */
	public void setDueDateSecond(String dueDateSecond) {
	    this.dueDateSecond = dueDateSecond;
	}

	/**
	 * 始期日(startDate)の取得
	 * @return startDate
	 */
	public String getStartDate() {
	    return startDate;
	}
	/**
	 * 始期日(startDate)の設定
	 * @param startDate String
	 */
	public void setStartDate(String startDate) {
	    this.startDate = startDate;
	}

	/**
	 * 保険期間(confirmTerm)の取得
	 * @return confirmTerm
	 */
	public String getConfirmTerm() {
	    return confirmTerm;
	}
	/**
	 * 保険期間(confirmTerm)の設定
	 * @param confirmTerm String
	 */
	public void setConfirmTerm(String confirmTerm) {
	    this.confirmTerm = confirmTerm;
	}

}

package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class HaEvaluationRequest implements Serializable {

	/**
	 * 画面ID(screenID)
	 */
    @CustomizeTypeSizeString(max=128, regexp="", message="E00001", params="{screenID.label;max.128;enter.event}")
	private String screenID;

	/**
	 * お申込依頼№(entryNo)
	 */
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;max.6;enter.event}")
	private String entryNo;

	/**
	 * 申込区分(entryType)
	 */
	private String entryType;

	/**
	 * 建物火災保険加入有無(withBuildingFireInsurance)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withBuildingFireInsurance.label;max.1;enter.event}")
	private String withBuildingFireInsurance;

	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withNewBuildingValueKnown.label;max.1;enter.event}")
	private String withNewBuildingValueKnown;

	/**
	 * マンション評価基準(apartmentClassification)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{apartmentClassification.label;max.1;enter.event}")
	private String apartmentClassification;

	/**
	 * 門・塀・車庫価額(fenceValue)
	 */
	@CustomizeTypeSizeString(max=5, regexp="", message="E00001", params="{fenceValue.label;max.5;enter.event}")
	private String fenceValue;

	/**
	 * 新築時の建築価額(newBuildingValue)
	 */
	@CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{newBuildingValue.label;max.10;enter.event}")
	private String newBuildingValue;

	/**
	 * 基礎工事含む(includFoundationWork)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{includFoundationWork.label;max.1;enter.event}")
	private String includFoundationWork;

	/**
	 * 家財火災保険加入有無(withHouseholdFireInsurance)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withHouseholdFireInsurance.label;max.1;enter.event}")
	private String withHouseholdFireInsurance;

	/**
	 * 世帯主年令(householderAge)
	 */
	@CustomizeTypeSizeString(max=3, regexp="", message="E00001", params="{householderAge.label;max.3;enter.event}")
	private String householderAge;

	/**
	 * 配偶者有無(withSpouse)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{withSpouse.label;max.1;enter.event}")
	private String withSpouse;

	/**
	 * 子供人数(numberOfChildren)
	 */
	@CustomizeTypeSizeString(max=2, regexp="", message="E00001", params="{numberOfChildren.label;max.2;enter.event}")
	private String numberOfChildren;

	/**
	 * 同居人人数(housemates)
	 */
	@CustomizeTypeSizeString(max=2, regexp="", message="E00001", params="{housemates.label;max.2;enter.event}")
	private String housemates;

//	/**
//	 * 評価法区分(hyoka_kbn)
//	 */
//	private String methodType;

	/**
	 * その他評価法の建物保険金額(otherMethodBuildingAmount)
	 */
	private String otherMethodBuildingAmount;

	/**
	 * その他評価法根拠(other_konkyo)
	 */
	private String otherMethodBasis;

	/**
	 * 協定再調達価額(policyCurrentReplacementValue)
	 */
	@CustomizeTypeSizeString(max=9, regexp="", message="E00001", params="{policyCurrentReplacementValue.label;max.9;enter.event}")
	private String policyCurrentReplacementValue;

	/**
	 * 保険始期日(startDate)
	 */
	@CustomizeTypeSizeString(max=8, regexp="", message="E00001", params="{startDate.label;max.8;enter.event}")
	private String startDate;

	/**
	 * 建物所在地(buildingLocation)
	 */
	@CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{buildingLocation.label;max.10;enter.event}")
	private String buildingLocation;

	/**
	 * 構造級別(structureGrade)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{structureGrade.label;max.1;enter.event}")
	private String structureGrade;

	/**
	 * 建物用法(buildingUsage)
	 */
	private String buildingUsage;

	/**
	 * 建物形態(buildingFrom)
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{buildingFrom.label;max.1;enter.event}")
	private String buildingFrom;

	/**
	 * 建物階数(buildingFloor)
	 */
	@CustomizeTypeSizeString(max=3, regexp="", message="E00001", params="{buildingFloor.label;max.3;enter.event}")
	private String buildingFloor;

	/**
	 * 建物建築年月(buildingDate)
	 */
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{buildingBuildingDate.label;max.6;enter.event}")
	private String buildingBuildingDate;

	/**
	 * 建物面積(buildingArea)
	 */
	@CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{buildingArea.label;max.10;enter.event}")
	private String buildingArea;

	/**
	 * 他契約保険総金額
	 */
    private String otherContractAmount;
    /**
     * 其の他契約保険Type
     */
    private String insuranceTargetFirst;
    private String insuranceTargetSecond;
    /**
     * 其の他契約保険金額
     */
    private String basicInsuranceAmountFirst;
    private String earthquakeInsuranceAmountFirst;
    private String basicInsuranceAmountSecond;
    private String earthquakeInsuranceAmountSecond;

	/**
	 * 画面ID(screenID)の取得
	 * @return screenID
	 */
	public String getScreenID() {
		return screenID;
	}
	/**
	 * 画面ID(screenID)の設定
	 * @param screenID String
	 */
	public void setScreenID(String screenID) {
		this.screenID = screenID;
	}

	/**
	 * お申込依頼№(entryNo)の取得
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}
	/**
	 * お申込依頼№(entryNo)の設定
	 * @param entryNo String
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 申込区分(entryType)の取得
	 *
	 * @return entryType
	 */
	public String getEntryType() {
		return entryType;
	}
	/**
	 * 申込区分(entryType)の設定
	 *
	 * @param entryType
	 *            String
	 */
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	/**
	 * 建物火災保険加入有無(withBuildingFireInsurance)の取得
	 * @return withBuildingFireInsurance
	 */
	public String getWithBuildingFireInsurance() {
	    return this.withBuildingFireInsurance;
	}
	/**
	 * 建物火災保険加入有無(withBuildingFireInsurance)の設定
	 * @param withBuildingFireInsurance String
	 */
	public void setWithBuildingFireInsurance(String withBuildingFireInsurance) {
	    this.withBuildingFireInsurance = withBuildingFireInsurance;
	}

	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)の取得
	 * @return withNewBuildingValueKnown
	 */
	public String getWithNewBuildingValueKnown() {
	    return this.withNewBuildingValueKnown;
	}
	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)の設定
	 * @param withNewBuildingValueKnown String
	 */
	public void setWithNewBuildingValueKnown(String withNewBuildingValueKnown) {
	    this.withNewBuildingValueKnown = withNewBuildingValueKnown;
	}

	/**
	 * マンション評価基準(apartmentClassification)の取得
	 * @return apartmentClassification
	 */
	public String getApartmentClassification() {
	    return this.apartmentClassification;
	}
	/**
	 * マンション評価基準(apartmentClassification)の設定
	 * @param apartmentClassification String
	 */
	public void setApartmentClassification(String apartmentClassification) {
	    this.apartmentClassification = apartmentClassification;
	}

	/**
	 * 門・塀・車庫価額(fenceValue)の取得
	 * @return fenceValue
	 */
	public String getFenceValue() {
	    return this.fenceValue;
	}
	/**
	 * 門・塀・車庫価額(fenceValue)の設定
	 * @param fenceValue String
	 */
	public void setFenceValue(String fenceValue) {
	    this.fenceValue = fenceValue;
	}

	/**
	 * 新築時の建築価額(newBuildingValue)の取得
	 * @return newBuildingValue
	 */
	public String getNewBuildingValue() {
	    return this.newBuildingValue;
	}
	/**
	 * 新築時の建築価額(newBuildingValue)の設定
	 * @param newBuildingValue String
	 */
	public void setNewBuildingValue(String newBuildingValue) {
	    this.newBuildingValue = newBuildingValue;
	}

	/**
	 * 基礎工事含む(includFoundationWork)の取得
	 * @return includFoundationWork
	 */
	public String getIncludFoundationWork() {
	    return this.includFoundationWork;
	}
	/**
	 * 基礎工事含む(includFoundationWork)の設定
	 * @param includFoundationWork String
	 */
	public void setIncludFoundationWork(String includFoundationWork) {
	    this.includFoundationWork = includFoundationWork;
	}

	/**
	 * 家財火災保険加入有無(withHouseholdFireInsurance)の取得
	 * @return withHouseholdFireInsurance
	 */
	public String getWithHouseholdFireInsurance() {
	    return this.withHouseholdFireInsurance;
	}
	/**
	 * 家財火災保険加入有無(withHouseholdFireInsurance)の設定
	 * @param withHouseholdFireInsurance String
	 */
	public void setWithHouseholdFireInsurance(String withHouseholdFireInsurance) {
	    this.withHouseholdFireInsurance = withHouseholdFireInsurance;
	}

	/**
	 * 世帯主年令(householderAge)の取得
	 * @return householderAge
	 */
	public String getHouseholderAge() {
	    return this.householderAge;
	}
	/**
	 * 世帯主年令(householderAge)の設定
	 * @param householderAge String
	 */
	public void setHouseholderAge(String householderAge) {
	    this.householderAge = householderAge;
	}

	/**
	 * 配偶者有無(withSpouse)の取得
	 * @return withSpouse
	 */
	public String getWithSpouse() {
	    return this.withSpouse;
	}
	/**
	 * 配偶者有無(withSpouse)の設定
	 * @param withSpouse String
	 */
	public void setWithSpouse(String withSpouse) {
	    this.withSpouse = withSpouse;
	}

	/**
	 * 子供人数(numberOfChildren)の取得
	 * @return numberOfChildren
	 */
	public String getNumberOfChildren() {
	    return this.numberOfChildren;
	}
	/**
	 * 子供人数(numberOfChildren)の設定
	 * @param numberOfChildren String
	 */
	public void setNumberOfChildren(String numberOfChildren) {
	    this.numberOfChildren = numberOfChildren;
	}

	/**
	 * 同居人人数(housemates)の取得
	 * @return housemates
	 */
	public String getHousemates() {
	    return this.housemates;
	}
	/**
	 * 同居人人数(housemates)の設定
	 * @param housemates String
	 */
	public void setHousemates(String housemates) {
	    this.housemates = housemates;
	}

//	/**
//	 * 評価法区分(hyoka_kbn)の取得
//	 * @return methodType
//	 */
//	public String getMethodType() {
//	    return methodType;
//	}
//	/**
//	 * 評価法区分(hyoka_kbn)の設定
//	 * @param methodType String
//	 */
//	public void setMethodType(String methodType) {
//	    this.methodType = methodType;
//	}

	/**
	 * その他評価法の建物保険金額(otherMethodBuildingAmount)の取得
	 * @return otherMethodBuildingAmount
	 */
	public String getOtherMethodBuildingAmount() {
	    return otherMethodBuildingAmount;
	}
	/**
	 * その他評価法の建物保険金額(otherMethodBuildingAmount)の設定
	 * @param otherMethodBuildingAmount String
	 */
	public void setOtherMethodBuildingAmount(String otherMethodBuildingAmount) {
	    this.otherMethodBuildingAmount = otherMethodBuildingAmount;
	}

	/**
	 * その他評価法根拠(other_konkyo)の取得
	 * @return otherMethodBasis
	 */
	public String getOtherMethodBasis() {
	    return otherMethodBasis;
	}
	/**
	 * その他評価法根拠(other_konkyo)の設定
	 * @param otherMethodBasis String
	 */
	public void setOtherMethodBasis(String otherMethodBasis) {
	    this.otherMethodBasis = otherMethodBasis;
	}

	/**
	 * 協定再調達価額(policyCurrentReplacementValue)の取得
	 * @return policyCurrentReplacementValue
	 */
	public String getPolicyCurrentReplacementValue() {
	    return this.policyCurrentReplacementValue;
	}
	/**
	 * 協定再調達価額(policyCurrentReplacementValue)の設定
	 * @param policyCurrentReplacementValue String
	 */
	public void setPolicyCurrentReplacementValue(String policyCurrentReplacementValue) {
	    this.policyCurrentReplacementValue = policyCurrentReplacementValue;
	}

	/**
	 * 保険始期日(startDate)の取得
	 * @return startDate
	 */
	public String getStartDate() {
	    return this.startDate;
	}
	/**
	 * 保険始期日(startDate)の設定
	 * @param startDate String
	 */
	public void setStartDate(String startDate) {
	    this.startDate = startDate;
	}

	/**
	 * 建物所在地(buildingLocation)の取得
	 * @return buildingLocation
	 */
	public String getBuildingLocation() {
	    return this.buildingLocation;
	}
	/**
	 * 建物所在地(buildingLocation)の設定
	 * @param buildingLocation String
	 */
	public void setBuildingLocation(String buildingLocation) {
	    this.buildingLocation = buildingLocation;
	}

	/**
	 * 構造級別(structureGrade)の取得
	 * @return structureGrade
	 */
	public String getStructureGrade() {
	    return this.structureGrade;
	}
	/**
	 * 構造級別(structureGrade)の設定
	 * @param structureGrade String
	 */
	public void setStructureGrade(String structureGrade) {
	    this.structureGrade = structureGrade;
	}

	/**
	 * 建物用法(buildingUsage)の取得
	 *
	 * @return buildingUsage
	 */
	public String getBuildingUsage() {
		return buildingUsage;
	}
	/**
	 * 建物用法(buildingUsage)の設定
	 *
	 * @param buildingUsage
	 *            String
	 */
	public void setBuildingUsage(String buildingUsage) {
		this.buildingUsage = buildingUsage;
	}

	/**
	 * 建物形態(buildingFrom)の取得
	 * @return buildingFrom
	 */
	public String getBuildingFrom() {
	    return this.buildingFrom;
	}
	/**
	 * 建物形態(buildingFrom)の設定
	 * @param buildingFrom String
	 */
	public void setBuildingFrom(String buildingFrom) {
	    this.buildingFrom = buildingFrom;
	}

	/**
	 * 建物階数(buildingFloor)の取得
	 * @return buildingFloor
	 */
	public String getBuildingFloor() {
	    return this.buildingFloor;
	}
	/**
	 * 建物階数(buildingFloor)の設定
	 * @param buildingFloor String
	 */
	public void setBuildingFloor(String buildingFloor) {
	    this.buildingFloor = buildingFloor;
	}

	/**
	 * 建物建築年月(buildingDate)の取得
	 * @return buildingDate
	 */
	public String getBuildingBuildingDate() {
	    return this.buildingBuildingDate;
	}
	/**
	 * 建物建築年月(buildingBuildingDate)の設定
	 * @param buildingBuildingDate String
	 */
	public void setBuildingBuildingDate(String buildingBuildingDate) {
	    this.buildingBuildingDate = buildingBuildingDate;
	}

	/**
	 * 建物面積(buildingArea)の取得
	 * @return buildingArea
	 */
	public String getBuildingArea() {
	    return this.buildingArea;
	}
	/**
	 * 建物面積(buildingArea)の設定
	 * @param buildingArea String
	 */
	public void setBuildingArea(String buildingArea) {
	    this.buildingArea = buildingArea;
	}
	public String getOtherContractAmount() {
		return otherContractAmount;
	}
	public void setOtherContractAmount(String otherContractAmount) {
		this.otherContractAmount = otherContractAmount;
	}
	public String getBasicInsuranceAmountFirst() {
		return basicInsuranceAmountFirst;
	}
	public void setBasicInsuranceAmountFirst(String basicInsuranceAmountFirst) {
		this.basicInsuranceAmountFirst = basicInsuranceAmountFirst;
	}
	public String getEarthquakeInsuranceAmountFirst() {
		return earthquakeInsuranceAmountFirst;
	}
	public void setEarthquakeInsuranceAmountFirst(String earthquakeInsuranceAmountFirst) {
		this.earthquakeInsuranceAmountFirst = earthquakeInsuranceAmountFirst;
	}
	public String getBasicInsuranceAmountSecond() {
		return basicInsuranceAmountSecond;
	}
	public void setBasicInsuranceAmountSecond(String basicInsuranceAmountSecond) {
		this.basicInsuranceAmountSecond = basicInsuranceAmountSecond;
	}
	public String getEarthquakeInsuranceAmountSecond() {
		return earthquakeInsuranceAmountSecond;
	}
	public void setEarthquakeInsuranceAmountSecond(String earthquakeInsuranceAmountSecond) {
		this.earthquakeInsuranceAmountSecond = earthquakeInsuranceAmountSecond;
	}
	public String getInsuranceTargetFirst() {
		return insuranceTargetFirst;
	}
	public void setInsuranceTargetFirst(String insuranceTargetFirst) {
		this.insuranceTargetFirst = insuranceTargetFirst;
	}
	public String getInsuranceTargetSecond() {
		return insuranceTargetSecond;
	}
	public void setInsuranceTargetSecond(String insuranceTargetSecond) {
		this.insuranceTargetSecond = insuranceTargetSecond;
	}



}

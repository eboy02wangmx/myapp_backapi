package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.List;

import jp.co.myapp.api.domain.validate.annotation.CustomizeDateFormatString;

public class CorrectionUpdateRequest implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6640773677899929381L;

	/**
	 * 処理区分(processingType)
	 */
	private String processingType;

	/**
	 * 申込依頼No(entryNo)
	 */
	private String entryNo;

	/**
	 * 更新日時(updateDateTime)
	 */
	private String updateTime;

	/**
	 * 選択プラン(selectPlan)
	 */
	private String selectPlan;

	/**
	 * 訂正後保険始期日(startDate)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'訂正後保険始期日';'日付';'ご入力'}")
	private String startDate;

	/**
	 * 訂正後地上階(buildingFloor)
	 */
	private String buildingFloor;

	/**
	 * 訂正後地下階(basementFloor)
	 */
	private String basementFloor;

	/**
	 * 訂正後居住階(residentialFloor)
	 */
	private String residentialFloor;

	/**
	 * 建物形態(buildingFrom)
	 */
	private String buildingFrom;

	/**
	 * 訂正後建物構造(buildingStructure)
	 */
	private String buildingStructure;

	/**
	 * 訂正後鉄骨造建物種類詳細(steelBuildingType)
	 */
	private String steelBuildingType;

	/**
	 * 訂正後その他建物種類詳細(otherBuildingType)
	 */
	private String otherBuildingType;

	/**
	 * 訂正後構造級別(structureGrade)
	 */
	private String structureGrade;

	/**
	 * 訂正後建物所在地(buildingLocation)
	 */
	private String buildingLocation;

	/**
	 * 訂正後建物建築年月(buildingBuildingDate)
	 */
	// @CustomizeDateFormatString(pattern = "yyyyMM", message = "E00001", params = "{'訂正後建物建築年月';'日付';'ご入力'}")
	private String buildingBuildingDate;

	/**
	 * 訂正後建物占有面積(buildingArea)
	 */
	private String buildingArea;

	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)
	 */
	private String withNewBuildingValueKnown;

	/**
	 * 訂正後協定再調達価額MIN(policyCurrentReplacementValueMin)
	 */
	private String policyCurrentReplacementValueMin;

	/**
	 * 訂正後協定再調達価額MAX(policyCurrentReplacementValueMax)
	 */
	private String policyCurrentReplacementValueMax;

	/**
	 * 訂正後協定再調達価額(policyCurrentReplacementValue)
	 */
	private String policyCurrentReplacementValue;

	/**
	 * 訂正後評価額(appraised)
	 */
	private String appraised;

	/**
	 * 地震保険割引確認(confirmEarthquakeDiscount)
	 */
	private String confirmEarthquakeDiscount;

	/**
	 * 訂正後地震保険割引率(earthquakeInsuranceDiscountPercent)
	 */
	private String earthquakeInsuranceDiscountPercent;

	/**
	 * 訂正後耐震等級割引等級(seismicGradeDiscountGrade)
	 */
	private String seismicGradeDiscountGrade;

	/**
	 * 訂正後耐震診断年月日(seismicDiagnosisDate)
	 */
	@CustomizeDateFormatString(pattern = "yyyyMMdd", message = "E00001", params = "{'耐震診断年月日';'日付';'ご入力'}")
	private String seismicDiagnosisDate;

	/**
	 * 訂正後ご連絡(contactField)
	 */
	private String contactField;

	/**
	 * 訂正後火災保険建物保険料(fireBuildingFee)
	 */
	private String fireBuildingFee;

	/**
	 * 訂正後火災保険家財保険料(fireHouseholdFee)
	 */
	private String fireHouseholdFee;

	/**
	 * 訂正後火災保険料(fireFee)
	 */
	private String fireFee;

	/**
	 * 訂正後設備什器保険料(equipmentFee)
	 */
	private String equipmentFee;

	/**
	 * 訂正後商品製品保険料(goodsFee)
	 */
	private String goodsFee;

	/**
	 * 訂正後明記物件保険料(specificationArticleFee)
	 */
	private String specificationArticleFee;

	/**
	 * 訂正後地震保険建物保険料(earthquakeBuildingFee)
	 */
	private String earthquakeBuildingFee;

	/**
	 * 訂正後地震保険家財保険料(earthquakeHouseholdFee)
	 */
	private String earthquakeHouseholdFee;

	/**
	 * 訂正後地震保険料(earthquakeFee)
	 */
	private String earthquakeFee;

	/**
	 * 訂正後個人賠責保険料(personalLiabilityFee)
	 */
	private String personalLiabilityFee;

	/**
	 * 訂正後借家人賠責保険料(tenantLiabilityFee)
	 */
	private String tenantLiabilityFee;

	/**
	 * 訂正後建物管理賠責保険料(buildingManageLiabilityFee)
	 */
	private String buildingManageLiabilityFee;

	/**
	 * 訂正後類焼保険料(exposureFee)
	 */
	private String exposureFee;

	/**
	 * 訂正後合計保険料(totalFee)
	 */
	private String totalFee;

	/**
	 * 訂正後年額保険料(annualFee)
	 */
	private String annualFee;

	/**
	 * 訂正後初回保険料(firstInsuranceFee)
	 */
	private String firstInsuranceFee;

	/**
	 * 担当者名(managerName)
	 */
	private String managerName;

	/**
	 * メモ(memo)
	 */
	private String memo;

	/**
	 * 火災保険期間(fireTerm)
	 */
	private Integer fireTerm;

	/**
	 * 建物火災保険加入有無(withBuildingFireInsurance)
	 */
	private String withBuildingFireInsurance;

	/**
	 * 地震保険期間(earthquakeTerm)
	 */
	private Integer earthquakeTerm;

	/**
	 * 住宅ローン
	 */
	private String jyulonRiyo;
	
	/**
	 * 他契約基本保険金
	 */
	private String basicInsuranceAmount;
	
	/**
	 * 制限コード
	 */
	private String restrictionCode;
	
	/**
	 * 決定番号
	 */
	private String decisionNo;

	/**
	 * 点検画像リスト(inspectionImageList)
	 */
	private List<InspectionImageRequest> inspectionImageList;

	/**
	 * 処理区分(processingType)の取得
	 *
	 * @return processingType
	 */
	public String getProcessingType() {
		return processingType;
	}

	/**
	 * 処理区分(processingType)の設定
	 *
	 * @param processingType
	 */
	public void setProcessingType(String processingType) {
		this.processingType = processingType;
	}

	/**
	 * 申込依頼No(entryNo)の取得
	 *
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼No(entryNo)の設定
	 *
	 * @param entryNo
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 更新日時(updateime)の取得
	 *
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時(updateTime)の設定
	 *
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 選択プラン(selectPlan)の取得
	 *
	 * @return selectPlan
	 */
	public String getSelectPlan() {
		return selectPlan;
	}

	/**
	 * 選択プラン(selectPlan)の設定
	 *
	 * @param selectPlan
	 */
	public void setSelectPlan(String selectPlan) {
		this.selectPlan = selectPlan;
	}

	/**
	 * 訂正後保険始期日(startDate)の取得
	 *
	 * @return startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * 訂正後保険始期日(startDate)の設定
	 *
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * 訂正後地上階(buildingFloor)の取得
	 *
	 * @return buildingFloor
	 */
	public String getBuildingFloor() {
		return buildingFloor;
	}

	/**
	 * 訂正後地上階(buildingFloor)の設定
	 *
	 * @param buildingFloor
	 */
	public void setBuildingFloor(String buildingFloor) {
		this.buildingFloor = buildingFloor;
	}

	/**
	 * 訂正後地下階(basementFloor)の取得
	 *
	 * @return basementFloor
	 */
	public String getBasementFloor() {
		return basementFloor;
	}

	/**
	 * 訂正後地下階(basementFloor)の設定
	 *
	 * @param basementFloor
	 */
	public void setBasementFloor(String basementFloor) {
		this.basementFloor = basementFloor;
	}

	/**
	 * 訂正後居住階(residentialFloor)の取得
	 *
	 * @return residentialFloor
	 */
	public String getResidentialFloor() {
		return residentialFloor;
	}

	/**
	 * 訂正後居住階(residentialFloor)の設定
	 *
	 * @param residentialFloor
	 */
	public void setResidentialFloor(String residentialFloor) {
		this.residentialFloor = residentialFloor;
	}

	/**
	 * 建物形態(buildingFrom)の取得
	 *
	 * @return buildingFrom
	 */
	public String getBuildingFrom() {
		return this.buildingFrom;
	}

	/**
	 * 建物形態(buildingFrom)の設定
	 *
	 * @param buildingFrom
	 *            String
	 */
	public void setBuildingFrom(String buildingFrom) {
		this.buildingFrom = buildingFrom;
	}

	/**
	 * 訂正後建物構造(buildingStructure)の取得
	 *
	 * @return buildingStructure
	 */
	public String getBuildingStructure() {
		return buildingStructure;
	}

	/**
	 * 訂正後建物構造(buildingStructure)の設定
	 *
	 * @param buildingStructure
	 */
	public void setBuildingStructure(String buildingStructure) {
		this.buildingStructure = buildingStructure;
	}

	/**
	 * 訂正後鉄骨造建物種類詳細(steelBuildingType)の取得
	 *
	 * @return steelBuildingType
	 */
	public String getSteelBuildingType() {
		return steelBuildingType;
	}

	/**
	 * 訂正後鉄骨造建物種類詳細(steelBuildingType)の設定
	 *
	 * @param steelBuildingType
	 */
	public void setSteelBuildingType(String steelBuildingType) {
		this.steelBuildingType = steelBuildingType;
	}

	/**
	 * 訂正後その他建物種類詳細(otherBuildingType)の取得
	 *
	 * @return otherBuildingType
	 */
	public String getOtherBuildingType() {
		return otherBuildingType;
	}

	/**
	 * 訂正後その他建物種類詳細(otherBuildingType)の設定
	 *
	 * @param otherBuildingType
	 */
	public void setOtherBuildingType(String otherBuildingType) {
		this.otherBuildingType = otherBuildingType;
	}

	/**
	 * 訂正後構造級別(structureGrade)の取得
	 *
	 * @return structureGrade
	 */
	public String getStructureGrade() {
		return structureGrade;
	}

	/**
	 * 訂正後構造級別(structureGrade)の設定
	 *
	 * @param structureGrade
	 */
	public void setStructureGrade(String structureGrade) {
		this.structureGrade = structureGrade;
	}

	/**
	 * 訂正後建物所在地(buildingLocation)の取得
	 *
	 * @return buildingLocation
	 */
	public String getBuildingLocation() {
		return buildingLocation;
	}

	/**
	 * 訂正後建物所在地(buildingLocation)の設定
	 *
	 * @param buildingLocation
	 */
	public void setBuildingLocation(String buildingLocation) {
		this.buildingLocation = buildingLocation;
	}

	/**
	 * 訂正後建物建築年月(buildingBuildingDate)の取得
	 *
	 * @return buildingBuildingDate
	 */
	public String getBuildingBuildingDate() {
		return buildingBuildingDate;
	}

	/**
	 * 訂正後建物建築年月(buildingBuildingDate)の設定
	 *
	 * @param buildingBuildingDate
	 */
	public void setBuildingBuildingDate(String buildingBuildingDate) {
		this.buildingBuildingDate = buildingBuildingDate;
	}

	/**
	 * 訂正後建物占有面積(buildingArea)の取得
	 *
	 * @return buildingArea
	 */
	public String getBuildingArea() {
		return buildingArea;
	}

	/**
	 * 訂正後建物占有面積(buildingArea)の設定
	 *
	 * @param buildingArea
	 */
	public void setBuildingArea(String buildingArea) {
		this.buildingArea = buildingArea;
	}

	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)
	 *
	 * @return withNewBuildingValueKnown
	 */
	public String getWithNewBuildingValueKnown() {
		return withNewBuildingValueKnown;
	}

	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)
	 *
	 * @param withNewBuildingValueKnown
	 */
	public void setWithNewBuildingValueKnown(String withNewBuildingValueKnown) {
		this.withNewBuildingValueKnown = withNewBuildingValueKnown;
	}

	/**
	 * 訂正後協定再調達価額MIN(policyCurrentReplacementValueMin)の取得
	 *
	 * @return policyCurrentReplacementValueMin
	 */
	public String getPolicyCurrentReplacementValueMin() {
		return policyCurrentReplacementValueMin;
	}

	/**
	 * 訂正後協定再調達価額MIN(policyCurrentReplacementValueMin)の設定
	 *
	 * @param policyCurrentReplacementValueMin
	 */
	public void setPolicyCurrentReplacementValueMin(String policyCurrentReplacementValueMin) {
		this.policyCurrentReplacementValueMin = policyCurrentReplacementValueMin;
	}

	/**
	 * 訂正後協定再調達価額MAX(policyCurrentReplacementValueMax)の取得
	 *
	 * @return policyCurrentReplacementValueMax
	 */
	public String getPolicyCurrentReplacementValueMax() {
		return policyCurrentReplacementValueMax;
	}

	/**
	 * 訂正後協定再調達価額MAX(policyCurrentReplacementValueMax)の設定
	 *
	 * @param policyCurrentReplacementValueMax
	 */
	public void setPolicyCurrentReplacementValueMax(String policyCurrentReplacementValueMax) {
		this.policyCurrentReplacementValueMax = policyCurrentReplacementValueMax;
	}

	/**
	 * 訂正後協定再調達価額(policyCurrentReplacementValue)の取得
	 *
	 * @return policyCurrentReplacementValue
	 */
	public String getPolicyCurrentReplacementValue() {
		return policyCurrentReplacementValue;
	}

	/**
	 * 訂正後協定再調達価額(policyCurrentReplacementValue)の設定
	 *
	 * @param policyCurrentReplacementValue
	 */
	public void setPolicyCurrentReplacementValue(String policyCurrentReplacementValue) {
		this.policyCurrentReplacementValue = policyCurrentReplacementValue;
	}

	/**
	 * 訂正後評価額(appraised)の取得
	 *
	 * @return appraised
	 */
	public String getAppraised() {
		return appraised;
	}

	/**
	 * 訂正後評価額(appraised)の設定
	 *
	 * @param appraised
	 */
	public void setAppraised(String appraised) {
		this.appraised = appraised;
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
	 * @param confirmEarthquakeDiscount
	 *            String
	 */
	public void setConfirmEarthquakeDiscount(String confirmEarthquakeDiscount) {
		this.confirmEarthquakeDiscount = confirmEarthquakeDiscount;
	}

	/**
	 * 訂正後地震保険割引率(earthquakeInsuranceDiscountPercent)の取得
	 *
	 * @return earthquakeInsuranceDiscountPercent
	 */
	public String getEarthquakeInsuranceDiscountPercent() {
		return earthquakeInsuranceDiscountPercent;
	}

	/**
	 * 訂正後地震保険割引率(earthquakeInsuranceDiscountPercent)の設定
	 *
	 * @param earthquakeInsuranceDiscountPercent
	 */
	public void setEarthquakeInsuranceDiscountPercent(String earthquakeInsuranceDiscountPercent) {
		this.earthquakeInsuranceDiscountPercent = earthquakeInsuranceDiscountPercent;
	}

	/**
	 * 訂正後耐震等級割引等級(seismicGradeDiscountGrade)の取得
	 *
	 * @return seismicGradeDiscountGrade
	 */
	public String getSeismicGradeDiscountGrade() {
		return seismicGradeDiscountGrade;
	}

	/**
	 * 訂正後耐震等級割引等級(seismicGradeDiscountGrade)の設定
	 *
	 * @param seismicGradeDiscountGrade
	 */
	public void setSeismicGradeDiscountGrade(String seismicGradeDiscountGrade) {
		this.seismicGradeDiscountGrade = seismicGradeDiscountGrade;
	}

	/**
	 * 訂正後耐震診断年月日(seismicDiagnosisDate)の取得
	 *
	 * @return seismicDiagnosisDate
	 */
	public String getSeismicDiagnosisDate() {
		return seismicDiagnosisDate;
	}

	/**
	 * 訂正後耐震診断年月日(seismicDiagnosisDate)の設定
	 *
	 * @param seismicDiagnosisDate
	 */
	public void setSeismicDiagnosisDate(String seismicDiagnosisDate) {
		this.seismicDiagnosisDate = seismicDiagnosisDate;
	}

	/**
	 * 訂正後ご連絡(contactField)の取得
	 *
	 * @return contactField
	 */
	public String getContactField() {
		return contactField;
	}

	/**
	 * 訂正後ご連絡(contactField)の設定
	 *
	 * @param contactField
	 */
	public void setContactField(String contactField) {
		this.contactField = contactField;
	}

	/**
	 * 訂正後火災保険建物保険料(fireBuildingFee)の取得
	 *
	 * @return fireBuildingFee
	 */
	public String getFireBuildingFee() {
		return fireBuildingFee;
	}

	/**
	 * 訂正後火災保険建物保険料(fireBuildingFee)の設定
	 *
	 * @param fireBuildingFee
	 */
	public void setFireBuildingFee(String fireBuildingFee) {
		this.fireBuildingFee = fireBuildingFee;
	}

	/**
	 * 訂正後火災保険家財保険料(fireHouseholdFee)の取得
	 *
	 * @return fireHouseholdFee
	 */
	public String getFireHouseholdFee() {
		return fireHouseholdFee;
	}

	/**
	 * 訂正後火災保険家財保険料(fireHouseholdFee)の設定
	 *
	 * @param fireHouseholdFee
	 */
	public void setFireHouseholdFee(String fireHouseholdFee) {
		this.fireHouseholdFee = fireHouseholdFee;
	}

	/**
	 * 訂正後火災保険料(fireFee)の取得
	 *
	 * @return fireFee
	 */
	public String getFireFee() {
		return this.fireFee;
	}

	/**
	 * 訂正後火災保険料(fireFee)の設定
	 *
	 * @param fireFee
	 *            String
	 */
	public void setFireFee(String fireFee) {
		this.fireFee = fireFee;
	}

	/**
	 * 訂正後設備什器保険料(equipmentFee)の取得
	 *
	 * @return equipmentFee
	 */
	public String getEquipmentFee() {
		return this.equipmentFee;
	}

	/**
	 * 訂正後設備什器保険料(equipmentFee)の設定
	 *
	 * @param equipmentFee
	 *            String
	 */
	public void setEquipmentFee(String equipmentFee) {
		this.equipmentFee = equipmentFee;
	}

	/**
	 * 訂正後商品製品保険料(goodsFee)の取得
	 *
	 * @return goodsFee
	 */
	public String getGoodsFee() {
		return this.goodsFee;
	}

	/**
	 * 訂正後商品製品保険料(goodsFee)の設定
	 *
	 * @param goodsFee
	 *            String
	 */
	public void setGoodsFee(String goodsFee) {
		this.goodsFee = goodsFee;
	}

	/**
	 * 訂正後明記物件保険料(specificationArticleFee)の取得
	 *
	 * @return specificationArticleFee
	 */
	public String getSpecificationArticleFee() {
		return this.specificationArticleFee;
	}

	/**
	 * 訂正後明記物件保険料(specificationArticleFee)の設定
	 *
	 * @param specificationArticleFee
	 *            String
	 */
	public void setSpecificationArticleFee(String specificationArticleFee) {
		this.specificationArticleFee = specificationArticleFee;
	}

	/**
	 * 訂正後地震保険建物保険料(earthquakeBuildingFee)の取得
	 *
	 * @return earthquakeBuildingFee
	 */
	public String getEarthquakeBuildingFee() {
		return earthquakeBuildingFee;
	}

	/**
	 * 訂正後地震保険建物保険料(earthquakeBuildingFee)の設定
	 *
	 * @param earthquakeBuildingFee
	 */
	public void setEarthquakeBuildingFee(String earthquakeBuildingFee) {
		this.earthquakeBuildingFee = earthquakeBuildingFee;
	}

	/**
	 * 訂正後地震保険家財保険料(earthquakeHouseholdFee)の取得
	 *
	 * @return earthquakeHouseholdFee
	 */
	public String getEarthquakeHouseholdFee() {
		return earthquakeHouseholdFee;
	}

	/**
	 * 訂正後地震保険家財保険料(earthquakeHouseholdFee)の設定
	 *
	 * @param earthquakeHouseholdFee
	 */
	public void setEarthquakeHouseholdFee(String earthquakeHouseholdFee) {
		this.earthquakeHouseholdFee = earthquakeHouseholdFee;
	}

	/**
	 * 訂正後地震保険料(earthquakeFee)の取得
	 *
	 * @return earthquakeFee
	 */
	public String getEarthquakeFee() {
		return this.earthquakeFee;
	}

	/**
	 * 地震保険料(earthquakeFee)の設定
	 *
	 * @param earthquakeFee
	 *            String
	 */
	public void setEarthquakeFee(String earthquakeFee) {
		this.earthquakeFee = earthquakeFee;
	}

	/**
	 * 訂正後個人賠責保険料(personalLiabilityFee)の取得
	 *
	 * @return personalLiabilityFee
	 */
	public String getPersonalLiabilityFee() {
		return this.personalLiabilityFee;
	}

	/**
	 * 訂正後個人賠責保険料(personalLiabilityFee)の設定
	 *
	 * @param personalLiabilityFee
	 *            String
	 */
	public void setPersonalLiabilityFee(String personalLiabilityFee) {
		this.personalLiabilityFee = personalLiabilityFee;
	}

	/**
	 * 訂正後借家人賠責保険料(tenantLiabilityFee)の取得
	 *
	 * @return tenantLiabilityFee
	 */
	public String getTenantLiabilityFee() {
		return this.tenantLiabilityFee;
	}

	/**
	 * 訂正後借家人賠責保険料(tenantLiabilityFee)の設定
	 *
	 * @param tenantLiabilityFee
	 *            String
	 */
	public void setTenantLiabilityFee(String tenantLiabilityFee) {
		this.tenantLiabilityFee = tenantLiabilityFee;
	}

	/**
	 * 訂正後類焼保険料(exposureFee)の取得
	 *
	 * @return exposureFee
	 */
	public String getExposureFee() {
		return this.exposureFee;
	}

	/**
	 * 訂正後類焼保険料(exposureFee)の設定
	 *
	 * @param exposureFee
	 *            String
	 */
	public void setExposureFee(String exposureFee) {
		this.exposureFee = exposureFee;
	}

	/**
	 * 訂正後合計保険料(totalFee)の取得
	 *
	 * @return totalFee
	 */
	public String getTotalFee() {
		return totalFee;
	}

	/**
	 * 訂正後合計保険料(totalFee)の設定
	 *
	 * @param totalFee
	 */
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	/**
	 * 訂正後年額保険料(annualFee)の取得
	 *
	 * @return annualFee
	 */
	public String getAnnualFee() {
		return this.annualFee;
	}

	/**
	 * 訂正後年額保険料(annualFee)の設定
	 *
	 * @param annualFee
	 *            String
	 */
	public void setAnnualFee(String annualFee) {
		this.annualFee = annualFee;
	}

	/**
	 * 訂正後初回保険料(firstInsuranceFee)の取得
	 *
	 * @return firstInsuranceFee
	 */
	public String getFirstInsuranceFee() {
		return this.firstInsuranceFee;
	}

	/**
	 * 訂正後初回保険料(firstInsuranceFee)の設定
	 *
	 * @param firstInsuranceFee
	 *            String
	 */
	public void setFirstInsuranceFee(String firstInsuranceFee) {
		this.firstInsuranceFee = firstInsuranceFee;
	}

	/**
	 * 担当者名(managerName)の取得
	 *
	 * @return managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * 担当者名(managerName)の設定
	 *
	 * @param managerName
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * メモ(memo)の取得
	 *
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * メモ(memo)の設定
	 *
	 * @param memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	/**
	 * 他契約基本保険金(basicInsuranceAmount)の取得
	 *
	 * @return basicInsuranceAmount
	 */
	public String getBasicInsuranceAmount() {
		return basicInsuranceAmount;
	}

	/**
	 * 他契約基本保険金(basicInsuranceAmount)の設定
	 *
	 * @param basicInsuranceAmount
	 */
	public void setBasicInsuranceAmount(String basicInsuranceAmount) {
		this.basicInsuranceAmount = basicInsuranceAmount;
	}

	/**
	 * 点検画像リストの取得
	 *
	 * @return inspectionImageList
	 */
	public List<InspectionImageRequest> getInspectionImageList() {
		return inspectionImageList;
	}

	/**
	 * 点検画像リストの設定
	 *
	 * @param inspectionImageList
	 */
	public void setInspectionImageList(List<InspectionImageRequest> inspectionImageList) {
		this.inspectionImageList = inspectionImageList;
	}

	public Integer getFireTerm() {
		return fireTerm;
	}

	public void setFireTerm(Integer fireTerm) {
		this.fireTerm = fireTerm;
	}

	public Integer getEarthquakeTerm() {
		return earthquakeTerm;
	}

	public void setEarthquakeTerm(Integer earthquakeTerm) {
		this.earthquakeTerm = earthquakeTerm;
	}

	public String getJyulonRiyo() {
		return jyulonRiyo;
	}

	public void setJyulonRiyo(String jyulonRiyo) {
		this.jyulonRiyo = jyulonRiyo;
	}

	public String getWithBuildingFireInsurance() {
		return withBuildingFireInsurance;
	}

	public void setWithBuildingFireInsurance(String withBuildingFireInsurance) {
		this.withBuildingFireInsurance = withBuildingFireInsurance;
	}

	/**
	 * @return buildingManageLiabilityFee
	 */
	public String getBuildingManageLiabilityFee() {
		return buildingManageLiabilityFee;
	}

	/**
	 * @param buildingManageLiabilityFee
	 *            セットする buildingManageLiabilityFee
	 */
	public void setBuildingManageLiabilityFee(String buildingManageLiabilityFee) {
		this.buildingManageLiabilityFee = buildingManageLiabilityFee;
	}

	/**
	 * @return restrictionCode
	 */
	public String getRestrictionCode() {
		return restrictionCode;
	}

	/**
	 * @param restrictionCode
	 *            セットする restrictionCode
	 */
	public void setRestrictionCode(String restrictionCode) {
		this.restrictionCode = restrictionCode;
	}

	/**
	 * @return decisionNo
	 */
	public String getDecisionNo() {
		return decisionNo;
	}

	/**
	 * @param decisionNo
	 *            セットする decisionNo
	 */
	public void setDecisionNo(String decisionNo) {
		this.decisionNo = decisionNo;
	}

}

package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeInteger;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeLong;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EntrySaveInsAmountRequest extends BaseEntrySaveRequest implements Serializable {
	private static final long serialVersionUID = 9045751869350440930L;

	/**
	 * お申込依頼№(entryNo)
	 */
	@CustomizeTypeSizeString(max = 6, regexp = "", message = "E00001", params = "{entryNo.label;max.6;enter.event}")
	private String entryNo;

	/**
	 * 一時保存画面ID(screenID)
	 */
	@CustomizeTypeSizeString(max = 128, regexp = "", message = "E00001", params = "{screenID.label;max.128;enter.event}")
	private String screenID;

	/**
	 *  住宅ローン有無
	 */
	private String buildingLoan;

	/**
	 * 商品区分(goodsType)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{goodsType.label;max.1;enter.event}")
	private String goodsType;

	/**
	 * 建物火災保険加入有無(withBuildingFireInsurance)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{withBuildingFireInsurance.label;max.1;enter.event}")
	private String withBuildingFireInsurance;

	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{withNewBuildingValueKnown.label;max.1;enter.event}")
	private String withNewBuildingValueKnown;

	/**
	 * 協定再調達価額(policyCurrentReplacementValue)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{policyCurrentReplacementValue.label;max.9;enter.event}")
	private Long policyCurrentReplacementValue;

	/**
	 * 門・塀・車庫価額(fenceValue)
	 */
	@CustomizeTypeSizeLong(max = 5, regexp = "", message = "E00001", params = "{fenceValue.label;max.5;enter.event}")
	private Long fenceValue;

	/**
	 * 新築時の建築価額(newBuildingValue)
	 */
	@CustomizeTypeSizeLong(max = 10, regexp = "", message = "E00001", params = "{newBuildingValue.label;max.10;enter.event}")
	private Long newBuildingValue;

	/**
	 * マンション評価基準(apartmentClassification)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{apartmentClassification.label;max.1;enter.event}")
	private String apartmentClassification;

	/**
	 * 家財火災保険加入有無(withHouseholdFireInsurance)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{withHouseholdFireInsurance.label;max.1;enter.event}")
	private String withHouseholdFireInsurance;

	/**
	 * 世帯主年令(householderAge)
	 */
	@CustomizeTypeSizeString(max = 3, regexp = "", message = "E00001", params = "{householderAge.label;max.3;enter.event}")
	private String householderAge;

	/**
	 * 子供人数(numberOfChildren)
	 */
	@CustomizeTypeSizeInteger(max = 2, regexp = "", message = "E00001", params = "{numberOfChildren.label;max.2;enter.event}")
	private Integer numberOfChildren;

	/**
	 * 配偶者有無(withSpouse)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{withSpouse.label;max.1;enter.event}")
	private String withSpouse;

	/**
	 * 同居人人数(housemates)
	 */
	@CustomizeTypeSizeInteger(max = 2, regexp = "", message = "E00001", params = "{housemates.label;max.2;enter.event}")
	private Integer housemates;

	/**
	 * 建物評価額（下限）(buildingAppraisedLower)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{buildingAppraisedLower.label;max.9;enter.event}")
	private Long buildingAppraisedLower;

	/**
	 * 建物評価額（上限）(buildingAppraisedUpper)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{buildingAppraisedUpper.label;max.9;enter.event}")
	private Long buildingAppraisedUpper;

	/**
	 * 家財評価額（下限）(householdAppraisedLower)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{householdAppraisedLower.label;max.9;enter.event}")
	private Long householdAppraisedLower;

	/**
	 * 家財評価額（上限）(householdAppraisedUpper)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{householdAppraisedUpper.label;max.9;enter.event}")
	private Long householdAppraisedUpper;

	/**
	 * 火災保険建物保険金額(fireBuildingAmount)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{fireBuildingAmount.label;max.9;enter.event}")
	private Long fireBuildingAmount;

	/**
	 * 火災保険家財保険金額(fireHouseholdAmount)
	 */
	@CustomizeTypeSizeLong(max = 9, regexp = "", message = "E00001", params = "{fireHouseholdAmount.label;max.9;enter.event}")
	private Long fireHouseholdAmount;

	/**
	 * 基礎工事含む(includFoundationWork)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{includFoundationWork.label;max.1;enter.event}")
	private String includFoundationWork;

	/**
	 * 畳・建具等含む(includJoinery)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{includJoinery.label;max.1;enter.event}")
	private String includJoinery;

	/**
	 * 門・塀・垣含む(includFence)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{includFence.label;max.1;enter.event}")
	private String includFence;

	/**
	 * 物置車庫等含む(includGarage)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{includGarage.label;max.1;enter.event}")
	private String includGarage;

	/**
	 * 共用部分含む(includShared)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{includShared.label;max.1;enter.event}")
	private String includShared;

	/**
	 * 更新日時(updateTime)
	 */
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{updateTime.label;max.21;enter.event}")
	private String updateTime;

//	/**
//	 * 評価法区分(hyoka_kbn)
//	 */
//	private String methodType;

	/**
	 * その他評価法金額入力(other_gaku)
	 */
	private Integer otherMethodAmount;

	/**
	 * その他評価法根拠(other_konkyo)
	 */
	private String otherMethodBasis;

	/**
	 * 明記物件保険金額(mb_gaku)
	 */
	private Long specificationArticleAmount;

	/**
	 * 建物用法(yoho)
	 */
	private String buildingUsage;

	/**
	 * 設備什器火災保険加入有無(setuj_kanyu)
	 */
	private String withEquipmentFireInsurance;

	/**
	 * 設備什器保険金額(setuj_gaku)
	 */
	private Long equipmentAmount;

	/**
	 * 商品製品火災保険加入有無(seihn_kanyu)
	 */
	private String withGoodsFireInsurance;

	/**
	 * 商品製品保険金額(seihn_gaku)
	 */
	private Long goodsAmount;

	/**
	 * 他契約の保険有無(withOtherContract)
	 */
	private String withOtherContract;

	/**
	 * 他契約保険金額(otherContractAmount)
	 */
	private Long otherContractAmount;

	/**
	 * 保険の対象(insuranceTargetFirst)
	 */
	private String insuranceTargetFirst;

	/**
	 * 旧保険契約有無
	 */
	private Integer withOldContract;

	public Integer getWithOldContract() {
		return withOldContract;
	}
	public void setWithOldContract(Integer withOldContract) {
		this.withOldContract = withOldContract;
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
	 * 明記物件保険金額(mb_gaku)の取得
	 * @return specificationArticleAmount
	 */
	public Long getSpecificationArticleAmount() {
	    return specificationArticleAmount;
	}

	/**
	 * 明記物件保険金額(mb_gaku)の設定
	 * @param specificationArticleAmount Integer
	 */
	public void setSpecificationArticleAmount(Long specificationArticleAmount) {
	    this.specificationArticleAmount = specificationArticleAmount;
	}

	/**
	 * 建物用法(yoho)の取得
	 * @return buildingUsage
	 */
	public String getBuildingUsage() {
	    return buildingUsage;
	}
	/**
	 * 建物用法(yoho)の設定
	 * @param buildingUsage String
	 */
	public void setBuildingUsage(String buildingUsage) {
	    this.buildingUsage = buildingUsage;
	}

	/**
	 * 設備什器火災保険加入有無(setuj_kanyu)の取得
	 * @return withEquipmentFireInsurance
	 */
	public String getWithEquipmentFireInsurance() {
	    return withEquipmentFireInsurance;
	}
	/**
	 * 設備什器火災保険加入有無(setuj_kanyu)の設定
	 * @param withEquipmentFireInsurance String
	 */
	public void setWithEquipmentFireInsurance(String withEquipmentFireInsurance) {
	    this.withEquipmentFireInsurance = withEquipmentFireInsurance;
	}

	/**
	 * 設備什器保険金額(setuj_gaku)の取得
	 * @return equipmentAmount
	 */
	public Long getEquipmentAmount() {
	    return equipmentAmount;
	}
	/**
	 * 設備什器保険金額(setuj_gaku)の設定
	 * @param equipmentAmount Integer
	 */
	public void setEquipmentAmount(Long equipmentAmount) {
	    this.equipmentAmount = equipmentAmount;
	}

	/**
	 * 商品製品火災保険加入有無(seihn_kanyu)の取得
	 * @return withGoodsFireInsurance
	 */
	public String getWithGoodsFireInsurance() {
	    return withGoodsFireInsurance;
	}
	/**
	 * 商品製品火災保険加入有無(seihn_kanyu)の設定
	 * @param withGoodsFireInsurance String
	 */
	public void setWithGoodsFireInsurance(String withGoodsFireInsurance) {
	    this.withGoodsFireInsurance = withGoodsFireInsurance;
	}

	/**
	 * 商品製品保険金額(seihn_gaku)の取得
	 * @return goodsAmount
	 */
	public Long getGoodsAmount() {
	    return goodsAmount;
	}
	/**
	 * 商品製品保険金額(seihn_gaku)の設定
	 * @param goodsAmount Integer
	 */
	public void setGoodsAmount(Long goodsAmount) {
	    this.goodsAmount = goodsAmount;
	}

	/**
	 * 建物火災保険加入有無(withBuildingFireInsurance)の取得
	 * @return withBuildingFireInsurance
	 */
	public String getWithBuildingFireInsurance() {
	    return withBuildingFireInsurance;
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
	    return withNewBuildingValueKnown;
	}
	/**
	 * 新築時の建築価額通知有無(withNewBuildingValueKnown)の設定
	 * @param withNewBuildingValueKnown String
	 */
	public void setWithNewBuildingValueKnown(String withNewBuildingValueKnown) {
	    this.withNewBuildingValueKnown = withNewBuildingValueKnown;
	}

	/**
	 * 協定再調達価額(policyCurrentReplacementValue)の取得
	 * @return policyCurrentReplacementValue
	 */
	public Long getPolicyCurrentReplacementValue() {
	    return policyCurrentReplacementValue;
	}
	/**
	 * 協定再調達価額(policyCurrentReplacementValue)の設定
	 * @param policyCurrentReplacementValue Integer
	 */
	public void setPolicyCurrentReplacementValue(Long policyCurrentReplacementValue) {
	    this.policyCurrentReplacementValue = policyCurrentReplacementValue;
	}

	/**
	 * 門・塀・車庫価額(fenceValue)の取得
	 * @return fenceValue
	 */
	public Long getFenceValue() {
	    return fenceValue;
	}
	/**
	 * 門・塀・車庫価額(fenceValue)の設定
	 * @param fenceValue Long
	 */
	public void setFenceValue(Long fenceValue) {
	    this.fenceValue = fenceValue;
	}

	/**
	 * 新築時の建築価額(newBuildingValue)の取得
	 * @return newBuildingValue
	 */
	public Long getNewBuildingValue() {
	    return newBuildingValue;
	}
	/**
	 * 新築時の建築価額(newBuildingValue)の設定
	 * @param newBuildingValue Long
	 */
	public void setNewBuildingValue(Long newBuildingValue) {
	    this.newBuildingValue = newBuildingValue;
	}

	/**
	 * マンション評価基準(apartmentClassification)の取得
	 * @return apartmentClassification
	 */
	public String getApartmentClassification() {
	    return apartmentClassification;
	}
	/**
	 * マンション評価基準(apartmentClassification)の設定
	 * @param apartmentClassification String
	 */
	public void setApartmentClassification(String apartmentClassification) {
	    this.apartmentClassification = apartmentClassification;
	}

	/**
	 * 家財火災保険加入有無(withHouseholdFireInsurance)の取得
	 * @return withHouseholdFireInsurance
	 */
	public String getWithHouseholdFireInsurance() {
	    return withHouseholdFireInsurance;
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
	    return householderAge;
	}
	/**
	 * 世帯主年令(householderAge)の設定
	 * @param householderAge Integer
	 */
	public void setHouseholderAge(String householderAge) {
	    this.householderAge = householderAge;
	}

	/**
	 * 子供人数(numberOfChildren)の取得
	 * @return numberOfChildren
	 */
	public Integer getNumberOfChildren() {
	    return numberOfChildren;
	}
	/**
	 * 子供人数(numberOfChildren)の設定
	 * @param numberOfChildren Integer
	 */
	public void setNumberOfChildren(Integer numberOfChildren) {
	    this.numberOfChildren = numberOfChildren;
	}

	/**
	 * 配偶者有無(withSpouse)の取得
	 * @return withSpouse
	 */
	public String getWithSpouse() {
	    return withSpouse;
	}
	/**
	 * 配偶者有無(withSpouse)の設定
	 * @param withSpouse String
	 */
	public void setWithSpouse(String withSpouse) {
	    this.withSpouse = withSpouse;
	}

	/**
	 * 同居人人数(housemates)の取得
	 * @return housemates
	 */
	public Integer getHousemates() {
	    return housemates;
	}
	/**
	 * 同居人人数(housemates)の設定
	 * @param housemates Integer
	 */
	public void setHousemates(Integer housemates) {
	    this.housemates = housemates;
	}

	/**
	 * 建物評価額（下限）(buildingAppraisedLower)の取得
	 * @return buildingAppraisedLower
	 */
	public Long getBuildingAppraisedLower() {
	    return buildingAppraisedLower;
	}
	/**
	 * 建物評価額（下限）(buildingAppraisedLower)の設定
	 * @param buildingAppraisedLower Long
	 */
	public void setBuildingAppraisedLower(Long buildingAppraisedLower) {
	    this.buildingAppraisedLower = buildingAppraisedLower;
	}

	/**
	 * 建物評価額（上限）(buildingAppraisedUpper)の取得
	 * @return buildingAppraisedUpper
	 */
	public Long getBuildingAppraisedUpper() {
	    return buildingAppraisedUpper;
	}
	/**
	 * 建物評価額（上限）(buildingAppraisedUpper)の設定
	 * @param buildingAppraisedUpper Long
	 */
	public void setBuildingAppraisedUpper(Long buildingAppraisedUpper) {
	    this.buildingAppraisedUpper = buildingAppraisedUpper;
	}

	/**
	 * 家財評価額（下限）(householdAppraisedLower)の取得
	 * @return householdAppraisedLower
	 */
	public Long getHouseholdAppraisedLower() {
	    return householdAppraisedLower;
	}
	/**
	 * 家財評価額（下限）(householdAppraisedLower)の設定
	 * @param householdAppraisedLower Long
	 */
	public void setHouseholdAppraisedLower(Long householdAppraisedLower) {
	    this.householdAppraisedLower = householdAppraisedLower;
	}

	/**
	 * 家財評価額（上限）(householdAppraisedUpper)の取得
	 * @return householdAppraisedUpper
	 */
	public Long getHouseholdAppraisedUpper() {
	    return householdAppraisedUpper;
	}
	/**
	 * 家財評価額（上限）(householdAppraisedUpper)の設定
	 * @param householdAppraisedUpper Long
	 */
	public void setHouseholdAppraisedUpper(Long householdAppraisedUpper) {
	    this.householdAppraisedUpper = householdAppraisedUpper;
	}

	/**
	 * 火災保険建物保険金額(fireBuildingAmount)の取得
	 * @return fireBuildingAmount
	 */
	public Long getFireBuildingAmount() {
	    return fireBuildingAmount;
	}
	/**
	 * 火災保険建物保険金額(fireBuildingAmount)の設定
	 * @param fireBuildingAmount Long
	 */
	public void setFireBuildingAmount(Long fireBuildingAmount) {
	    this.fireBuildingAmount = fireBuildingAmount;
	}

	/**
	 * 火災保険家財保険金額(fireHouseholdAmount)の取得
	 * @return fireHouseholdAmount
	 */
	public Long getFireHouseholdAmount() {
	    return fireHouseholdAmount;
	}
	/**
	 * 火災保険家財保険金額(fireHouseholdAmount)の設定
	 * @param fireHouseholdAmount Long
	 */
	public void setFireHouseholdAmount(Long fireHouseholdAmount) {
	    this.fireHouseholdAmount = fireHouseholdAmount;
	}

	/**
	 * 基礎工事含む(includFoundationWork)の取得
	 * @return includFoundationWork
	 */
	public String getIncludFoundationWork() {
	    return includFoundationWork;
	}
	/**
	 * 基礎工事含む(includFoundationWork)の設定
	 * @param includFoundationWork String
	 */
	public void setIncludFoundationWork(String includFoundationWork) {
	    this.includFoundationWork = includFoundationWork;
	}

	/**
	 * 畳・建具等含む(includJoinery)の取得
	 * @return includJoinery
	 */
	public String getIncludJoinery() {
	    return includJoinery;
	}
	/**
	 * 畳・建具等含む(includJoinery)の設定
	 * @param includJoinery String
	 */
	public void setIncludJoinery(String includJoinery) {
	    this.includJoinery = includJoinery;
	}

	/**
	 * 門・塀・垣含む(includFence)の取得
	 * @return includFence
	 */
	public String getIncludFence() {
	    return includFence;
	}
	/**
	 * 門・塀・垣含む(includFence)の設定
	 * @param includFence String
	 */
	public void setIncludFence(String includFence) {
	    this.includFence = includFence;
	}

	/**
	 * 物置車庫等含む(includGarage)の取得
	 * @return includGarage
	 */
	public String getIncludGarage() {
	    return includGarage;
	}
	/**
	 * 物置車庫等含む(includGarage)の設定
	 * @param includGarage String
	 */
	public void setIncludGarage(String includGarage) {
	    this.includGarage = includGarage;
	}

	/**
	 * 共用部分含む(includShared)の取得
	 * @return includShared
	 */
	public String getIncludShared() {
	    return includShared;
	}
	/**
	 * 共用部分含む(includShared)の設定
	 * @param includShared String
	 */
	public void setIncludShared(String includShared) {
	    this.includShared = includShared;
	}

	/**
	 * 更新日時(updateTime)の取得
	 * @return updateTime
	 */
	public String getUpdateTime() {
	    return updateTime;
	}
	/**
	 * 更新日時(updateTime)の設定
	 * @param updateTime String
	 */
	public void setUpdateTime(String updateTime) {
	    this.updateTime = updateTime;
	}

     /* お申込依頼№(entryNo)の取得
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
	 * 住宅ローン(buildingLoan)の取得
	 * @return buildingLoan
	 */
	public String getBuildingLoan() {
	    return buildingLoan;
	}
	/**
	 * 住宅ローン(buildingLoan)の設定
	 * @param buildingLoan String
	 */
	public void setBuildingLoan(String buildingLoan) {
	    this.buildingLoan = buildingLoan;
	}

	/**
     * @return goodsType
	 */
	public String getGoodsType() {
	    return goodsType;
	}
	/**
	 * 商品区分(goodsType)の設定
	 * @param goodsType String
	 */
	public void setGoodsType(String goodsType) {
	    this.goodsType = goodsType;
	}

	/**
	 * 他契約の保険有無(withOtherContract)の取得
	 * @return withOtherContract
	 */
	public String getWithOtherContract() {
	    return withOtherContract;
	}
	/**
	 * 他契約の保険有無(withOtherContract)の設定
	 * @param withOtherContract String
	 */
	public void setWithOtherContract(String withOtherContract) {
	    this.withOtherContract = withOtherContract;
	}

	/**
	 * 他契約保険金額(otherContractAmount)の取得
	 * @return otherContractAmount
	 */
	public Long getOtherContractAmount() {
	    return otherContractAmount;
	}
	/**
	 * 他契約保険金額(otherContractAmount)の設定
	 * @param otherContractAmount Long
	 */
	public void setOtherContractAmount(Long otherContractAmount) {
	    this.otherContractAmount = otherContractAmount;
	}
	public Integer getOtherMethodAmount() {
		return otherMethodAmount;
	}
	public void setOtherMethodAmount(Integer otherMethodAmount) {
		this.otherMethodAmount = otherMethodAmount;
	}

	/**
	 * 保険の対象(insuranceTargetFirst)の取得
	 * @return insuranceTargetFirst
	 */
	public String getInsuranceTargetFirst() {
		return insuranceTargetFirst;
	}
	/**
	 * 保険の対象(insuranceTargetFirst)の設定
	 * @return insuranceTargetFirst
	 */
	public void setInsuranceTargetFirst(String insuranceTargetFirst) {
		this.insuranceTargetFirst = insuranceTargetFirst;
	}

}

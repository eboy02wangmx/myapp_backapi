package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.math.BigDecimal;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EntrySaveEntryInfoRequest extends EntrySaveTempSaveRequest implements Serializable {
	private static final long serialVersionUID = 5252934726898123529L;

	/**
	 * MyToken
	 */
	@CustomizeTypeSizeString(max = 37, regexp = "", message = "E00001", params = "{mytoken.label;max.37;enter.event}")
	private String mytoken;

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
	 * 代理店名称(agentName)
	 */
    @CustomizeTypeSizeString(max=20, regexp="", message="E00001", params="{agentName.label;agentName.size;enter.event}")
	private String agentName;

	/**
	 * 建物所在地(buildingLocation)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{buildingLocation.label;max.2;enter.event}")
	private String buildingLocation;

	/**
	 * 保険対象都道府県コード(objectPrefecturesCode)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{objectPrefecturesCode.label;max.2;enter.event}")
	private String objectPrefecturesCode;

	/**
	 * 商品区分(goodsType)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{goodsType.label;max.1;enter.event}")
	private String goodsType;

	/**
	 * 契約者氏名漢字(contractorName)
	 */
//	@CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{contractorName.label;max.30;enter.event}")
	private String contractorName;

	/**
	 * 契約者氏名カナ(contractorNameKana)
	 */
//	@CustomizeTypeSizeString(max=60, regexp="", message="E00001", params="{contractorNameKana.label;max.60;enter.event}")
	private String contractorNameKana;

	/**
	 * 契約者郵便番号(contractorPost)
	 */
//	@CustomizeTypeSizeString(max=7, regexp="", message="E00001", params="{contractorPost.label;max.7;enter.event}")
	private String contractorPost;

	/**
	 * 契約者住所コード(contractorAddressCode)
	 */
//	@CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{contractorAddressCode.label;max.10;enter.event}")
	private String contractorAddressCode;

	/**
	 * 契約者住所(contractorAddress)
	 */
//	@CustomizeTypeSizeString(max=68, regexp="", message="E00001", params="{contractorAddress.label;max.68;enter.event}")
	private String contractorAddress;

	/**
	 * 契約者住所カナ(contractorAddressKana)
	 */
//	@CustomizeTypeSizeString(max=136, regexp="", message="E00001", params="{contractorAddressKana.label;max.136;enter.event}")
	private String contractorAddressKana;

	/**
	 * 契約者住所(contractorAddressFree)
	 */
//	@CustomizeTypeSizeString(max=68, regexp="", message="E00001", params="{contractorAddressFree.label;max.68;enter.event}")
	private String contractorAddressFree;

	/**
	 * 契約者住所カナ(contractorAddressKanaFree)
	 */
//	@CustomizeTypeSizeString(max=136, regexp="", message="E00001", params="{contractorAddressKanaFree.label;max.136;enter.event}")
	private String contractorAddressKanaFree;

	/**
	 * 契約者電話番号ー市外(contractorTelArea)
	 */
//	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{contractorTelArea.label;max.6;enter.event}")
	private String contractorTelArea;

	/**
	 * 契約者電話番号ー市内(contractorTelCity)
	 */
//	@CustomizeTypeSizeString(max=4, regexp="", message="E00001", params="{contractorTelCity.label;max.4;enter.event}")
	private String contractorTelCity;

	/**
	 * 契約者電話番号ー加入番号(contractorTelNo)
	 */
//	@CustomizeTypeSizeString(max=4, regexp="", message="E00001", params="{contractorTelNo.label;max.4;enter.event}")
	private String contractorTelNo;

	/**
	 * 契約者電話番号2ー市外(contractorTel2Area)
	 */
//	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{contractorTel2Area.label;max.6;enter.event}")
	private String contractorTel2Area;

	/**
	 * 契約者電話番号2ー市内(contractorTel2City)
	 */
//	@CustomizeTypeSizeString(max=4, regexp="", message="E00001", params="{contractorTel2City.label;max.4;enter.event}")
	private String contractorTel2City;

	/**
	 * 契約者電話番号2ー加入番号(contractorTel2No)
	 */
//	@CustomizeTypeSizeString(max=4, regexp="", message="E00001", params="{contractorTel2No.label;max.4;enter.event}")
	private String contractorTel2No;

	/**
	 * 契約者メールアドレス(contractorMail)
	 */
//	@CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{contractorMail.label;max.254;enter.event}")
//	@CustomizeMailString(message="E00002", params="{contractorMail.label;correct.enter.event}")
	private String contractorMail;

	/**
	 * プロモーションメール送信フラグ(PromotionMailSendFlag)
	 */
	private String promotionMailSendFlag;

	private String contractorMailConfirm;


	/**
	 * 契約者性別(contractorSex)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{contractorSex.label;max.1;enter.event}")
	private String contractorSex;

	/**
	 * 契約者生年月日(contractorBirthday)
	 */
//	@CustomizeTypeSizeString(max=8, regexp="", message="E00001", params="{contractorBirthday.label;max.8;enter.event}")
	private String contractorBirthday;

	/**
	 * 被保険者同異(contractorIdentical)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{contractorIdentical.label;max.1;enter.event}")
	private String contractorIdentical;

	/**
	 * 被保険者氏名(insuredName)
	 */
//	@CustomizeTypeSizeString(max=30, regexp="", message="E00001", params="{insuredName.label;max.30;enter.event}")
	private String insuredName;

	/**
	 * 被保険者氏名カナ(insuredNameKaNa)
	 */
//	@CustomizeTypeSizeString(max=60, regexp="", message="E00001", params="{insuredNameKaNa.label;max.60;enter.event}")
	private String insuredNameKaNa;

	/**
	 * 個人賠償補償対象者氏名(personalLiabilityName)
	 */
//	@CustomizeTypeSizeString(max=30, regexp="", message="E00001", params="{personalLiabilityName.label;max.30;enter.event}")
	private String personalLiabilityName;

	/**
	 * 個人賠償補償対象者氏名カナ(personalLiabilityNameKana)
	 */
//	@CustomizeTypeSizeString(max=60, regexp="", message="E00001", params="{personalLiabilityNameKana.label;max.60;enter.event}")
	private String personalLiabilityNameKana;

	/**
	 * 借家賠償補償対象者氏名(tenantCompensationName)
	 */
//	@CustomizeTypeSizeString(max=30, regexp="", message="E00001", params="{tenantCompensationName.label;max.30;enter.event}")
	private String tenantCompensationName;

	/**
	 * 借家賠償補償対象者氏名カナ(tenantCompensationNameKana)
	 */
//	@CustomizeTypeSizeString(max=30, regexp="", message="E00001", params="{tenantCompensationNameKana.label;max.30;enter.event}")
	private String tenantCompensationNameKana;

	/**
	 * 基礎工事含む(includFoundationWork)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{includFoundationWork.label;max.1;enter.event}")
	private String includFoundationWork;

	/**
	 * 畳・建具等含む(includJoinery)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{includJoinery.label;max.1;enter.event}")
	private String includJoinery;

	/**
	 * 門・塀・垣含む(includFence)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{includFence.label;max.1;enter.event}")
	private String includFence;

	/**
	 * 物置車庫等含む(includGarage)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{includGarage.label;max.1;enter.event}")
	private String includGarage;

	/**
	 * 共用部分含む(includShared)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{includShared.label;max.1;enter.event}")
	private String includShared;

	/**
	 * 保険対象住所同異(objectAddressSame)
	 */
//	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{objectAddressSame.label;max.1;enter.event}")
	private String objectAddressSame;

	/**
	 * 保険対象郵便番号(objectYubin)
	 */
//	@CustomizeTypeSizeString(max=7, regexp="", message="E00001", params="{objectYubin.label;max.7;enter.event}")
	private String objectYubin;

	/**
	 * 保険対象住所コード(objectAddressCode)
	 */
//	@CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{objectAddressCode.label;max.10;enter.event}")
	private String objectAddressCode;

	/**
	 * 保険対象住所(objectAddress)
	 */
//	@CustomizeTypeSizeString(max=68, regexp="", message="E00001", params="{objectAddress.label;max.68;enter.event}")
	private String objectAddress;

	/**
	 * 保険対象住所カナ(objectAddressKana)
	 */
//	@CustomizeTypeSizeString(max=136, regexp="", message="E00001", params="{objectAddressKana.label;max.136;enter.event}")
	private String objectAddressKana;

	/**
	 * 保険対象住所(objectAddressFree)
	 */
//	@CustomizeTypeSizeString(max=68, regexp="", message="E00001", params="{objectAddressFree.label;max.68;enter.event}")
	private String objectAddressFree;

	/**
	 * 保険対象住所カナ(objectAddressKanaFree)
	 */
//	@CustomizeTypeSizeString(max=136, regexp="", message="E00001", params="{objectAddressKanaFree.label;max.136;enter.event}")
	private String objectAddressKanaFree;

	/**
	 * メールアドレス（確認）
	 */
	@CustomizeTypeSizeString(max = 254, regexp = "", message = "E00001", params = "{mail.label;max.254;enter.event}")
	// @CustomizeMailString(message="E00002", params="{mail.label;correct.enter.event}")
	private String mailConfirm;

	/**
	 * 門・塀・車庫価額(fenceValue)
	 */
	private Long fenceValue;

	/**
	 * 更新日時(updateTime)
	 */
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{updateTime.label;max.21;enter.event}")
	private String updateTime;


	/**
	 * 募集人名(boshunin_name)
	 */
	private String recruitmentName;

	/**
	 * 補正課所コード(hosei_kasho_cd)
	 */
	private String correctionOfficeCode;

	/**
	 * 補正割合(hosei_wariai)
	 */
	private String correctionRatio;

	private String agentShareLiquidationType;
	private String proportionType;
	private String noneManagerStoreCode1;
	private String noneManagerStoreCode2;
	private String noneManagerAgentCode1;
	private String noneManagerSelfSpecific1;
	private BigDecimal noneManagerProportion1;

	/**
	 * 非幹事2代理店コード(hknj2_dairi_cd)
	 */
	private String noneManagerAgentCode2;

	/**
	 * 非幹事2自己特定(hknj2_jiko)
	 */
	private String noneManagerSelfSpecific2;

	/**
	 * 非幹事2分担割合(hknj2_bnt_wari)
	 */
	private BigDecimal noneManagerProportion2;

	/**
	 * 質権設定有無(hosei_wariai)
	 */
	private String withPledge;

	/**
	 * 住宅支援機構融資(hosei_wariai)
	 */
	private String houseSupportFinancing;

	/**
	 * 抵当権者特約有無(hosei_wariai)
	 */
	private String withMortgageContract;

	/**
	 * 領収ハガキ不要(hosei_wariai)
	 */
	private String noneReceptPostcard;

	/**
	 * 旧証券番号(hosei_wariai)
	 */
	private String oldPolicyNo;

	/**
	 * 証券郵送選択(hosei_wariai)
	 */
	private Integer policyMailingSelection;

	/**
	 * 契約区分(keiyaku_kbn)
	 */
	private String agreeType;

	/**
	 * 法人コード・前(bef_hojin_cd)
	 */
	private String corporateCodeBefore;

	/**
	 * 法人コード・後(aft_hojin_cd)
	 */
	private String corporateCodeAfter;

	/**
	 * 代表者氏名(name_daihyo)
	 */
	private String representativeName;

	/**
	 * 代表者氏名カナ(name_daihyo_k)
	 */
	private String representativeNameKana;

	/**
	 * 個人賠償責任補償特約有無(freeWithPersonalLiability)
	 */
	private String withPersonalLiability;
	/**
	 * 借家人賠償責任補償特約有無(advanceWithTenantLiability)
	 */
	private String withTenantLiability;

	/**
	 * 個人賠償補償同異(personalLiabilityIdentical)
	 */
	private String personalLiabilityIdentical;

	/**
	 * 借家賠償補償同異(tenantLiabilityIdentical)
	 */
	private String tenantLiabilityIdentical;

	/**
	 * 募集人ID(recruitmentID)
	 */
	private String recruitmentID;

	/**
	 * 代理店特記事項カナ(agentNotesKana)
	 */
	private String agentNotesKana;

	/**
	 * 自己特定(selfSpecific )
	 */
	private String selfSpecific ;


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
     * チェック用
     */
    private String topAgentCode;

	/**
	 * 旧証券番号枝番(policy_old_eda)
	 */
	private String oldPolicyNoBranch;

	/**
	 * 担当者コード(tantosya_cd)
	 */
	@CustomizeTypeSizeString(max = 7, regexp = "^[a-zA-Z0-9]*$", message = "E00001", params = "{担当者コード;半角英数字7桁以内;入力して}")
	private String agentManagerCode;

	/**
	 * 営業課店名
	 */
	private String sectionName;

	/**
	 * 明記物件明細有無
	 */
	private String withSpecificationArticleDetail;

	/**
	 * 明記物件明細有無(withSpecificationArticleDetail)の取得
	 * @return recruitmentName
	 */
	public String getWithSpecificationArticleDetail() {
		return withSpecificationArticleDetail;
	}
	/**
	 * 明記物件明細有無(withSpecificationArticleDetail)の取得
	 * @return recruitmentName
	 */
	public void setWithSpecificationArticleDetail(String withSpecificationArticleDetail) {
		this.withSpecificationArticleDetail = withSpecificationArticleDetail;
	}

	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	/**
	 * 募集人名(boshunin_name)の取得
	 * @return recruitmentName
	 */
	public String getRecruitmentName() {
	    return recruitmentName;
	}
	/**
	 * 募集人名(boshunin_name)の設定
	 * @param recruitmentName String
	 */
	public void setRecruitmentName(String recruitmentName) {
	    this.recruitmentName = recruitmentName;
	}

	/**
	 * 補正割合(hosei_wariai)の取得
	 * @return correctionRatio
	 */
	public String getCorrectionRatio() {
	    return correctionRatio;
	}
	/**
	 * 補正割合(hosei_wariai)の設定
	 * @param correctionRatio Integer
	 */
	public void setCorrectionRatio(String correctionRatio) {
	    this.correctionRatio = correctionRatio;
	}

	/**
	 * 代理店分担清算区分(bnt_kbn)の取得
	 * @return agentShareLiquidationType
	 */
	public String getAgentShareLiquidationType() {
	    return agentShareLiquidationType;
	}
	/**
	 * 代理店分担清算区分(bnt_kbn)の設定
	 * @param agentShareLiquidationType Integer
	 */
	public void setAgentShareLiquidationType(String agentShareLiquidationType) {
	    this.agentShareLiquidationType = agentShareLiquidationType;
	}

	/**
	 * 割合・実額区分(wari_kbn)の取得
	 * @return proportionType
	 */
	public String getProportionType() {
	    return proportionType;
	}
	/**
	 * 割合・実額区分(wari_kbn)の設定
	 * @param proportionType Integer
	 */
	public void setProportionType(String proportionType) {
	    this.proportionType = proportionType;
	}

	/**
	 * 非幹事1課店コード(hknj1_katen_cd)の取得
	 * @return noneManagerStoreCode1
	 */
	public String getNoneManagerStoreCode1() {
	    return noneManagerStoreCode1;
	}
	/**
	 * 非幹事1課店コード(hknj1_katen_cd)の設定
	 * @param noneManagerStoreCode1 Integer
	 */
	public void setNoneManagerStoreCode1(String noneManagerStoreCode1) {
	    this.noneManagerStoreCode1 = noneManagerStoreCode1;
	}

	/**
	 * 非幹事1代理店コード(hknj1_dairi_cd)の取得
	 * @return noneManagerAgentCode1
	 */
	public String getNoneManagerAgentCode1() {
	    return noneManagerAgentCode1;
	}
	/**
	 * 非幹事1代理店コード(hknj1_dairi_cd)の設定
	 * @param noneManagerAgentCode1 Integer
	 */
	public void setNoneManagerAgentCode1(String noneManagerAgentCode1) {
	    this.noneManagerAgentCode1 = noneManagerAgentCode1;
	}

	/**
	 * 非幹事1自己特定(hknj1_jiko)の取得
	 * @return noneManagerSelfSpecific1
	 */
	public String getNoneManagerSelfSpecific1() {
	    return noneManagerSelfSpecific1;
	}
	/**
	 * 非幹事1自己特定(hknj1_jiko)の設定
	 * @param noneManagerSelfSpecific1 Integer
	 */
	public void setNoneManagerSelfSpecific1(String noneManagerSelfSpecific1) {
	    this.noneManagerSelfSpecific1 = noneManagerSelfSpecific1;
	}

	/**
	 * 非幹事1分担割合(hknj1_bnt_wari)の取得
	 * @return noneManagerProportion1
	 */
	public BigDecimal getNoneManagerProportion1() {
	    return noneManagerProportion1;
	}
	/**
	 * 非幹事1分担割合(hknj1_bnt_wari)の設定
	 * @param noneManagerProportion1 BigDecimal
	 */
	public void setNoneManagerProportion1(BigDecimal noneManagerProportion1) {
	    this.noneManagerProportion1 = noneManagerProportion1;
	}

	/**
	 * 非幹事2課店コード(hknj2_katen_cd)の取得
	 * @return noneManagerStoreCode2
	 */
	public String getNoneManagerStoreCode2() {
	    return noneManagerStoreCode2;
	}
	/**
	 * 非幹事2課店コード(hknj2_katen_cd)の設定
	 * @param noneManagerStoreCode2 Integer
	 */
	public void setNoneManagerStoreCode2(String noneManagerStoreCode2) {
	    this.noneManagerStoreCode2 = noneManagerStoreCode2;
	}

	/**
	 * 非幹事2代理店コード(hknj2_dairi_cd)の取得
	 * @return noneManagerAgentCode2
	 */
	public String getNoneManagerAgentCode2() {
	    return noneManagerAgentCode2;
	}
	/**
	 * 非幹事2代理店コード(hknj2_dairi_cd)の設定
	 * @param noneManagerAgentCode2 Integer
	 */
	public void setNoneManagerAgentCode2(String noneManagerAgentCode2) {
	    this.noneManagerAgentCode2 = noneManagerAgentCode2;
	}

	/**
	 * 非幹事2自己特定(hknj2_jiko)の取得
	 * @return noneManagerSelfSpecific2
	 */
	public String getNoneManagerSelfSpecific2() {
	    return noneManagerSelfSpecific2;
	}
	/**
	 * 非幹事2自己特定(hknj2_jiko)の設定
	 * @param noneManagerSelfSpecific2 Integer
	 */
	public void setNoneManagerSelfSpecific2(String noneManagerSelfSpecific2) {
	    this.noneManagerSelfSpecific2 = noneManagerSelfSpecific2;
	}

	/**
	 * 非幹事2分担割合(hknj2_bnt_wari)の取得
	 * @return noneManagerProportion2
	 */
	public BigDecimal getNoneManagerProportion2() {
	    return noneManagerProportion2;
	}
	/**
	 * 非幹事2分担割合(hknj2_bnt_wari)の設定
	 * @param noneManagerProportion2 BigDecimal
	 */
	public void setNoneManagerProportion2(BigDecimal noneManagerProportion2) {
	    this.noneManagerProportion2 = noneManagerProportion2;
	}

	/**
	 * 契約区分(keiyaku_kbn)の取得
	 * @return agreeType
	 */
	public String getAgreeType() {
	    return agreeType;
	}
	/**
	 * 契約区分(keiyaku_kbn)の設定
	 * @param agreeType String
	 */
	public void setAgreeType(String agreeType) {
	    this.agreeType = agreeType;
	}

	/**
	 * 法人コード・前(bef_hojin_cd)の取得
	 * @return corporateCodeBefore
	 */
	public String getCorporateCodeBefore() {
	    return corporateCodeBefore;
	}
	/**
	 * 法人コード・前(bef_hojin_cd)の設定
	 * @param corporateCodeBefore String
	 */
	public void setCorporateCodeBefore(String corporateCodeBefore) {
	    this.corporateCodeBefore = corporateCodeBefore;
	}

	/**
	 * 法人コード・後(aft_hojin_cd)の取得
	 * @return corporateCodeAfter
	 */
	public String getCorporateCodeAfter() {
	    return corporateCodeAfter;
	}
	/**
	 * 法人コード・後(aft_hojin_cd)の設定
	 * @param corporateCodeAfter String
	 */
	public void setCorporateCodeAfter(String corporateCodeAfter) {
	    this.corporateCodeAfter = corporateCodeAfter;
	}

	/**
	 * 代表者氏名(name_daihyo)の取得
	 * @return representativeName
	 */
	public String getRepresentativeName() {
	    return representativeName;
	}
	/**
	 * 代表者氏名(name_daihyo)の設定
	 * @param representativeName String
	 */
	public void setRepresentativeName(String representativeName) {
	    this.representativeName = representativeName;
	}

	/**
	 * 代表者氏名カナ(name_daihyo_k)の取得
	 * @return representativeNameKana
	 */
	public String getRepresentativeNameKana() {
	    return representativeNameKana;
	}
	/**
	 * 代表者氏名カナ(name_daihyo_k)の設定
	 * @param representativeNameKana String
	 */
	public void setRepresentativeNameKana(String representativeNameKana) {
	    this.representativeNameKana = representativeNameKana;
	}



	public String getMailConfirm() {
		return mailConfirm;
	}

	public void setMailConfirm(String mailConfirm) {
		this.mailConfirm = mailConfirm;
	}

	public String getMytoken() {
		return mytoken;
	}

	public void setMytoken(String mytoken) {
		this.mytoken = mytoken;
	}

	/**
	 * お申込依頼№(entryNo)の取得
	 *
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * お申込依頼№(entryNo)の設定
	 *
	 * @param entryNo String
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 一時保存画面ID(screenID)の取得
	 *
	 * @return screenID
	 */
	public String getScreenID() {
		return screenID;
	}

	/**
	 * 一時保存画面ID(screenID)の設定
	 *
	 * @param screenID String
	 */
	public void setScreenID(String screenID) {
		this.screenID = screenID;
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
	 * 建物所在地(buildingLocation)の取得
	 * @return buildingLocation
	 */
	public String getBuildingLocation() {
	    return buildingLocation;
	}
	/**
	 * 建物所在地(buildingLocation)の設定
	 * @param buildingLocation String
	 */
	public void setBuildingLocation(String buildingLocation) {
	    this.buildingLocation = buildingLocation;
	}

	/**
	 * 保険対象都道府県コード(objectPrefecturesCode)の取得
	 * @return objectPrefecturesCode
	 */
	public String getObjectPrefecturesCode() {
	    return objectPrefecturesCode;
	}
	/**
	 * 保険対象都道府県コード(objectPrefecturesCode)の設定
	 * @param objectPrefecturesCode String
	 */
	public void setObjectPrefecturesCode(String objectPrefecturesCode) {
	    this.objectPrefecturesCode = objectPrefecturesCode;
	}

	/**
	 * 商品区分(goodsType)の取得
	 *
	 * @return goodsType
	 */
	public String getGoodsType() {
		return goodsType;
	}

	/**
	 * 商品区分(goodsType)の設定
	 *
	 * @param goodsType String
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * 契約者氏名カナ(contractorNameKana)の取得
	 *
	 * @return contractorNameKana
	 */
	public String getContractorNameKana() {
		return contractorNameKana;
	}

	/**
	 * 契約者氏名カナ(contractorNameKana)の設定
	 *
	 * @param contractorNameKana String
	 */
	public void setContractorNameKana(String contractorNameKana) {
		this.contractorNameKana = contractorNameKana;
	}

	/**
	 * 契約者郵便番号(contractorPost)の取得
	 *
	 * @return contractorPost
	 */
	public String getContractorPost() {
		return contractorPost;
	}

	/**
	 * 契約者郵便番号(contractorPost)の設定
	 *
	 * @param contractorPost String
	 */
	public void setContractorPost(String contractorPost) {
		this.contractorPost = contractorPost;
	}

	/**
	 * 契約者住所コード(contractorAddressCode)の取得
	 *
	 * @return contractorAddressCode
	 */
	public String getContractorAddressCode() {
		return contractorAddressCode;
	}

	/**
	 * 契約者住所コード(contractorAddressCode)の設定
	 *
	 * @param contractorAddressCode String
	 */
	public void setContractorAddressCode(String contractorAddressCode) {
		this.contractorAddressCode = contractorAddressCode;
	}

	/**
	 * 契約者住所(contractorAddress)の取得
	 *
	 * @return contractorAddress
	 */
	public String getContractorAddress() {
		return contractorAddress;
	}

	/**
	 * 契約者住所(contractorAddress)の設定
	 *
	 * @param contractorAddress String
	 */
	public void setContractorAddress(String contractorAddress) {
		this.contractorAddress = contractorAddress;
	}

	/**
	 * 契約者住所カナ(contractorAddressKana)の取得
	 *
	 * @return contractorAddressKana
	 */
	public String getContractorAddressKana() {
		return contractorAddressKana;
	}

	/**
	 * 契約者住所カナ(contractorAddressKana)の設定
	 *
	 * @param contractorAddressKana String
	 */
	public void setContractorAddressKana(String contractorAddressKana) {
		this.contractorAddressKana = contractorAddressKana;
	}

	/**
	 * 契約者住所(contractorAddressFree)の取得
	 *
	 * @return contractorAddressFree
	 */
	public String getContractorAddressFree() {
		return contractorAddressFree;
	}

	/**
	 * 契約者住所(contractorAddressFree)の設定
	 *
	 * @param contractorAddressFree String
	 */
	public void setContractorAddressFree(String contractorAddressFree) {
		this.contractorAddressFree = contractorAddressFree;
	}

	/**
	 * 契約者住所カナ(contractorAddressKanaFree)の取得
	 *
	 * @return contractorAddressKanaFree
	 */
	public String getContractorAddressKanaFree() {
		return contractorAddressKanaFree;
	}

	/**
	 * 契約者住所カナ(contractorAddressKanaFree)の設定
	 *
	 * @param contractorAddressKanaFree String
	 */
	public void setContractorAddressKanaFree(String contractorAddressKanaFree) {
		this.contractorAddressKanaFree = contractorAddressKanaFree;
	}

	/**
	 * 契約者電話番号ー市外(contractorTelArea)の取得
	 *
	 * @return contractorTelArea
	 */
	public String getContractorTelArea() {
		return contractorTelArea;
	}

	/**
	 * 契約者電話番号ー市外(contractorTelArea)の設定
	 *
	 * @param contractorTelArea String
	 */
	public void setContractorTelArea(String contractorTelArea) {
		this.contractorTelArea = contractorTelArea;
	}

	/**
	 * 契約者電話番号ー市内(contractorTelCity)の取得
	 *
	 * @return contractorTelCity
	 */
	public String getContractorTelCity() {
		return contractorTelCity;
	}

	/**
	 * 契約者電話番号ー市内(contractorTelCity)の設定
	 *
	 * @param contractorTelCity String
	 */
	public void setContractorTelCity(String contractorTelCity) {
		this.contractorTelCity = contractorTelCity;
	}

	/**
	 * 契約者電話番号ー加入番号(contractorTelNo)の取得
	 *
	 * @return contractorTelNo
	 */
	public String getContractorTelNo() {
		return contractorTelNo;
	}

	/**
	 * 契約者電話番号ー加入番号(contractorTelNo)の設定
	 *
	 * @param contractorTelNo String
	 */
	public void setContractorTelNo(String contractorTelNo) {
		this.contractorTelNo = contractorTelNo;
	}

	/**
	 * 契約者電話番号2ー市外(contractorTel2Area)の取得
	 *
	 * @return contractorTel2Area
	 */
	public String getContractorTel2Area() {
		return contractorTel2Area;
	}

	/**
	 * 契約者電話番号2ー市外(contractorTel2Area)の設定
	 *
	 * @param contractorTel2Area String
	 */
	public void setContractorTel2Area(String contractorTel2Area) {
		this.contractorTel2Area = contractorTel2Area;
	}

	/**
	 * 契約者電話番号2ー市内(contractorTel2City)の取得
	 *
	 * @return contractorTel2City
	 */
	public String getContractorTel2City() {
		return contractorTel2City;
	}

	/**
	 * 契約者電話番号2ー市内(contractorTel2City)の設定
	 *
	 * @param contractorTel2City String
	 */
	public void setContractorTel2City(String contractorTel2City) {
		this.contractorTel2City = contractorTel2City;
	}

	/**
	 * 契約者電話番号2ー加入番号(contractorTel2No)の取得
	 *
	 * @return contractorTel2No
	 */
	public String getContractorTel2No() {
		return contractorTel2No;
	}

	/**
	 * 契約者電話番号2ー加入番号(contractorTel2No)の設定
	 *
	 * @param contractorTel2No String
	 */
	public void setContractorTel2No(String contractorTel2No) {
		this.contractorTel2No = contractorTel2No;
	}

	/**
	 * 契約者メールアドレス(contractorMail)の取得
	 *
	 * @return contractorMail
	 */
	public String getContractorMail() {
		return contractorMail;
	}

	/**
	 * 契約者メールアドレス(contractorMail)の設定
	 *
	 * @param contractorMail String
	 */
	public void setContractorMail(String contractorMail) {
		this.contractorMail = contractorMail;
	}

	/**
	 * プロモーションメール送信フラグ(promotionMailSendFlag)の取得
	 *
	 * @return promotionMailSendFlag
	 */
	public String getPromotionMailSendFlag() {
		return promotionMailSendFlag;
	}

	/**
	 * プロモーションメール送信フラグ(promotionMailSendFlag)の設定
	 *
	 * @param promotionMailSendFlag
	 *            String
	 */
	public void setPromotionMailSendFlag(String promotionMailSendFlag) {
		this.promotionMailSendFlag = promotionMailSendFlag;
	}
	/**
	 * 契約者メールアドレス(contractorMail)の取得
	 *
	 * @return contractorMail
	 */
	public String getContractorMailConfirm() {
		return contractorMailConfirm;
	}

	/**
	 * 契約者メールアドレス(contractorMailConfirm)の設定
	 *
	 * @param contractorMailConfirm String
	 */
	public void setContractorMailConfirm(String contractorMailConfirm) {
		this.contractorMailConfirm = contractorMailConfirm;
	}

	/**
	 * 契約者性別(contractorSex)の取得
	 *
	 * @return contractorSex
	 */
	public String getContractorSex() {
		return contractorSex;
	}

	/**
	 * 契約者性別(contractorSex)の設定
	 *
	 * @param contractorSex String
	 */
	public void setContractorSex(String contractorSex) {
		this.contractorSex = contractorSex;
	}

	/**
	 * 契約者生年月日(contractorBirthday)の取得
	 *
	 * @return contractorBirthday
	 */
	public String getContractorBirthday() {
		return contractorBirthday;
	}

	/**
	 * 契約者生年月日(contractorBirthday)の設定
	 *
	 * @param contractorBirthday String
	 */
	public void setContractorBirthday(String contractorBirthday) {
		this.contractorBirthday = contractorBirthday;
	}

	/**
	 * 被保険者同異(contractorIdentical)の取得
	 *
	 * @return contractorIdentical
	 */
	public String getContractorIdentical() {
		return contractorIdentical;
	}

	/**
	 * 被保険者同異(contractorIdentical)の設定
	 *
	 * @param contractorIdentical String
	 */
	public void setContractorIdentical(String contractorIdentical) {
		this.contractorIdentical = contractorIdentical;
	}

	/**
	 * 被保険者氏名(insuredName)の取得
	 *
	 * @return insuredName
	 */
	public String getInsuredName() {
		return insuredName;
	}

	/**
	 * 被保険者氏名(insuredName)の設定
	 *
	 * @param insuredName String
	 */
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	/**
	 * 被保険者氏名カナ(insuredNameKaNa)の取得
	 *
	 * @return insuredNameKaNa
	 */
	public String getInsuredNameKaNa() {
		return insuredNameKaNa;
	}

	/**
	 * 被保険者氏名カナ(insuredNameKaNa)の設定
	 *
	 * @param insuredNameKaNa String
	 */
	public void setInsuredNameKaNa(String insuredNameKaNa) {
		this.insuredNameKaNa = insuredNameKaNa;
	}

	/**
	 * 個人賠償補償対象者氏名(personalLiabilityName)の取得
	 *
	 * @return personalLiabilityName
	 */
	public String getPersonalLiabilityName() {
		return personalLiabilityName;
	}

	/**
	 * 個人賠償補償対象者氏名(personalLiabilityName)の設定
	 *
	 * @param personalLiabilityName String
	 */
	public void setPersonalLiabilityName(String personalLiabilityName) {
		this.personalLiabilityName = personalLiabilityName;
	}

	/**
	 * 個人賠償補償対象者氏名カナ(personalLiabilityNameKana)の取得
	 *
	 * @return personalLiabilityNameKana
	 */
	public String getPersonalLiabilityNameKana() {
		return personalLiabilityNameKana;
	}

	/**
	 * 個人賠償補償対象者氏名カナ(personalLiabilityNameKana)の設定
	 *
	 * @param personalLiabilityNameKana String
	 */
	public void setPersonalLiabilityNameKana(String personalLiabilityNameKana) {
		this.personalLiabilityNameKana = personalLiabilityNameKana;
	}

	/**
	 * 借家賠償補償対象者氏名(tenantCompensationName)の取得
	 *
	 * @return tenantCompensationName
	 */
	public String getTenantCompensationName() {
		return tenantCompensationName;
	}

	/**
	 * 借家賠償補償対象者氏名(tenantCompensationName)の設定
	 *
	 * @param tenantCompensationName String
	 */
	public void setTenantCompensationName(String tenantCompensationName) {
		this.tenantCompensationName = tenantCompensationName;
	}

	/**
	 * 借家賠償補償対象者氏名カナ(tenantCompensationNameKana)の取得
	 *
	 * @return tenantCompensationNameKana
	 */
	public String getTenantCompensationNameKana() {
		return tenantCompensationNameKana;
	}

	/**
	 * 借家賠償補償対象者氏名カナ(tenantCompensationNameKana)の設定
	 *
	 * @param tenantCompensationNameKana String
	 */
	public void setTenantCompensationNameKana(String tenantCompensationNameKana) {
		this.tenantCompensationNameKana = tenantCompensationNameKana;
	}

	/**
	 * 基礎工事含む(includFoundationWork)の取得
	 *
	 * @return includFoundationWork
	 */
	public String getIncludFoundationWork() {
		return includFoundationWork;
	}

	/**
	 * 基礎工事含む(includFoundationWork)の設定
	 *
	 * @param includFoundationWork String
	 */
	public void setIncludFoundationWork(String includFoundationWork) {
		this.includFoundationWork = includFoundationWork;
	}

	/**
	 * 畳・建具等含む(includJoinery)の取得
	 *
	 * @return includJoinery
	 */
	public String getIncludJoinery() {
		return includJoinery;
	}

	/**
	 * 畳・建具等含む(includJoinery)の設定
	 *
	 * @param includJoinery String
	 */
	public void setIncludJoinery(String includJoinery) {
		this.includJoinery = includJoinery;
	}

	/**
	 * 門・塀・垣含む(includFence)の取得
	 *
	 * @return includFence
	 */
	public String getIncludFence() {
		return includFence;
	}

	/**
	 * 門・塀・垣含む(includFence)の設定
	 *
	 * @param includFence String
	 */
	public void setIncludFence(String includFence) {
		this.includFence = includFence;
	}

	/**
	 * 物置車庫等含む(includGarage)の取得
	 *
	 * @return includGarage
	 */
	public String getIncludGarage() {
		return includGarage;
	}

	/**
	 * 物置車庫等含む(includGarage)の設定
	 *
	 * @param includGarage String
	 */
	public void setIncludGarage(String includGarage) {
		this.includGarage = includGarage;
	}

	/**
	 * 共用部分含む(includShared)の取得
	 *
	 * @return includShared
	 */
	public String getIncludShared() {
		return includShared;
	}

	/**
	 * 共用部分含む(includShared)の設定
	 *
	 * @param includShared String
	 */
	public void setIncludShared(String includShared) {
		this.includShared = includShared;
	}

	/**
	 * 保険対象住所同異(objectAddressSame)の取得
	 *
	 * @return objectAddressSame
	 */
	public String getObjectAddressSame() {
		return objectAddressSame;
	}

	/**
	 * 保険対象住所同異(objectAddressSame)の設定
	 *
	 * @param objectAddressSame String
	 */
	public void setObjectAddressSame(String objectAddressSame) {
		this.objectAddressSame = objectAddressSame;
	}

	/**
	 * 保険対象郵便番号(objectYubin)の取得
	 *
	 * @return objectYubin
	 */
	public String getObjectYubin() {
		return objectYubin;
	}

	/**
	 * 保険対象郵便番号(objectYubin)の設定
	 *
	 * @param objectYubin String
	 */
	public void setObjectYubin(String objectYubin) {
		this.objectYubin = objectYubin;
	}

	/**
	 * 保険対象住所コード(objectAddressCode)の取得
	 *
	 * @return objectAddressCode
	 */
	public String getObjectAddressCode() {
		return objectAddressCode;
	}

	/**
	 * 保険対象住所コード(objectAddressCode)の設定
	 *
	 * @param objectAddressCode String
	 */
	public void setObjectAddressCode(String objectAddressCode) {
		this.objectAddressCode = objectAddressCode;
	}

	/**
	 * 保険対象住所(objectAddress)の取得
	 *
	 * @return objectAddress
	 */
	public String getObjectAddress() {
		return objectAddress;
	}

	/**
	 * 保険対象住所(objectAddress)の設定
	 *
	 * @param objectAddress String
	 */
	public void setObjectAddress(String objectAddress) {
		this.objectAddress = objectAddress;
	}

	/**
	 * 保険対象住所カナ(objectAddressKana)の取得
	 *
	 * @return objectAddressKana
	 */
	public String getObjectAddressKana() {
		return objectAddressKana;
	}

	/**
	 * 保険対象住所カナ(objectAddressKana)の設定
	 *
	 * @param objectAddressKana String
	 */
	public void setObjectAddressKana(String objectAddressKana) {
		this.objectAddressKana = objectAddressKana;
	}

	/**
	 * 保険対象住所(objectAddressFree)の取得
	 *
	 * @return objectAddressFree
	 */
	public String getObjectAddressFree() {
		return objectAddressFree;
	}

	/**
	 * 保険対象住所(objectAddressFree)の設定
	 *
	 * @param objectAddressFree String
	 */
	public void setObjectAddressFree(String objectAddressFree) {
		this.objectAddressFree = objectAddressFree;
	}

	/**
	 * 保険対象住所カナ(objectAddressKanaFree)の取得
	 *
	 * @return objectAddressKanaFree
	 */
	public String getObjectAddressKanaFree() {
		return objectAddressKanaFree;
	}

	/**
	 * 保険対象住所カナ(objectAddressKanaFree)の設定
	 *
	 * @param objectAddressKanaFree String
	 */
	public void setObjectAddressKanaFree(String objectAddressKanaFree) {
		this.objectAddressKanaFree = objectAddressKanaFree;
	}


	/**
	 * 個人賠償責任補償特約有無(withPersonalLiability)の取得
	 *
	 * @return withPersonalLiability
	 */
	public String getWithPersonalLiability() {
		return this.withPersonalLiability;
	}
	/**
	 * 個人賠償責任補償特約有無(withPersonalLiability)の設定
	 *
	 * @param withPersonalLiability
	 *            String
	 */
	public void setWithPersonalLiability(String withPersonalLiability) {
		this.withPersonalLiability = withPersonalLiability;
	}
	/**
	 * 借家人賠償責任補償特約有無(withTenantLiability)の取得
	 *
	 * @return withTenantLiability
	 */
	public String getWithTenantLiability() {
		return this.withTenantLiability;
	}
	/**
	 * 借家人賠償責任補償特約有無(withTenantLiability)の設定
	 *
	 * @param withTenantLiability
	 *            String
	 */
	public void setWithTenantLiability(String withTenantLiability) {
		this.withTenantLiability = withTenantLiability;
	}

	/**
	 * 個人賠償補償同異(personalLiabilityIdentical)の取得
	 * @return personalLiabilityIdentical
	 */
	public String getPersonalLiabilityIdentical() {
	    return personalLiabilityIdentical;
	}
	/**
	 * 個人賠償補償同異(personalLiabilityIdentical)の設定
	 * @param personalLiabilityIdentical String
	 */
	public void setPersonalLiabilityIdentical(String personalLiabilityIdentical) {
	    this.personalLiabilityIdentical = personalLiabilityIdentical;
	}

	/**
	 * 借家賠償補償同異(tenantLiabilityIdentical)の取得
	 * @return tenantLiabilityIdentical
	 */
	public String getTenantLiabilityIdentical() {
	    return tenantLiabilityIdentical;
	}
	/**
	 * 借家賠償補償同異(tenantLiabilityIdentical)の設定
	 * @param tenantLiabilityIdentical String
	 */
	public void setTenantLiabilityIdentical(String tenantLiabilityIdentical) {
	    this.tenantLiabilityIdentical = tenantLiabilityIdentical;
	}

	/**
	 * 募集人ID(recruitmentID)の取得
	 * @return recruitmentID
	 */
	public String getRecruitmentID() {
	    return recruitmentID;
	}
	/**
	 * 募集人ID(recruitmentID)の設定
	 * @param recruitmentID String
	 */
	public void setRecruitmentID(String recruitmentID) {
	    this.recruitmentID = recruitmentID;
	}

	/**
	 * 補正箇所コード(correctionOfficeCode)の取得
	 * @return correctionOfficeCode
	 */
	public String getCorrectionOfficeCode() {
	    return correctionOfficeCode;
	}
	/**
	 * 補正箇所コード(correctionOfficeCode)の設定
	 * @param correctionOfficeCode String
	 */
	public void setCorrectionOfficeCode(String correctionOfficeCode) {
	    this.correctionOfficeCode = correctionOfficeCode;
	}

	/**
	 * 質権設定有無(withPledge)の取得
	 * @return withPledge
	 */
	public String getWithPledge() {
		return withPledge;
	}
	/**
	 * 質権設定有無(withPledge)の設定
	 * @param withPledge String
	 */
	public void setWithPledge(String withPledge) {
		this.withPledge = withPledge;
	}

	/**
	 * 住宅支援機構融資(houseSupportFinancing)の取得
	 * @return houseSupportFinancing
	 */
	public String getHouseSupportFinancing() {
		return houseSupportFinancing;
	}
	/**
	 * 住宅支援機構融資(houseSupportFinancing)の設定
	 * @param houseSupportFinancing String
	 */
	public void setHouseSupportFinancing(String houseSupportFinancing) {
		this.houseSupportFinancing = houseSupportFinancing;
	}

	/**
	 * 抵当権者特約有無(withMortgageContract)の取得
	 * @return withMortgageContract
	 */
	public String getWithMortgageContract() {
		return withMortgageContract;
	}
	/**
	 * 抵当権者特約有無(withMortgageContract)の設定
	 * @param withMortgageContract String
	 */
	public void setWithMortgageContract(String withMortgageContract) {
		this.withMortgageContract = withMortgageContract;
	}

	/**
	 * 領収ハガキ不要(noneReceptPostcard)の取得
	 * @return noneReceptPostcard
	 */
	public String getNoneReceptPostcard() {
		return noneReceptPostcard;
	}
	/**
	 * 領収ハガキ不要(noneReceptPostcard)の設定
	 * @param noneReceptPostcard String
	 */
	public void setNoneReceptPostcard(String noneReceptPostcard) {
		this.noneReceptPostcard = noneReceptPostcard;
	}

	/**
	 * 旧証券番号(oldPolicyNo)の取得
	 * @return oldPolicyNo
	 */
	public String getOldPolicyNo() {
		return oldPolicyNo;
	}
	/**
	 * 旧証券番号(oldPolicyNo)の設定
	 * @param oldPolicyNo String
	 */
	public void setOldPolicyNo(String oldPolicyNo) {
		this.oldPolicyNo = oldPolicyNo;
	}

	/**
	 * 証券郵送選択(paper_policy_send)の取得
	 * @return policyMailingSelection
	 */
	public Integer getPolicyMailingSelection() {
	    return policyMailingSelection;
	}
	/**
	 * 証券郵送選択(paper_policy_send)の設定
	 * @param policyMailingSelection Integer
	 */
	public void setPolicyMailingSelection(Integer policyMailingSelection) {
	    this.policyMailingSelection = policyMailingSelection;
	}

	/**
	 * 代理店特記事項カナ(agentNotesKana)の取得
	 * @return agentNotesKana
	 */
	public String getAgentNotesKana() {
	    return agentNotesKana;
	}
	/**
	 * 代理店特記事項カナ(agentNotesKana)の設定
	 * @param agentNotesKana String
	 */
	public void setAgentNotesKana(String agentNotesKana) {
	    this.agentNotesKana = agentNotesKana;
	}

	/**
	 * 自己特定(selfSpecific )の取得
	 * @return selfSpecific
	 */
	public String getSelfSpecific () {
	    return selfSpecific ;
	}
	/**
	 * 自己特定(selfSpecific )の設定
	 * @param selfSpecific  String
	 */
	public void setSelfSpecific (String selfSpecific ) {
	    this.selfSpecific  = selfSpecific ;
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


	public String getTopAgentCode() {
		return topAgentCode;
	}
	public void setTopAgentCode(String topAgentCode) {
		this.topAgentCode = topAgentCode;
	}
	/**
	 * 更新日時(updateTime)の取得
	 *
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時(updateTime)の設定
	 *
	 * @param updateTime String
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * ご契約者名(contractorName)の取得
	 *
	 * @return contractorName
	 */
	public String getContractorName() {
		return contractorName;
	}

	/**
	 * ご契約者名(contractorName)の設定
	 *
	 * @param contractorName String
	 */
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}

	/**
	 * 門・塀・車庫価額(fenceValue)の取得
	 *
	 * @return fenceValue
	 */
	public Long getFenceValue() {
		return fenceValue;
	}

	/**
	 * 門・塀・車庫価額(fenceValue)の設定
	 *
	 * @param fenceValue Long
	 */
	public void setFenceValue(Long fenceValue) {
		this.fenceValue = fenceValue;
	}

	/**
	 * 旧証券番号枝番(oldPolicyNoBranch)の取得
	 *
	 * @return oldPolicyNoBranch
	 */
	public String getOldPolicyNoBranch() {
		return oldPolicyNoBranch;
	}

	/**
	 * 旧証券番号枝番(oldPolicyNoBranch)の設定
	 *
	 * @param oldPolicyNoBranch
	 *            String
	 */
	public void setOldPolicyNoBranch(String oldPolicyNoBranch) {
		this.oldPolicyNoBranch = oldPolicyNoBranch;
	}

	/**
	 * 担当者コード(managerCode)の取得
	 *
	 * @return managerCode
	 */
	public String getAgentManagerCode() {
		return agentManagerCode;
	}

	/**
	 * 担当者コード(managerCode)の設定
	 *
	 * @param managerCode
	 *            String
	 */
	public void setAgentManagerCode(String agentManagerCode) {
		this.agentManagerCode = agentManagerCode;
	}
}

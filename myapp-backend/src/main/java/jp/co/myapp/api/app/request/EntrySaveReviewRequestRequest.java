package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeStringArrays;

public class EntrySaveReviewRequestRequest extends EntrySaveTempSaveRequest implements Serializable {

	private static final long serialVersionUID = 261859282470409912L;

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
	 * 商品区分(goodsType)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{goodsType.label;max.1;enter.event}")
	private String goodsType;

	/**
	 * ファイルID(fileId)
	 */
	@CustomizeTypeSizeStringArrays(max = 32, regexp = "", message = "E00001", params = "{fileId.label;max.32;enter.event}")
	private String[] fileId;

	/**
	 * 確認書類提出方法(documentsConfirmMethod)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{documentsConfirmMethod.label;max.1;enter.event}")
	private String documentsConfirmMethod;

	/**
	 * 審査依頼日(reviewRequestDate)
	 */
	@CustomizeTypeSizeString(max = 8, regexp = "", message = "E00001", params = "{reviewRequestDate.label;max.8;enter.event}")
	private String reviewRequestDate;

	/**
	 * 更新日時(updateTime)
	 */
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{updateTime.label;max.21;enter.event}")
	private String updateTime;
	
    // 耐火性能郵送フラグ
	private Integer fireResistanceMailingFlag;
    // 地震保険郵送フラグ
	private Integer earthquakeDiscountMailingFlag;

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
	 * @param entryNo
	 *            String
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
	 * @param screenID
	 *            String
	 */
	public void setScreenID(String screenID) {
		this.screenID = screenID;
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
	 * @param goodsType
	 *            String
	 */
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * ファイルID(fileId)の取得
	 * 
	 * @return fileId
	 */
	public String[] getFileId() {
		return fileId;
	}

	/**
	 * ファイルID(fileId)の設定
	 * 
	 * @param fileId
	 *            String[]
	 */
	public void setFileId(String[] fileId) {
		this.fileId = fileId;
	}

	/**
	 * 確認書類提出方法(documentsConfirmMethod)の取得
	 * 
	 * @return documentsConfirmMethod
	 */
	public String getDocumentsConfirmMethod() {
		return documentsConfirmMethod;
	}

	/**
	 * 確認書類提出方法(documentsConfirmMethod)の設定
	 * 
	 * @param documentsConfirmMethod
	 *            String
	 */
	public void setDocumentsConfirmMethod(String documentsConfirmMethod) {
		this.documentsConfirmMethod = documentsConfirmMethod;
	}

	/**
	 * 審査依頼日(reviewRequestDate)の取得
	 * 
	 * @return reviewRequestDate
	 */
	public String getReviewRequestDate() {
		return reviewRequestDate;
	}

	/**
	 * 審査依頼日(reviewRequestDate)の設定
	 * 
	 * @param reviewRequestDate
	 *            String
	 */
	public void setReviewRequestDate(String reviewRequestDate) {
		this.reviewRequestDate = reviewRequestDate;
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
	 * @param updateTime
	 *            String
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getFireResistanceMailingFlag() {
		return fireResistanceMailingFlag;
	}

	public void setFireResistanceMailingFlag(Integer fireResistanceMailingFlag) {
		this.fireResistanceMailingFlag = fireResistanceMailingFlag;
	}

	public Integer getEarthquakeDiscountMailingFlag() {
		return earthquakeDiscountMailingFlag;
	}

	public void setEarthquakeDiscountMailingFlag(Integer earthquakeDiscountMailingFlag) {
		this.earthquakeDiscountMailingFlag = earthquakeDiscountMailingFlag;
	}


}

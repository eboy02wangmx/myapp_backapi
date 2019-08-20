package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

/**
 * 一時保存 共通リクエストパラメータ
 */
public abstract class BaseEntrySaveRequest implements Serializable {

	private static final long serialVersionUID = 2977592650947618214L;

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
	 * 申込ステータス(entryStatus)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{entryStatus.label;max.1;enter.event}")
	private String entryStatus;

	/**
	 * 申込区分(entryType)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{entryType.label;max.1;enter.event}")
	private String entryType;

	/**
	 * 商品区分(goodsType)
	 */
	@CustomizeTypeSizeString(max = 1, regexp = "", message = "E00001", params = "{goodsType.label;max.1;enter.event}")
	private String goodsType;

	/**
	 * 代理店コード(agentCode)
	 */
	@CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{agentCode.label;max.10;enter.event}")
	private String agentCode;

	/**
	 * 代理店名称(agentName)
	 */
	@CustomizeTypeSizeString(max=20, regexp="", message="E00001", params="{agentName.label;max.20;enter.event}")
	private String agentName;

	/**
	 * 営業課店コード(katen_cd)
	 */
	private String salesCode;

	/**
	 * 課店コード名称(katen_name)
	 */
	private String storeName;

	/**
	 * 更新日時(updateTime)
	 */
	@CustomizeTypeSizeString(max = 21, regexp = "", message = "E00001", params = "{updateTime.label;max.21;enter.event}")
	private String updateTime;

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
	 * 申込ステータス(entryStatus)の取得
	 *
	 * @return entryStatus
	 */
	public String getEntryStatus() {
		return entryStatus;
	}

	/**
	 * 申込ステータス(entryStatus)の設定
	 *
	 * @param entryStatus String
	 */
	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
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
	 * @param entryType String
	 */
	public void setEntryType(String entryType) {
		this.entryType = entryType;
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
	 * 代理店コード(agentCode)の取得
	 *
	 * @return agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}

	/**
	 * 代理店コード(agentCode)の設定
	 *
	 * @param agentCode String
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	/**
	 * 代理店名称(agentName)の取得
	 *
	 * @return agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * 代理店名称(agentName)の設定
	 *
	 * @param agentName String
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * 営業課店コード(katen_cd)の取得
	 * @return salesCode
	 */
	public String getSalesCode() {
	    return salesCode;
	}
	/**
	 * 営業課店コード(katen_cd)の設定
	 * @param salesCode String
	 */
	public void setSalesCode(String salesCode) {
	    this.salesCode = salesCode;
	}

	/**
	 * 課店名称(katen_name)の取得
	 * @return storeName
	 */
	public String getStoreName() {
	    return storeName;
	}
	/**
	 * 課店名称(katen_name)の設定
	 * @param storeName String
	 */
	public void setStoreName(String storeName) {
	    this.storeName = storeName;
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
}

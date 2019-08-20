package jp.co.myapp.api.app.request;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EntrySaveMoneyCollectionRequest extends EntrySaveTempSaveRequest {

	private static final long serialVersionUID = -60260714908934297L;

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

}

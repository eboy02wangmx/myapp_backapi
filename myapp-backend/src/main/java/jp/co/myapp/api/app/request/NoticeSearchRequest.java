package jp.co.myapp.api.app.request;

import java.util.Date;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class NoticeSearchRequest {
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
	
	private Date sysDate;

	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Date getSysDate() {
		return sysDate;
	}

	public void setSysDate(Date sysDate) {
		this.sysDate = sysDate;
	}

	
	
}

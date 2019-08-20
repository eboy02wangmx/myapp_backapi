package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class EntryTempSaveSearchDetailRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込依頼№(entryNo)
	 */
	private String entryNo;

	/**
	 * 商品区分(goodsType)
	 */
	private String goodsType;

	/**
	 * 証券番号の取得
	 * 
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 証券番号の設定
	 * 
	 * @param entryNo
	 *            String
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
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

}

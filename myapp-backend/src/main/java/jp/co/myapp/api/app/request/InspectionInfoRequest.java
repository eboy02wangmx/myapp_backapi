package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class InspectionInfoRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -228703546537996665L;

	/**
	 * 商品区分(goodsType)
	 */
	private String goodsType;

	/**
	 * 申込依頼№(entryNo)
	 */
	private String entryNo;
	
	/**
	 * no(no)
	 */
	private String no;

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
	 * 申込依頼№(entryNo)の取得
	 * 
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼№(entryNo)の設定
	 * 
	 * @param entryNo
	 *            String
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}
	
	/**
	 * no(no)の取得
	 * 
	 * @return no
	 */
	public String getNo() {
		return no;
	}

	/**
	 * no(no)の設定
	 * 
	 * @param no
	 *            String
	 */
	public void setNo(String no) {
		this.no = no;
	}

}

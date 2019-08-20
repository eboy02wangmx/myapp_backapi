package jp.co.myapp.api.app.request;

import java.io.Serializable;

public class EntrySaveDetailUpdateRequest implements Serializable {

	/**
	 * シリアルバージョンUID
	 */
	private static final long serialVersionUID = 3026454456026048024L;

	/**
	 * 申込依頼NO(entryNo)
	 */
	private String entryNo;

	/**
	 * 見送り(escort)
	 */
	private String escort;

	/**
	 * 更新日時(updateTime)
	 */
	private String updateTime;

	/**
	 * メール送信許可(promotionMailSendFlag)
	 */
	private String promotionMailSendFlag;

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
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 見送りの取得
	 * 
	 * @return escort
	 */
	public String getEscort() {
		return escort;
	}

	/**
	 * 見送りの設定
	 * 
	 * @param escort
	 */
	public void setEscort(String escort) {
		this.escort = escort;
	}

	/**
	 * 更新日時の取得
	 * 
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * 更新日時の設定
	 * 
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * メール送信許可の取得
	 * 
	 * @return promotionMailSendFlag
	 */
	public String getPromotionMailSendFlag() {
		return promotionMailSendFlag;
	}

	/**
	 * メール送信許可の設定
	 * 
	 * @param promotionMailSendFlag
	 */
	public void setPromotionMailSendFlag(String promotionMailSendFlag) {
		this.promotionMailSendFlag = promotionMailSendFlag;
	}

}

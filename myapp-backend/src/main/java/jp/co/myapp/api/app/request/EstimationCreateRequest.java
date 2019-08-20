package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeMailString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EstimationCreateRequest implements Serializable {

	private static final long serialVersionUID = -3265839323589085471L;

	/**
	 * 処理モード
	 */
	private String mode;

	/**
	 * メールアドレス
	 */
	@CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{mail.label;max.254;enter.event}")
	@CustomizeMailString(message="E00002", params="{mail.label;correct.enter.event}")
	private String mail;

	/**
	 * 申込依頼№
	 */
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;max.9;enter.event}")
	private String entryNo;

	/**
	 * selectPlan
	 */
	@CustomizeTypeSizeString(max=1, regexp="", message="E00001", params="{selectPlan.label;max.1;enter.event}")
	private String selectPlan;

	/**
	 * @return selectPlan
	 */
	public String getSelectPlan() {
		return selectPlan;
	}

	/**
	 * @param selectPlan セットする selectPlan
	 */
	public void setSelectPlan(String selectPlan) {
		this.selectPlan = selectPlan;
	}

	/**
	 * 処理モードを取得
	 * 
	 * @return 処理モード
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * 処理モードを設定
	 * 
	 * @param mode 処理モード
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * メールアドレスを取得
	 * 
	 * @return メールアドレス
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * メールアドレスを設定
	 * 
	 * @param mail メールアドレス
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * 申込依頼№を取得
	 * 
	 * @return 申込依頼№
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼№を設定
	 * 
	 * @param entryNo 申込依頼№
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

}

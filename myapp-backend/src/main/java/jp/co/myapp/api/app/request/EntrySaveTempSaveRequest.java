package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeMailString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class EntrySaveTempSaveRequest extends BaseEntrySaveRequest implements Serializable {

	private static final long serialVersionUID = -4252386316188695655L;

	/**
	 * ご契約者名(contractorName)
	 */
	@CustomizeTypeSizeString(max = 30, regexp = "", message = "E00001", params = "{contractorName.label;max.30;enter.event}")
	private String contractorName;

	/**
	 * メールアドレス(mail)
	 */
	@CustomizeTypeSizeString(max = 254, regexp = "", message = "E00001", params = "{mail.label;max.254;enter.event}")
	@CustomizeMailString(message="E00002", params="{mail.label;correct.enter.event}")
	private String mail;

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
	 * メールアドレス(mail)の取得
	 *
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * メールアドレス(mail)の設定
	 *
	 * @param mail String
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
}

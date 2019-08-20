package jp.co.myapp.api.app.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;
import jp.co.myapp.common.Constants;

public class AgentShareInputRequest implements Serializable {

	private static final long serialVersionUID = 2222222L;

	/**
	 * 申込依頼№
	 */
	private String entryNo;

	/**
	 * 非幹事1課店コード
	 */
	@CustomizeTypeSizeString(max=4, regexp="", message="E00001", params="{noneManagerStoreCode1.label;max.4;enter.event}")
	private String noneManagerStoreCode1;

	/**
	 * 非幹事1代理店コード
	 */
	private String noneManagerAgentCode1;

	/**
	 * 非幹事1自己特定
	 */
	private String noneManagerSelfSpecific1;

	/**
	 * 非幹事1分担割合
	 */
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{noneManagerProportion1.label;max.6;enter.event}")
	private String noneManagerProportion1;

	/**
	 * 非幹事2課店コード
	 */
	@CustomizeTypeSizeString(max=4, regexp="", message="E00001", params="{noneManagerStoreCode2.label;max.4;enter.event}")
	private String noneManagerStoreCode2;

	/**
	 * 非幹事2代理店コード
	 */
	private String noneManagerAgentCode2;

	/**
	 * 非幹事2自己特定
	 */
	private String noneManagerSelfSpecific2;

	/**
	 * 非幹事2分担割合
	 */
	@CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{noneManagerProportion2.label;max.6;enter.event}")
	private String noneManagerProportion2;

	/**
	 * 幹事課店コード
	 */
	private String mainManagerStoreCode;

	/**
	 * 幹事代理店コード
	 */
	private String mainManagerAgentCode;

	/**
	 * 幹事自己特定
	 */
	private String mainManagerSelfSpecific;

	/**
	 * 幹事分担割合
	 */
	private String mainManagerProportion;

	/**
	 * 幹事代理店の割合
	 */
	private String managerAgentProportion;

	/**
	 * 更新日時(newDate)
	 */
	@JsonFormat(pattern = Constants.DATE_FORMAT_YYYYMMDDHHMMSS, timezone = Constants.API_TIME_ZONE)
	private Date newDate;

	/**
	 * @return the entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * @param entryNo
	 *            the entryNo to set
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	/**
	 * 非幹事1課店コード(noneManagerStoreCode1)の取得
	 *
	 * @return noneManagerStoreCode1
	 */
	public String getNoneManagerStoreCode1() {
		return noneManagerStoreCode1;
	}

	/**
	 * 非幹事1課店コード(noneManagerStoreCode1)の設定
	 *
	 * @param noneManagerStoreCode1
	 *            String
	 */
	public void setNoneManagerStoreCode1(String noneManagerStoreCode1) {
		this.noneManagerStoreCode1 = noneManagerStoreCode1;
	}

	/**
	 * 非幹事1代理店コード(noneManagerAgentCode1)の取得
	 *
	 * @return noneManagerAgentCode1
	 */
	public String getNoneManagerAgentCode1() {
		return noneManagerAgentCode1;
	}

	/**
	 * 非幹事1代理店コード(noneManagerAgentCode1)の設定
	 *
	 * @param noneManagerAgentCode1
	 *            String
	 */
	public void setNoneManagerAgentCode1(String noneManagerAgentCode1) {
		this.noneManagerAgentCode1 = noneManagerAgentCode1;
	}

	/**
	 * 非幹事1自己特定(noneManagerSelfSpecific1)の取得
	 *
	 * @return noneManagerSelfSpecific1
	 */
	public String getNoneManagerSelfSpecific1() {
		return noneManagerSelfSpecific1;
	}

	/**
	 * 非幹事1自己特定(noneManagerSelfSpecific1)の設定
	 *
	 * @param noneManagerSelfSpecific1
	 *            String
	 */
	public void setNoneManagerSelfSpecific1(String noneManagerSelfSpecific1) {
		this.noneManagerSelfSpecific1 = noneManagerSelfSpecific1;
	}

	/**
	 * 非幹事1分担割合(noneManagerProportion1)の取得
	 *
	 * @return noneManagerProportion1
	 */
	public String getNoneManagerProportion1() {
		return noneManagerProportion1;
	}

	/**
	 * 非幹事1分担割合(noneManagerProportion1)の設定
	 *
	 * @param noneManagerProportion1
	 *            String
	 */
	public void setNoneManagerProportion1(String noneManagerProportion1) {
		this.noneManagerProportion1 = noneManagerProportion1;
	}

	/**
	 * 非幹事2課店コード(noneManagerStoreCode2)の取得
	 *
	 * @return noneManagerStoreCode2
	 */
	public String getNoneManagerStoreCode2() {
		return noneManagerStoreCode2;
	}

	/**
	 * 非幹事2課店コード(noneManagerStoreCode2)の設定
	 *
	 * @param noneManagerStoreCode2
	 *            String
	 */
	public void setNoneManagerStoreCode2(String noneManagerStoreCode2) {
		this.noneManagerStoreCode2 = noneManagerStoreCode2;
	}

	/**
	 * 非幹事2代理店コード(noneManagerAgentCode2)の取得
	 *
	 * @return noneManagerAgentCode2
	 */
	public String getNoneManagerAgentCode2() {
		return noneManagerAgentCode2;
	}

	/**
	 * 非幹事2代理店コード(noneManagerAgentCode2)の設定
	 *
	 * @param noneManagerAgentCode2
	 *            String
	 */
	public void setNoneManagerAgentCode2(String noneManagerAgentCode2) {
		this.noneManagerAgentCode2 = noneManagerAgentCode2;
	}

	/**
	 * 非幹事2自己特定(noneManagerSelfSpecific2)の取得
	 *
	 * @return noneManagerSelfSpecific2
	 */
	public String getNoneManagerSelfSpecific2() {
		return noneManagerSelfSpecific2;
	}

	/**
	 * 非幹事2自己特定(noneManagerSelfSpecific2)の設定
	 *
	 * @param noneManagerSelfSpecific2
	 *            String
	 */
	public void setNoneManagerSelfSpecific2(String noneManagerSelfSpecific2) {
		this.noneManagerSelfSpecific2 = noneManagerSelfSpecific2;
	}

	/**
	 * 非幹事2分担割合(noneManagerProportion2)の取得
	 *
	 * @return noneManagerProportion2
	 */
	public String getNoneManagerProportion2() {
		return noneManagerProportion2;
	}

	/**
	 * 非幹事2分担割合(noneManagerProportion2)の設定
	 *
	 * @param noneManagerProportion2
	 *            String
	 */
	public void setNoneManagerProportion2(String noneManagerProportion2) {
		this.noneManagerProportion2 = noneManagerProportion2;
	}

	/**
	 * 幹事課店コード(mainManagerStoreCode)の取得
	 *
	 * @return mainManagerStoreCode
	 */
	public String getMainManagerStoreCode() {
		return mainManagerStoreCode;
	}

	/**
	 * 幹事課店コード(mainManagerStoreCode)の設定
	 *
	 * @param mainManagerStoreCode
	 *            String
	 */
	public void setMainManagerStoreCode(String mainManagerStoreCode) {
		this.mainManagerStoreCode = mainManagerStoreCode;
	}

	/**
	 * 幹事代理店コード(mainManagerAgentCode)の取得
	 *
	 * @return mainManagerAgentCode
	 */
	public String getMainManagerAgentCode() {
		return mainManagerAgentCode;
	}

	/**
	 * 幹事代理店コード(mainManagerAgentCode)の設定
	 *
	 * @param mainManagerAgentCode
	 *            String
	 */
	public void setMainManagerAgentCode(String mainManagerAgentCode) {
		this.mainManagerAgentCode = mainManagerAgentCode;
	}

	/**
	 * 幹事自己特定(mainManagerSelfSpecific)の取得
	 *
	 * @return mainManagerSelfSpecific
	 */
	public String getMainManagerSelfSpecific() {
		return mainManagerSelfSpecific;
	}

	/**
	 * 幹事自己特定(mainManagerSelfSpecific)の設定
	 *
	 * @param mainManagerSelfSpecific
	 *            String
	 */
	public void setMainManagerSelfSpecific(String mainManagerSelfSpecific) {
		this.mainManagerSelfSpecific = mainManagerSelfSpecific;
	}

	/**
	 * 幹事分担割合(mainManagerProportion)の取得
	 *
	 * @return mainManagerProportion
	 */
	public String getMainManagerProportion() {
		return mainManagerProportion;
	}

	/**
	 * 幹事分担割合(mainManagerProportion)の設定
	 *
	 * @param mainManagerProportion
	 *            String
	 */
	public void setMainManagerProportion(String mainManagerProportion) {
		this.mainManagerProportion = mainManagerProportion;
	}

	/**
	 * newDate(newDate)の取得
	 *
	 * @return newDate
	 */
	public Date getNewDate() {
		return newDate;
	}

	/**
	 * newDate(newDate)の設定
	 *
	 * @param newDate
	 *            String
	 */
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	/**
	 * managerAgentProportion(managerAgentProportion)の取得
	 *
	 * @return managerAgentProportion
	 */
	public String getManagerAgentProportion() {
		return managerAgentProportion;
	}

	/**
	 * managerAgentProportion(managerAgentProportion)の設定
	 *
	 * @param managerAgentProportion
	 *            String
	 */
	public void setManagerAgentProportion(String managerAgentProportion) {
		this.managerAgentProportion = managerAgentProportion;
	}

}

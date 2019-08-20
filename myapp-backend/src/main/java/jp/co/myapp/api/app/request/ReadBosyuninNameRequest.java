package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;

public class ReadBosyuninNameRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2119186133106524497L;
	
	/**
	 * 代理店コード(agentCode)
	 */
    @CustomizeNoNull(message="E00002", params="{'代理店コード';'入力'}")
	private String agentCode;

	/**
	 * 募集人名(recruitmentName)
	 */
    @CustomizeNoNull(message="E00002", params="{'募集人名';'入力'}")
    @CustomizeTypeSizeString(max = 128, regexp = "", message = "E00001", params = "{'募集人名';max.128;enter.event}")
	private String recruitmentName;

	/**
	 * 新代理店コード(new_dairiten_cd)
	 */
	private String newDairitenCd;

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
	 * 募集人名(recruitmentName)の取得
	 * @return recruitmentName
	 */
	public String getRecruitmentName() {
	    return recruitmentName;
	}
	/**
	 * 募集人名(recruitmentName)の設定
	 * @param recruitmentName String
	 */
	public void setRecruitmentName(String recruitmentName) {
	    this.recruitmentName = recruitmentName;
	}

	/**
	 * 代理店コード(new_dairiten_cd)の取得
	 * @return newDairitenCd
	 */
	public String getNewDairitenCd() {
	    return newDairitenCd;
	}
	/**
	 * 代理店コード(new_dairiten_cd)の設定
	 * @param newDairitenCd String
	 */
	public void setNewDairitenCd(String newDairitenCd) {
	    this.newDairitenCd = newDairitenCd;
	}
}

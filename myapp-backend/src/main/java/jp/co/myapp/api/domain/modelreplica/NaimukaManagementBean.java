package jp.co.myapp.api.domain.modelreplica;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * MG1_O_0153_所属内務課コード検索
 *
 * 変更履歴: 新規 2019/02/20 BY Sun
 */
@JsonInclude(Include.NON_NULL)
public class NaimukaManagementBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 所属内務課コード(affiliationDepartmentCode)
	 */
	private String affiliationDepartmentCode;

	/**
	 * @return affiliationDepartmentCode
	 */
	public String getAffiliationDepartmentCode() {
		return affiliationDepartmentCode;
	}

	/**
	 * @param affiliationDepartmentCode セットする affiliationDepartmentCode
	 */
	public void setAffiliationDepartmentCode(String affiliationDepartmentCode) {
		this.affiliationDepartmentCode = affiliationDepartmentCode;
	}

}
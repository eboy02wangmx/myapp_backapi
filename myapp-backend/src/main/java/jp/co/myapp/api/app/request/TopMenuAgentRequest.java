package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class TopMenuAgentRequest implements Serializable {

    /**
     * 代理店コード(dairi_cd)
     */
	@CustomizeNoNull(message="E00002", params="{agentCode.label;enter.event}")
    @CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{agentCode.label;agentCode.size;enter.event}")
    private String agentCode;

    /**
     * 見積連番(entry_no)
     */
	@CustomizeNoNull(message="E00002", params="{printNo.label;enter.event}")
    @CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{printNo.label;printNo.size;enter.event}")
    private String entryNo;


    /**
     * 代理店コード(dairi_cd)の取得
     * @return agentCode
     */
    public String getAgentCode() {
        return agentCode;
    }
    /**
     * 代理店コード(dairi_cd)の設定
     * @param agentCode String
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    /**
     * 見積連番(entry_no)の取得
     * @return entryNo
     */
    public String getEntryNo() {
        return entryNo;
    }
    /**
     * 見積連番(entry_no)の設定
     * @param entryNo String
     */
    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }
}

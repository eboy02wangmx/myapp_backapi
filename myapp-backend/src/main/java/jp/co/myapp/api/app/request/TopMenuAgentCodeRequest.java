package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class TopMenuAgentCodeRequest implements Serializable {
	
    /**
     * 代理店コード(agentCode)
     */
	@CustomizeNoNull(message="E00002", params="{agentCode.label;enter.event}")
    @CustomizeTypeSizeString(max=10, regexp="", message="E00001", params="{agentCode.label;agentCode.size;enter.event}")
    private String agentCode; 
    
    /**
     * 代理店コード(entry_no)の取得
     * @return agentCode
     */
    public String getAgentCode() {
        return agentCode;
    }
    /**
     * 代理店コード(entry_no)の設定
     * @param agentCode String
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

}

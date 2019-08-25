package jp.co.myapp.api.domain.repository.agentsearch;


import java.util.List;

public interface AgentSearchRepository {


    /**
     * 自代理店のグループコードを取得する
     * @param agentCode
     * @return
     */
	public List<String> getAgentCodeList(String agentCode);


}

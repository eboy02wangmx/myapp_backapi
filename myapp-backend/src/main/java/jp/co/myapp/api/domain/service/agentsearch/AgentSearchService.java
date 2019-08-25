package jp.co.myapp.api.domain.service.agentsearch;

import java.util.List;

public interface AgentSearchService {


	/**
	 * 自代理店のグループコードを取得する
	 * @param reqAgentCode
	 * @return
	 */
	public List<String> getAgentList(String reqAgentCode);

}

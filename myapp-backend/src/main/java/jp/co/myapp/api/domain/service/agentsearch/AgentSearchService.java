package jp.co.myapp.api.domain.service.agentsearch;

import java.util.List;

import jp.co.myapp.api.app.request.AgentSearchRequest;
import jp.co.myapp.api.domain.modelreplica.DairitenBean;

public interface AgentSearchService {

	/**
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List<DairitenBean> findAgentCode(AgentSearchRequest params) throws Exception;

	/**
	 * 自代理店のグループコードを取得する
	 * @param reqAgentCode
	 * @return
	 */
	public List<String> getAgentList(String reqAgentCode);

}

package jp.co.myapp.api.domain.repositoryreplica.agentsearch;


import java.util.List;
import java.util.Set;

import jp.co.myapp.api.app.request.AgentSearchRequest;
import jp.co.myapp.api.domain.modelreplica.DairitenBean;

public interface AgentSearchRepository {


    /**
     * @param params
     * @return
     * @throws Exception
     */
    public List<DairitenBean> findAgentCode(AgentSearchRequest params) throws Exception;

    /**
     * @param params
     * @return
     * @throws Exception
     */
    public List<DairitenBean> findAgentCode01(AgentSearchRequest params) throws Exception;

    /**
	 * 代理店名称取得
	 */
	public List<DairitenBean> findAgentsByAgentCds(Set<String> agentCds) throws Exception;

	 /**
     * @param params
     * @return
     * @throws Exception
     */
    public String findKiBoCd(AgentSearchRequest params) throws Exception;

    /**
     * 自代理店のグループコードを取得する
     * @param agentCode
     * @return
     */
	public List<String> getAgentCodeList(String agentCode);

    /**
     * 自代理店のグループコードを取得する
     * @param agentCode
     * @return
     */
	public List<String> getAgentCodeList2(String agentCode);

}

package jp.co.myapp.api.domain.service.agentsearch;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.domain.repository.agentsearch.AgentSearchRepository;


/**
 * ミニマスタ(DAIRITEN)を全件検索し、検索した代理店情報を返す.
 */
@Transactional
@Service
public class AgentSearchServiceImpl implements AgentSearchService {

	@Inject
	AgentSearchRepository agentSearchRepository;


	@Override
	public List<String> getAgentList(String reqAgentCode) {
		return agentSearchRepository.getAgentCodeList(reqAgentCode);
	}

}

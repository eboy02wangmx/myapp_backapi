package jp.co.myapp.api.domain.service.agentsearch;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.data.error.ErrorInfoData;
import jp.co.myapp.api.app.request.AgentSearchRequest;
import jp.co.myapp.api.domain.modelreplica.DairitenBean;
import jp.co.myapp.api.domain.repositoryreplica.agentsearch.AgentSearchRepository;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.exception.CustomizeBadRequestException;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;
import jp.co.myapp.common.util.MyUtils;

/**
 * ミニマスタ(DAIRITEN)を全件検索し、検索した代理店情報を返す.
 */
@Transactional
@Service
public class AgentSearchServiceImpl implements AgentSearchService {

	@Inject
	AgentSearchRepository agentSearchRepository;

	/**
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<DairitenBean> findAgentCode(AgentSearchRequest params) throws Exception {

		List<DairitenBean> lst = new ArrayList<DairitenBean>();
		try {
			// 代理店情報を取得する。
			if (MyUtils.isEmpty(params.getSelfAgentCode())) {
				lst = agentSearchRepository.findAgentCode01(params);
			} else {
				// 全国規模コードを取得する。
				String nationalCode = agentSearchRepository.findKiBoCd(params);

				if(null != nationalCode) {
					nationalCode = nationalCode.trim();
				}

				params.setNationalCode(nationalCode);
				// 代理店情報を取得する。
				lst = agentSearchRepository.findAgentCode(params);
			}

		} catch (Exception ex) {
			// SQLの実施がエラーが発生した場合は下記メッセージを返す。
			throw new CustomizeSystemErrorException(new ErrorInfoData("", Constants.ERROR_E00012));
		}
		// 検索件数は０件の場合は下記メッセージを設定する
		if (lst.size() == 0) {
			// 検索件数が0件の場合は下記メッセージを設定する。代理店データがありません
			throw new CustomizeBadRequestException(
					new ErrorInfoData(null, Constants.ERROR_I00003, new String[] { "代理店データ" }));
		}
		return lst;
	}

	@Override
	public List<String> getAgentList(String reqAgentCode) {
		return agentSearchRepository.getAgentCodeList2(reqAgentCode);
	}

}

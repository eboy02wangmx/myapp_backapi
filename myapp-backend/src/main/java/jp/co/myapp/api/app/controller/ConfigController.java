package jp.co.myapp.api.app.controller;

import java.io.IOException;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.data.AbstractResultData;
import jp.co.myapp.api.domain.model.ConfigBean;
import jp.co.myapp.api.domain.service.agentsearch.AgentSearchService;
import jp.co.myapp.common.Constants;
import jp.co.myapp.common.ConstantsEnum.API_ID;
import jp.co.myapp.common.exception.CustomizeBadRequestException;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;

/**
 * HAのConfig取得API
 */
@Controller
public class ConfigController extends AbstractApiController {

	private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);

	@Value("#{system.sig_key}")
	private String SIG_KEY;

	@Value("#{system.oshirase_file}")
	private String oshiraseFile;


	@Inject
	protected AgentSearchService agentSearchService;


	/**
	 * Config処理
	 *
	 * @param locale
	 *            Locale
	 * @param params
	 *            EntryRequestRequest
	 * @return ResponseJson
	 * @throws CustomizeSystemErrorException
	 * @throws CustomizeBadRequestException
	 */
	@RequestMapping(value = "/api/config", method = { RequestMethod.GET })
	@ResponseBody
	public AbstractResultData config(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENCY) String reqAgency,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_ENTRY_TYPE) String reqEntryType,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENT_CODE) String reqAgentCode)
			throws CustomizeSystemErrorException, CustomizeBadRequestException {
		logger.info(API_ID.NHA_O_0015 + " 処理開始");
		ConfigBean configBean = new ConfigBean();
		configBean.setAgentName("テスト用代理店名2");

		logger.info(API_ID.NHA_O_0015 + " 処理完了");
		return configBean;
	}

	/**
	 * 代理店情報取得
	 *
	 * @param configBean
	 * @param agentParameter
	 * @throws IOException
	 */
	private void getAgentInfo(ConfigBean configBean, String agencyCode) throws IOException {

		String agentCd = agencyCode;
		configBean.setAgentCode(agentCd);

		// 代理店名称取得
		//String agentNm = AgentSearchService.getAgentNm(agentCd);
		String agentNm = "";
		configBean.setAgentName(agentNm);
	}

}

package jp.co.myapp.api.app.controller;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * ログインチェックAPI
 */
@Controller
public class LoginController extends AbstractApiController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


//	@Inject
//	protected AgentSearchService agentSearchService;


	@Inject
	AgentSearchService agentSearchService;

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
	@RequestMapping(value = "/api/login", method = { RequestMethod.POST })
	@ResponseBody
	public AbstractResultData config(HttpServletRequest request, HttpServletResponse response, Locale locale,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENCY) String reqAgency,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_ENTRY_TYPE) String reqEntryType,
			@RequestParam(required = false, name = Constants.LOGIN_KEY_AGENT_CODE) String reqAgentCode)
			throws CustomizeSystemErrorException, CustomizeBadRequestException {
		logger.info(API_ID.NHA_O_0001 + " 処理開始");
		ConfigBean configBean = new ConfigBean();
		List<String> lst = agentSearchService.getAgentList("1");
		configBean.setAgentName("ログイン用アプリの代理店名:" + lst.get(0));

		logger.info(API_ID.NHA_O_0001 + " 処理完了");
		return configBean;
	}

	/**
     * ファイルアップロード処理
     *
     * @param request
     *            HttpServletRequest
     * @param response
     *            HttpServletResponse
     * @throws Exception
     */
    @RequestMapping(value = "/api/imageUpload", method = { RequestMethod.POST })
    @ResponseBody
    public void fileupload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("NHA_O_0011" + " 処理開始");

        Part part = request.getPart("file");
        String fileName = part.getSubmittedFileName();

        LoginController lc = new LoginController();
        String path = lc.getClass().getResource("/").getPath();
        path = path.substring(1, path.indexOf("classes")) + "uploads";

        Path outputDir = Paths.get(path);
        if (!Files.exists(outputDir)) {
            Files.createDirectory(outputDir);
        }

        // ファイルが重複している場合409を返す
        if (Files.exists(outputDir.resolve(fileName))) {
            response.sendError(HttpServletResponse.SC_CONFLICT, "ファイル名が重複しています");
            return;
        }

        try (InputStream is = part.getInputStream()) {
            Files.copy(is, outputDir.resolve(fileName));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        logger.info("NHA_O_0011" + " POST処理完了");
    }
}

package jp.co.myapp.api.app.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.app.data.AbstractResultData;
import jp.co.myapp.api.domain.model.UserBean;
import jp.co.myapp.api.domain.service.user.UserService;
import jp.co.myapp.common.exception.CustomizeBadRequestException;
import jp.co.myapp.common.exception.CustomizeSystemErrorException;
import jp.co.myapp.util.StringUtil;

@Controller
public class LoginController extends AbstractApiController {

	@Inject
	UserService userService;

	@RequestMapping(value = "/api/login", method = { RequestMethod.POST })
	@ResponseBody
	public AbstractResultData userLogin(@RequestBody Map<String, String> param)
			throws CustomizeSystemErrorException, CustomizeBadRequestException {
		UserBean result = new UserBean();
		String userName = param.get("userName");
		String password = param.get("password");
		if (StringUtil.isNull(userName) || StringUtil.isNull(password)) {
			result.setSuccess(false);
			result.setMsg("アカウントIDかパスワードが正しくありません。");
		} else {
			UserBean userBean = userService.userLogin(userName);
			if (userBean == null || !password.equals(userBean.getPassword())) {
				result.setSuccess(false);
				result.setMsg("アカウントIDかパスワードが正しくありません。");
			} else {
				if ("panolib_admin".equals(userName)) {
					result.setUserName(userBean.getUserName());
					result.setCustomId(userBean.getCustomId());
					result.setKengen(userBean.getKengen());
					result.setYukokbn(userBean.getYukokbn());
				} else {
					if ("0".equals(userBean.getYukokbn())) {
						result.setSuccess(false);
						result.setMsg("無効のアカウントIDです。管理ユーザーまたは取扱代理店と問い合わせください。");
					} else {
						Boolean isValidContract = userService.isValidContract(userName);
						if (isValidContract == null || !userService.isValidContract(userName)) {
							result.setSuccess(false);
							result.setMsg("該当アカウントIDは契約期間外です。取扱代理店と問い合わせください。");
						} else {
							result.setUserName(userBean.getUserName());
							result.setCustomId(userBean.getCustomId());
							result.setKengen(userBean.getKengen());
							result.setYukokbn(userBean.getYukokbn());
						}
					}
				}
			}
		}

		return result;
	}

}

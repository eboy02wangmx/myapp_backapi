package jp.co.myapp.api.domain.service.userkanri;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.model.UserInfoBean;
import jp.co.myapp.api.domain.repository.userinfo.UserInfoRepository;
import jp.co.myapp.api.domain.repository.userkanri.UserKanriRepository;
import jp.co.myapp.util.StringUtil;

@Transactional
@Service
public class UserCreateServiceImpl implements UserCreateService {

	@Inject
	private UserKanriRepository userKanriRepository;

	@Inject
	private UserInfoRepository userInfoRepository;

	@Override
	public void userCreate(UserCreateRequest param) {
		String password = param.getPassword();
		if (StringUtil.isNull(password)) {
			userKanriRepository.update(param);
		} else {
			userKanriRepository.updateAll(param);
		}
	}

	@Override
	public UserInfoBean getUserInfo(String userId) {
		return userInfoRepository.getUserInfo(userId);
	}

	@Override
	public List<String> getUserPlan() {
		return userInfoRepository.getUserPlan();
	}

}

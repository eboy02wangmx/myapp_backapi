package jp.co.myapp.api.domain.service.userkanri;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.model.UserInfoBean;
import jp.co.myapp.api.domain.repository.userinfo.UserInfoRepository;
import jp.co.myapp.api.domain.repository.userkanri.UserKanriRepository;

@Transactional
@Service
public class UserCreateServiceImpl implements UserCreateService {
	@Inject
	private UserKanriRepository userKanriRepository;

	@Inject
	private UserInfoRepository userInfoRepository;

	@Override
	public void userCreate(UserCreateRequest param) {

		userKanriRepository.createUser(param);
	}
	@Override
	public UserInfoBean getUserInfo(String userId) {

		return userInfoRepository.getUserInfo(userId);
	}
}

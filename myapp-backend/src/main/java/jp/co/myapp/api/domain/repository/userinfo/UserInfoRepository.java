package jp.co.myapp.api.domain.repository.userinfo;

import jp.co.myapp.api.domain.model.UserInfoBean;

public interface UserInfoRepository {

	public UserInfoBean getUserInfo(String userId);
}

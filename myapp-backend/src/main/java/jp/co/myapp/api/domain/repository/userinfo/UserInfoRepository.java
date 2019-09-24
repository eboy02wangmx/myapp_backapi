package jp.co.myapp.api.domain.repository.userinfo;

import java.util.List;

import jp.co.myapp.api.domain.model.UserInfoBean;

public interface UserInfoRepository {

	public UserInfoBean getUserInfo(String userId);

	public List<String> getUserPlan();
}

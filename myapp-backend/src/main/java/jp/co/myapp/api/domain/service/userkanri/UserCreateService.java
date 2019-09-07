package jp.co.myapp.api.domain.service.userkanri;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.model.UserInfoBean;

public interface  UserCreateService {
	public void userCreate(UserCreateRequest param);
	public UserInfoBean getUserInfo(String UserId);
}

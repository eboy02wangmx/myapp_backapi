package jp.co.myapp.api.domain.service.user;

import jp.co.myapp.api.domain.model.UserBean;

public interface UserService {

	public UserBean userLogin(String userId);

	public Boolean isValidContract(String userId);

}

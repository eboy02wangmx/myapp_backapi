package jp.co.myapp.api.domain.repository.user;

import java.util.Date;
import java.util.Map;

import jp.co.myapp.api.domain.model.UserBean;

public interface UserRepository {

	public UserBean findOne(String userId);

	public Map<String, Date> selectContractDate(String userId);

}

package jp.co.myapp.api.domain.service.user;

import java.util.List;

public interface UserService {
	public List<String> userLogin(String user,String password);
}

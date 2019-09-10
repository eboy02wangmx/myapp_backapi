package jp.co.myapp.api.domain.service.userkanri;

import jp.co.myapp.api.app.request.UserCreateRequest;

public interface UserInsertService {
	public void insert(UserCreateRequest param);

	public void insertAdmin(UserCreateRequest param);
}

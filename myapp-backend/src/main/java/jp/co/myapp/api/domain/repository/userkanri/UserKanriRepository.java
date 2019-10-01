package jp.co.myapp.api.domain.repository.userkanri;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.app.request.UserKanriRequest;
import jp.co.myapp.api.domain.model.UserInfoBean;
import jp.co.myapp.api.domain.model.UserKanriBean;

public interface UserKanriRepository {

	public Integer count(String userId);

	public List<UserKanriBean> getUserkanriInfo(@Param("userId") String userId, @Param("orderName") String orderName,
			@Param("orderDirect") String orderDirect);

	public void updateAll(UserCreateRequest param);

	public void update(UserCreateRequest param);

	public void insertUser(UserCreateRequest param);

	public void insertAdminUser(UserCreateRequest param);

	public void deleteUser(String user);

	public UserInfoBean getUserInfo(String userId);

	public List<UserKanriBean> getAdminInfo(@Param("userId") String userId, @Param("orderName") String orderName,
			@Param("orderDirect") String orderDirect);

	public void updateyukokbn(UserKanriRequest param);

}

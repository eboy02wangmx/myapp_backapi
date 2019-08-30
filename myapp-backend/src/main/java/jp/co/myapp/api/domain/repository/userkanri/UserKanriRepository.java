package jp.co.myapp.api.domain.repository.userkanri;

import java.util.List;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.model.UserKanriBean;

public interface UserKanriRepository {
   public List<UserKanriBean> getUserkanriInfo(String userId);

   public void createUser(UserCreateRequest param);

   public void editUser(UserKanriBean user);

   public void removeUser(String user);
}

package jp.co.myapp.api.domain.repository.userkanri;

import java.util.List;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.model.UserKanriBean;

public interface UserKanriRepository {
   public List<UserKanriBean> getUserkanriInfo(String userId);

   // ユーザーの編集
   public void createUser(UserCreateRequest param);

   // ユーザーの作成
   public void insertUser(UserCreateRequest param);

   public void deleteUser(String user);

   public List<UserKanriBean> getAdminInfo(String userId);
}

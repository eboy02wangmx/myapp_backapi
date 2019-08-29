package jp.co.myapp.api.domain.repository.userkanri;

import java.util.List;

import jp.co.myapp.api.domain.model.UserKanriBean;

public interface UserKanriRepository {
   public List<UserKanriBean> getUserkanriInfo(String userId);
}

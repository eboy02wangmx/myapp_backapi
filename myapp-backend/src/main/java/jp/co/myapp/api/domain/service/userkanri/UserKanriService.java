package jp.co.myapp.api.domain.service.userkanri;

import java.util.List;

import jp.co.myapp.api.domain.model.UserKanriBean;

public interface UserKanriService {

		public List<UserKanriBean> getUserkanriInfo(String userId);

		public List<UserKanriBean> getAdminInfo(String userId);

}

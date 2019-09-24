package jp.co.myapp.api.domain.repository;

import java.util.List;

import jp.co.myapp.api.domain.model.RiyoBody;
import jp.co.myapp.api.domain.model.RiyoHead;
import jp.co.myapp.api.domain.model.User;

public interface RiyoRepository {

	public User selectUser(String userId);

	public List<RiyoHead> selectRiyoHeadListByAdmin();

	public List<RiyoHead> selectRiyoHeadListByCustom(String customId);

	public List<RiyoBody> selectRiyoBodyList(String customId);

}

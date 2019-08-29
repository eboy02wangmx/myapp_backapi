package jp.co.myapp.api.domain.repository.user;


import jp.co.myapp.api.domain.model.UserBean;

public interface UserRepository {


    /**
     * ユーザー情報検索
     * @param agentCode
     * @return
     */
	public UserBean findOne(String userId);


}

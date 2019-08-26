package jp.co.myapp.api.domain.service.user;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.domain.model.UserBean;
import jp.co.myapp.api.domain.repository.user.UserRepository;

@Transactional
@Service
public class UserServiceImpl implements  UserService {

	@Inject
	UserRepository userRepository;


	@Override
	public UserBean userLogin(String userName) {
		return userRepository.findOne(userName);
	}

}

package jp.co.myapp.api.domain.service.userkanri;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.repository.userkanri.UserKanriRepository;

@Transactional
@Service
public class UserInsertServiceImpl implements UserInsertService {
	@Inject
	private UserKanriRepository userKanriRepository;

	@Override
	public void insert(UserCreateRequest param) {

		userKanriRepository.insertUser(param);

	}

	@Override
	public void insertAdmin(UserCreateRequest param) {
		userKanriRepository.insertAdminUser(param);

	}


}

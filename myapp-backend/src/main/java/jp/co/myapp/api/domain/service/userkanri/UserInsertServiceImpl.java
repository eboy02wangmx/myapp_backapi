package jp.co.myapp.api.domain.service.userkanri;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.UserCreateRequest;
import jp.co.myapp.api.domain.repository.userkanri.UserKanriRepository;
import jp.co.myapp.util.UuidUtil;

@Transactional
@Service
public class UserInsertServiceImpl implements UserInsertService {

	@Inject
	private UserKanriRepository userKanriRepository;

	public Boolean exists(String userId) {
		Boolean result = false;
		Integer count = userKanriRepository.count(userId);
		if (count > 0) {
			result = true;
		}

		return result;
	}

	@Override
	public void insert(UserCreateRequest param) {
		userKanriRepository.insertUser(param);
	}

	@Override
	public void insertAdmin(UserCreateRequest param) {
		param.setCustomid(UuidUtil.get().substring(0, 20));
		userKanriRepository.insertAdminUser(param);
	}

}

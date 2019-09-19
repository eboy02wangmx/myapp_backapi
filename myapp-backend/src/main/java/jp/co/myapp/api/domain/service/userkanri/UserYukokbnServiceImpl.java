package jp.co.myapp.api.domain.service.userkanri;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.UserKanriRequest;
import jp.co.myapp.api.domain.repository.userkanri.UserKanriRepository;

@Transactional
@Service
public class UserYukokbnServiceImpl implements UserYukokbnService {
	@Inject
	private UserKanriRepository userKanriRepository;

	@Override
	public void updateyukokbn(UserKanriRequest param) {

		userKanriRepository.updateyukokbn(param);

	}
}

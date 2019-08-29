package jp.co.myapp.api.domain.service.userkanri;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.UserKanriBean;
import jp.co.myapp.api.domain.repository.userkanri.UserKanriRepository;

@Service
public class UserKanriServiceImpl implements UserKanriService{
	@Inject
	UserKanriRepository userKanriRepository;


	public List<UserKanriBean> getUserkanriInfo(String userId) {
		return userKanriRepository.getUserkanriInfo(userId);
	}

}

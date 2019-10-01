package jp.co.myapp.api.domain.service.user;

import java.util.Date;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.domain.model.UserBean;
import jp.co.myapp.api.domain.repository.user.UserRepository;
import jp.co.myapp.util.StringUtil;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Inject
	UserRepository repository;

	@Override
	public UserBean userLogin(String userId) {
		return repository.findOne(userId);
	}

	@Override
	public Boolean isValidContract(String userId) {
		Boolean result = null;
		if (!StringUtil.isNull(userId)) {
			Map<String, Date> contractDate = repository.selectContractDate(userId);
			if (contractDate != null && contractDate.containsKey("keiyakushiki")
					&& contractDate.containsKey("keiyakushuki")) {
				Date keiyakushiki = contractDate.get("keiyakushiki");
				Date keiyakushuki = contractDate.get("keiyakushuki");
				if (keiyakushiki != null && keiyakushuki != null) {
					Date now = new Date();
					if (now.getTime() >= keiyakushiki.getTime() && now.getTime() <= keiyakushuki.getTime()) {
						result = true;
					}
				}
			}
		}

		return result;
	}

}

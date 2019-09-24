package jp.co.myapp.api.domain.service.album;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.Riyo;
import jp.co.myapp.api.domain.model.RiyoBody;
import jp.co.myapp.api.domain.model.RiyoHead;
import jp.co.myapp.api.domain.model.User;
import jp.co.myapp.api.domain.repository.RiyoRepository;
import jp.co.myapp.util.StringUtil;

@Service
public class RiyoServiceImpl implements RiyoService {

	@Inject
	private RiyoRepository riyoRepository;

	@Override
	public List<Riyo> search(String userId) {
		List<Riyo> result = null;
		if (!StringUtil.isNull(userId)) {
			User user = riyoRepository.selectUser(userId);
			if ("1".equals(user.getKengen())) {
				List<RiyoHead> headList = riyoRepository.selectRiyoHeadListByAdmin();
				if (headList != null && headList.size() > 0) {
					result = new ArrayList<Riyo>();
					for (int i = 0; i < headList.size(); i++) {
						RiyoHead head = headList.get(i);
						Riyo riyo = new Riyo();
						riyo.setHead(head);
						result.add(riyo);
					}
				}
			} else if ("2".equals(user.getKengen())) {
				List<RiyoHead> headList = riyoRepository.selectRiyoHeadListByCustom(user.getCustomid());
				if (headList != null && headList.size() > 0) {
					result = new ArrayList<Riyo>();
					RiyoHead head = headList.get(0);
					Riyo riyo = new Riyo();
					riyo.setHead(head);
					result.add(riyo);
				}
			}
			if (result != null && result.size() > 0) {
				for (int i = 0; i < result.size(); i++) {
					Riyo riyo = result.get(i);
					RiyoHead head = riyo.getHead();
					List<RiyoBody> bodyList = riyoRepository.selectRiyoBodyList(head.getCustomid());
					riyo.setBodyList(bodyList);
				}
			}
		}

		return result;
	}

}

package jp.co.myapp.api.domain.service.album;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.repository.album.AlbumRepository;


@Service
public class RiyoServiceImpl implements RiyoService {

	@Inject
	private AlbumRepository albumDao;

	@Override
	public List<AlbumBean> getRiyo() {
		return albumDao.getRiyo();
	}

	@Override
	public void riyoEff(String riyoEff) {

		albumDao.riyoEff(riyoEff);
	}


}

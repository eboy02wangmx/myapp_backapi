package jp.co.myapp.api.domain.service.album;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.AlbumCreateRequest;
import jp.co.myapp.api.domain.repository.album.AlbumRepository;

@Transactional
@Service
public class AlbumCreateServiceImpl implements AlbumCreateService {

	@Inject
	private AlbumRepository albumDao;

	@Override
	public void albumCreate(AlbumCreateRequest param) {

		Date dd=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyyMMdd");
		String time=sim.format(dd);
		param.setKoushinhi(time);
		param.setSakusehi(time);
		albumDao.createAlbum(param);
	}

}

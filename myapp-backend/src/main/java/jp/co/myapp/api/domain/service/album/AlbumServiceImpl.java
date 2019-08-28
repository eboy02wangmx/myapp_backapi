package jp.co.myapp.api.domain.service.album;

import java.util.List;

import javax.inject.Inject;

import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.repository.album.AlbumRepository;

public class AlbumServiceImpl implements AlbumService {

	@Inject
	private AlbumRepository albumDao;

	@Override
	public List<AlbumBean> getAlbum(String user) {
		return albumDao.getAlbum(user);
	}

	@Override
	public void editAlbum(AlbumBean album) {
		
		albumDao.editAlbum(album);
	}

	@Override
	public void deleteAlbum(String userid) {
		albumDao.deleteAlbum(userid);

	}

}

<<<<<<< HEAD
package jp.co.myapp.api.domain.service.album;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.repository.album.AlbumRepository;


@Service
public class AlbumServiceImpl implements AlbumService {

	@Inject
	private AlbumRepository albumDao;

	@Override
	public List<AlbumBean> getAlbum(String user) {

		List<AlbumBean> albumList = albumDao.getAlbum(user);
		List<AlbumBean> albums = new ArrayList<AlbumBean>();
		for(AlbumBean album : albumList) {
			if(StringUtils.isNotEmpty(album.getCustomid())) {
				album.setUserid("管理者");
			}
			albums.add(album);
		}
		return albums;
	}

	@Override
	public void editAlbum(AlbumBean album) {

		albumDao.editAlbum(album);
	}

	@Override
	public void removeAlbum(String filename) {
		albumDao.removeAlbum(filename);

	}

}
=======
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
>>>>>>> f5ffe491744f4f02ad7268bdbf54dc72a406954c

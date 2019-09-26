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
		for (AlbumBean album : albumList) {
			if (StringUtils.isNotEmpty(album.getCustomid())) {
				// album.setUserid("管理者");
			}
			albums.add(album);
		}
		return albums;
	}

	@Override
	public void editDomain(Integer id, String domain) {
		albumDao.updateDomain(id, domain);
	}

	@Override
	public void removeAlbum(String filename) {
		albumDao.removeAlbum(filename);
	}

}

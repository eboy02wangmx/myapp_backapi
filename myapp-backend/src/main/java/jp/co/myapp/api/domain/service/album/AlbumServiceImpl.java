package jp.co.myapp.api.domain.service.album;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.AlbumBean;
import jp.co.myapp.api.domain.repository.album.AlbumRepository;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Inject
	private AlbumRepository albumDao;

	@Override
	public AlbumBean get(Integer id) {
		return albumDao.selectById(id);
	}

	@Override
	public List<AlbumBean> search(String userId, String orderName, String orderDirect) {
		List<AlbumBean> albums = null;
		if ("panolib_admin".equals(userId)) {
			albums = albumDao.selectAll(userId, orderName, orderDirect);
		} else {
			albums = albumDao.selectByUserId(userId, orderName, orderDirect);
		}

		return albums;
	}

	@Override
	public Integer getPicNum(Integer id) {
		return albumDao.selectPicNum(id);
	}

	@Override
	public void editDomain(Integer id, String domain) {
		albumDao.updateDomain(id, domain);
	}

	@Override
	public void removeAlbum(Integer id) {
		albumDao.delete(id);
		albumDao.deleteImgsWorks(id);
		albumDao.deletePanoConfig(id);
	}

}

package jp.co.myapp.api.domain.service.album;

import java.util.List;

import javax.inject.Inject;

import jp.co.myapp.api.domain.model.AlbumInfoBean;
import jp.co.myapp.api.domain.repository.albuminfo.AlbumInfoRepository;

public class AlbumInfoServiceImpl implements AlbumInfoService {

	@Inject
	private AlbumInfoRepository album;

	@Override
	public List<AlbumInfoBean> getAlbumInfo(String user) {
		// TODO 自動生成されたメソッド・スタブ
		return album.getAlbumInfo(user);
	}

}

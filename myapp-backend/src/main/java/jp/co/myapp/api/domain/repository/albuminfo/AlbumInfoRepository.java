package jp.co.myapp.api.domain.repository.albuminfo;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumInfoBean;

public interface AlbumInfoRepository {
	public List<AlbumInfoBean> getAlbumInfo(String user);
}

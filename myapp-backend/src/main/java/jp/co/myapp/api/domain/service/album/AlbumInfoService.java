package jp.co.myapp.api.domain.service.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumInfoBean;

public interface AlbumInfoService {
	public List<AlbumInfoBean> getAlbumInfo(String user);
}

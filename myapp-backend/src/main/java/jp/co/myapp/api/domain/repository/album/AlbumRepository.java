package jp.co.myapp.api.domain.repository.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumRepository {
	public List<AlbumBean> getAlbum(String user);

	public List<AlbumBean> getRiyo();

	public void editAlbum(AlbumBean album);

	public void deleteAlbum(String userid);
}

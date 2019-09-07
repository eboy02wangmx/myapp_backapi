<<<<<<< HEAD
package jp.co.myapp.api.domain.repository.album;

import java.util.List;

import jp.co.myapp.api.app.request.AlbumCreateRequest;
import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumRepository {
	public List<AlbumBean> getAlbum(String user);

	public List<AlbumBean> getRiyo();

	public void editAlbum(AlbumBean album);

	public void removeAlbum(String filename);

	public void createAlbum(AlbumCreateRequest param);

	public void riyoEff(String riyoEff);
}
=======
package jp.co.myapp.api.domain.repository.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumRepository {
	public List<AlbumBean> getAlbum(String user);

	public List<AlbumBean> getRiyo();

	public void editAlbum(AlbumBean album);

	public void deleteAlbum(String userid);
}
>>>>>>> f5ffe491744f4f02ad7268bdbf54dc72a406954c

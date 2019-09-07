<<<<<<< HEAD
package jp.co.myapp.api.domain.service.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumService {

	public List<AlbumBean> getAlbum(String user);

	public void editAlbum(AlbumBean album);

	public void removeAlbum(String filename);
}
=======
package jp.co.myapp.api.domain.service.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumService {

	public List<AlbumBean> getAlbum(String user);

	public void editAlbum(AlbumBean album);

	public void deleteAlbum(String user);
}
>>>>>>> f5ffe491744f4f02ad7268bdbf54dc72a406954c

package jp.co.myapp.api.domain.service.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumService {

	public List<AlbumBean> getAlbum(String user);

	public void editDomain(Integer id, String domain);

	public void removeAlbum(String filename);

}

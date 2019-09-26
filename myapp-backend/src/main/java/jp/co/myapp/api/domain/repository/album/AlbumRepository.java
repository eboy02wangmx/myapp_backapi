package jp.co.myapp.api.domain.repository.album;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.myapp.api.app.request.AlbumCreateRequest;
import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumRepository {

	public List<AlbumBean> getAlbum(String user);

	public void updateDomain(@Param("id") Integer id, @Param("domain") String domain);

	public void removeAlbum(String filename);

	public void createAlbum(AlbumCreateRequest param);

}

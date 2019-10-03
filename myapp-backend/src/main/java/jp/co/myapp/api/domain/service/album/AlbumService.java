package jp.co.myapp.api.domain.service.album;

import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumService {

	public AlbumBean get(Integer id);

	public List<AlbumBean> search(String userId, String orderName, String orderDirect);

	public Integer getPicNum(Integer id);

	public void editDomain(Integer id, String domain);

	public void removeAlbum(Integer id);

}

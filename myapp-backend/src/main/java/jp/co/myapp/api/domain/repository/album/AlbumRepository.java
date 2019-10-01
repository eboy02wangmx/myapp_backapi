package jp.co.myapp.api.domain.repository.album;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.myapp.api.app.request.AlbumCreateRequest;
import jp.co.myapp.api.domain.model.AlbumBean;

public interface AlbumRepository {

	public AlbumBean selectById(@Param("id") Integer id);

	public List<AlbumBean> selectByUserId(@Param("userId") String userId, @Param("orderName") String orderName,
			@Param("orderDirect") String orderDirect);

	public List<AlbumBean> selectAll(@Param("userId") String userId, @Param("orderName") String orderName,
			@Param("orderDirect") String orderDirect);

	public Integer selectPicNum(@Param("id") Integer id);

	public void updateDomain(@Param("id") Integer id, @Param("domain") String domain);

	public void delete(@Param("id") Integer id);

	public void deleteImgsWorks(@Param("id") Integer id);

	public void deletePanoConfig(@Param("id") Integer id);

	public void createAlbum(AlbumCreateRequest param);

}

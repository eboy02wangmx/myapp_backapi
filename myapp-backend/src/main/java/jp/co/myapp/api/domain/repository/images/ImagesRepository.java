package jp.co.myapp.api.domain.repository.images;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.model.ImagesBean;

public interface ImagesRepository {

	public ImagesBean selectById(@Param("id") Integer id);

	public List<ImagesBean> select(@Param("vrInfoId") Integer vrInfoId);

	public void insertSetsumei(AlbumRequest params);

	public void delete(@Param("id") Integer id);

	public void deleteImgsWorks(@Param("id") Integer id);

	public void deletePanoConfig(@Param("vrInfoId") Integer vrInfoId);

	public Integer selectVrInfoPicNum(@Param("vrInfoId") Integer vrInfoId);

	public void updateVrInfoPicNum(@Param("vrInfoId") Integer vrInfoId, @Param("picNum") String picNum);

}

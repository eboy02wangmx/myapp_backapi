package jp.co.myapp.api.domain.repository.images;

import java.util.List;

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.model.ImagesBean;

public interface ImagesRepository {

	public List<ImagesBean> getImagesInfo(String vrInfoId);

	public void insertSetsumei(AlbumRequest params);

}

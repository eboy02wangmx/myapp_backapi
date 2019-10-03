package jp.co.myapp.api.domain.service.images;

import java.util.List;

import jp.co.myapp.api.domain.model.ImagesBean;

public interface ImagesService {

	public ImagesBean get(Integer id);

	public List<ImagesBean> search(Integer vrInfoId);

}

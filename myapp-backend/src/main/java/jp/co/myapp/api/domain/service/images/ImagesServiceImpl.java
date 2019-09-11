package jp.co.myapp.api.domain.service.images;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.ImagesBean;
import jp.co.myapp.api.domain.repository.images.ImagesRepository;

@Service
public class ImagesServiceImpl implements ImagesService{
	@Inject
	ImagesRepository imagesRepository;


	public List<ImagesBean> getImagesInfo(String userid) {
		return imagesRepository.getImagesInfo(userid);
	}


	@Override
	public List<ImagesBean> getAdminInfo(String userid) {

		return imagesRepository.getAdminInfo(userid);
	}

}

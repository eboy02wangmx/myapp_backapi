package jp.co.myapp.api.domain.service.images;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jp.co.myapp.api.domain.model.ImagesBean;
import jp.co.myapp.api.domain.repository.images.ImagesRepository;

@Service
public class ImagesServiceImpl implements ImagesService {

	@Inject
	ImagesRepository repository;

	@Override
	public ImagesBean get(Integer id) {
		return repository.selectById(id);
	}

	@Override
	public List<ImagesBean> search(Integer vrInfoId) {
		return repository.select(vrInfoId);
	}

}

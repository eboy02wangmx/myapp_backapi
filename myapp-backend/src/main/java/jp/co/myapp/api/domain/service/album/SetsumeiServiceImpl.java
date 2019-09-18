package jp.co.myapp.api.domain.service.album;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.app.request.AlbumRequest;
import jp.co.myapp.api.domain.repository.images.ImagesRepository;

@Transactional
@Service
public class SetsumeiServiceImpl implements SetsumeiService {

	@Inject
	private ImagesRepository imagesRepository;

	@Override
	public void insertSetsumei(AlbumRequest params) {
		imagesRepository.insertSetsumei(params);

	}


}

package jp.co.myapp.api.domain.service.file;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.domain.model.ImgsmainBean;
import jp.co.myapp.api.domain.repository.file.FileRepository;

@Transactional
@Service
public class FileServiceImpl implements FileService {

	@Inject
	private FileRepository fileRepositpry;

	@Override
	public void insertImgsmain(ImgsmainBean imgsmainBean) {
		fileRepositpry.insertImgsmain(imgsmainBean);
	}

	@Override
	public void deleteImgsWorks(String fileName) {
		fileRepositpry.deleteImgsWorks(fileName);
	}

	@Override
	public void insertImgsWorks(String pkImgMain, String fileName) {
		fileRepositpry.insertImgsWorks(pkImgMain, fileName);
	}

}

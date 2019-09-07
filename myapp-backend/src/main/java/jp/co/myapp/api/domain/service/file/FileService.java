package jp.co.myapp.api.domain.service.file;

import jp.co.myapp.api.domain.model.ImgsmainBean;

public interface FileService {

	public void insertImgsmain(ImgsmainBean imgsmainBean);

	public void deleteImgsWorks(String fileName);

	public void insertImgsWorks(String pkImgMain, String fileName);
}

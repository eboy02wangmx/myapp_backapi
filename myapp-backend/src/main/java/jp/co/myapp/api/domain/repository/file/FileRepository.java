package jp.co.myapp.api.domain.repository.file;

import jp.co.myapp.api.domain.model.ImgsmainBean;

public interface FileRepository {

	public void insertImgsmain(ImgsmainBean imgsmainBean);

	public void deleteImgsWorks(String fileName);

	public void insertImgsWorks(String pkImgMain, String fileName);

}

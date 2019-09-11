package jp.co.myapp.api.domain.repository.images;

import java.util.List;

import jp.co.myapp.api.domain.model.ImagesBean;

public interface ImagesRepository {
   public List<ImagesBean> getImagesInfo(String userId);

   public void deleteImages(String user);

   public List<ImagesBean> getAdminInfo(String userId);
}

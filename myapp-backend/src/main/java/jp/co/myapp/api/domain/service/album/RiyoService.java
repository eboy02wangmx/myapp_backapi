package jp.co.myapp.api.domain.service.album;


import java.util.List;

import jp.co.myapp.api.domain.model.AlbumBean;

public interface RiyoService {

	public List<AlbumBean> getRiyo();

	public void riyoEff(String riyoEff);
}

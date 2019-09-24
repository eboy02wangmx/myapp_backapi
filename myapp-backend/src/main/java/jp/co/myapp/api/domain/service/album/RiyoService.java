package jp.co.myapp.api.domain.service.album;

import java.util.List;

import jp.co.myapp.api.domain.model.Riyo;

public interface RiyoService {

	public List<Riyo> search(String userId);

}

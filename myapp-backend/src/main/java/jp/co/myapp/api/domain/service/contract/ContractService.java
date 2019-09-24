package jp.co.myapp.api.domain.service.contract;

import java.util.List;

import jp.co.myapp.api.domain.model.Contract;

public interface ContractService {

	public List<Contract> search();

	public Contract get(Integer id);

	public void add(Contract contract);

	public void edit(Contract contract);

	public void remove(Integer id);

	public void disabled(Integer id);

	public void enabled(Integer id);

}

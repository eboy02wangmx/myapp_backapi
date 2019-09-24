package jp.co.myapp.api.domain.repository;

import java.util.List;

import jp.co.myapp.api.domain.model.Contract;

public interface ContractRepository {

	public List<Contract> selectAll();

	public Contract selectById(Integer id);

	public void insert(Contract contract);

	public void update(Contract contract);

	public void delete(Integer id);

	public void disabled(Integer id);

	public void enabled(Integer id);

}

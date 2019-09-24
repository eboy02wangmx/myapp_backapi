package jp.co.myapp.api.domain.service.contract;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.myapp.api.domain.model.Contract;
import jp.co.myapp.api.domain.repository.ContractRepository;

@Transactional
@Service
public class ContractServiceImpl implements ContractService {

	@Inject
	private ContractRepository contractRepository;

	@Override
	public List<Contract> search() {
		return contractRepository.selectAll();
	}

	@Override
	public Contract get(Integer id) {
		return contractRepository.selectById(id);
	}

	@Override
	public void add(Contract contract) {
		contractRepository.insert(contract);
	}

	@Override
	public void edit(Contract contract) {
		contractRepository.update(contract);
	}

	@Override
	public void remove(Integer id) {
		contractRepository.delete(id);
	}

	@Override
	public void disabled(Integer id) {
		contractRepository.disabled(id);
	}

	@Override
	public void enabled(Integer id) {
		contractRepository.enabled(id);
	}

}

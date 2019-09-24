package jp.co.myapp.api.app.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.myapp.api.domain.model.Contract;
import jp.co.myapp.api.domain.service.contract.ContractService;
import jp.co.myapp.util.StringUtil;

@Controller
@RequestMapping(value = "/api/contract")
public class ContractController {

	@Inject
	ContractService contractService;

	@RequestMapping(method = { RequestMethod.POST })
	@ResponseBody
	public List<Contract> getContracts() {
		return contractService.search();
	}

	@RequestMapping(value = "/get", method = { RequestMethod.POST })
	@ResponseBody
	public Contract get(@RequestBody Map<String, String> param) {
		Contract contract = null;
		String id = param.get("id");
		if (!StringUtil.isNull(id)) {
			contract = contractService.get(Integer.valueOf(id));
		}

		return contract;
	}

	@RequestMapping(value = "/add", method = { RequestMethod.POST })
	@ResponseBody
	public void add(@RequestBody Contract contract) {
		contractService.add(contract);
	}

	@RequestMapping(value = "/edit", method = { RequestMethod.POST })
	@ResponseBody
	public void edit(@RequestBody Contract contract) {
		contractService.edit(contract);
	}

	@RequestMapping(value = "/remove", method = { RequestMethod.POST })
	@ResponseBody
	public void remove(@RequestBody Map<String, String> param) {
		String id = param.get("id");
		if (!StringUtil.isNull(id)) {
			contractService.remove(Integer.valueOf(id));
		}
	}

	@RequestMapping(value = "/disabled", method = { RequestMethod.POST })
	@ResponseBody
	public void disabled(@RequestBody Map<String, String> param) {
		String id = param.get("id");
		if (!StringUtil.isNull(id)) {
			contractService.disabled(Integer.valueOf(id));
		}
	}

	@RequestMapping(value = "/enabled", method = { RequestMethod.POST })
	@ResponseBody
	public void enabled(@RequestBody Map<String, String> param) {
		String id = param.get("id");
		if (!StringUtil.isNull(id)) {
			contractService.enabled(Integer.valueOf(id));
		}
	}

}

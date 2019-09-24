package jp.co.myapp.api.domain.model;

public class RiyoHead {

	private String customid;

	private String soshikime;

	private String contractName;

	private Integer contractUploadNum;

	private Integer contractUploadedNum;

	public String getCustomid() {
		return customid;
	}

	public void setCustomid(String customid) {
		this.customid = customid;
	}

	public String getSoshikime() {
		return soshikime;
	}

	public void setSoshikime(String soshikime) {
		this.soshikime = soshikime;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Integer getContractUploadNum() {
		return contractUploadNum;
	}

	public void setContractUploadNum(Integer contractUploadNum) {
		this.contractUploadNum = contractUploadNum;
	}

	public Integer getContractUploadedNum() {
		return contractUploadedNum;
	}

	public void setContractUploadedNum(Integer contractUploadedNum) {
		this.contractUploadedNum = contractUploadedNum;
	}

}

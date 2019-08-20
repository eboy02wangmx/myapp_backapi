package jp.co.myapp.api.app.request;

public class FileUploadRequest {

	/**
	 * ファイル種類
	 */
	private String fileType;

	/**
	 * 文書種類
	 */
	private String docType;

	/**
	 * 保険証券割引記載有無
	 */
	private String withInsurancePolicyDiscountDescription;

	/**
	 * ファイルNo
	 */
	private String fileNo;

	/**
	 * ファイルNo配列
	 */
	private String[] fileNoArray;

	/**
	 * ファイルステータス
	 */
	private String fileStatus;

	/**
	 * ファイルアップロードフラグ
	 */
	private String fileUploadFlag;

	/**
	 * 回答期限日
	 */
	private String responseDueDate;

	/**
	 * 訂正回答日
	 */
	private String responseDate;

	/**
	 * 点検完了日
	 */
	private String inspectionFinishedDate;

	/**
	 * 点検者担当id
	 */
	private String inspectionManagerID;

	/**
	 * 点検担当者名
	 */
	private String inspectionName;

	/**
	 * 申込依頼No
	 */
	private String entryNo;
	
	/**
	 * CSRF Token
	 */
	private String csrfToken;

	public String getFileNo() {
		return fileNo;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getWithInsurancePolicyDiscountDescription() {
		return withInsurancePolicyDiscountDescription;
	}

	public void setWithInsurancePolicyDiscountDescription(String withInsurancePolicyDiscountDescription) {
		this.withInsurancePolicyDiscountDescription = withInsurancePolicyDiscountDescription;
	}

	/**
	 * ファイルステータスの取得
	 *
	 * @return fileStatus
	 */
	public String getFileStatus() {
		return fileStatus;
	}

	/**
	 * ファイルステータスの設定
	 *
	 * @param fileStatus
	 */
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	/**
	 * ファイルアップロードフラグの取得
	 *
	 * @return fileUploadFlag
	 */
	public String getFileUploadFlag() {
		return fileUploadFlag;
	}

	/**
	 * ファイルアップロードフラグの設定
	 *
	 * @param fileUploadFlag
	 */
	public void setFileUploadFlag(String fileUploadFlag) {
		this.fileUploadFlag = fileUploadFlag;
	}

	/**
	 * 回答期限日の取得
	 *
	 * @return responseDueDate
	 */
	public String getResponseDueDate() {
		return responseDueDate;
	}

	/**
	 * 回答期限日の設定
	 *
	 * @param responseDueDate
	 */
	public void setResponseDueDate(String responseDueDate) {
		this.responseDueDate = responseDueDate;
	}

	/**
	 * 訂正回答日の取得
	 *
	 * @return responseDate
	 */
	public String getResponseDate() {
		return responseDate;
	}

	/**
	 * 訂正回答日の設定
	 *
	 * @param responseDate
	 */
	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

	/**
	 * 点検完了日の取得
	 *
	 * @return inspectionFinishedDate
	 */
	public String getInspectionFinishedDate() {
		return inspectionFinishedDate;
	}

	/**
	 * 点検完了日の設定
	 *
	 * @param inspectionFinishedDate
	 */
	public void setInspectionFinishedDate(String inspectionFinishedDate) {
		this.inspectionFinishedDate = inspectionFinishedDate;
	}

	/**
	 * 点検者担当idの取得
	 *
	 * @return inspectionManagerID
	 */
	public String getInspectionManagerID() {
		return inspectionManagerID;
	}

	/**
	 * 点検者担当idの設定
	 *
	 * @param inspectionManagerID
	 */
	public void setInspectionManagerID(String inspectionManagerID) {
		this.inspectionManagerID = inspectionManagerID;
	}

	/**
	 * 点検担当者名の取得
	 *
	 * @return inspectionName
	 */
	public String getInspectionName() {
		return inspectionName;
	}

	/**
	 * 点検担当者名の設定
	 *
	 * @param inspectionName
	 */
	public void setInspectionName(String inspectionName) {
		this.inspectionName = inspectionName;
	}

	/**
	 * 申込依頼Noの取得
	 *
	 * @return entryNo
	 */
	public String getEntryNo() {
		return entryNo;
	}

	/**
	 * 申込依頼Noの設定
	 *
	 * @param entryNo
	 */
	public void setEntryNo(String entryNo) {
		this.entryNo = entryNo;
	}

	public String[] getFileNoArray() {
		return fileNoArray;
	}

	public void setFileNoArray(String[] fileNoArray) {
		this.fileNoArray = fileNoArray;
	}
	
	/**
	 * CSRF Tokenの取得
	 *
	 * @return csrfToken
	 */
	public String getCsrfToken() {
		return csrfToken;
	}

	/**
	 * CSRF Tokenの設定
	 *
	 * @param csrfToken
	 */
	public void setCsrfToken(String csrfToken) {
		this.csrfToken = csrfToken;
	}
}

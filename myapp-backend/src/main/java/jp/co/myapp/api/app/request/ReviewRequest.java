package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class ReviewRequest implements Serializable {

    /**
     * 申込依頼No(entryNo)
     */
    @CustomizeNoEmpty(message="E00002", params="{entryNo.label;input.event}")
    @CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;entryNo.type;input.event}")
    private String entryNo;

    /**
     * 審査依頼完了画面ID(reviewRequestAfterID)
     */
    @CustomizeNoEmpty(message="E00002", params="{policy.label;input.event}")
    private String reviewRequestAfterID;

	/**
	 * ファイルID(fileId)
	 */
	private String[] fileId;

	/**
	 * 耐火郵送フラグ(fileId)
	 */
	private String fireResistanceMailingFlag;

	/**
	 * 地震割引郵送フラグ(fileId)
	 */
	private String earthquakeDiscountMailingFlag;

	/**
	 * 確認書類提出方法(documentsConfirmMethod)
	 */
	private String documentsConfirmMethod;

    /**
     * 申込依頼No(entry_no)の取得
     * @return entryNo
     */
    public String getEntryNo() {
        return entryNo;
    }
    /**
     * 申込依頼No(entry_no)の設定
     * @param entryNo String
     */
    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }

    /**
     * 商品区分(reviewRequestAfterID)の取得
     * @return reviewRequestAfterID
     */
    public String getReviewRequestAfterID() {
        return reviewRequestAfterID;
    }
    /**
     * 商品区分(reviewRequestAfterID)の設定
     * @param reviewRequestAfterID String
     */
    public void setReviewRequestAfterID(String reviewRequestAfterID) {
        this.reviewRequestAfterID = reviewRequestAfterID;
    }

	/**
	 * ファイルID(fileId)の取得
	 *
	 * @return fileId
	 */
	public String[] getFileId() {
		return fileId;
	}

	/**
	 * ファイルID(fileId)の設定
	 *
	 * @param fileId
	 *            String[]
	 */
	public void setFileId(String[] fileId) {
		this.fileId = fileId;
	}

	/**
	 * 確認書類提出方法(documentsConfirmMethod)の取得
	 *
	 * @return documentsConfirmMethod
	 */
	public String getDocumentsConfirmMethod() {
		return documentsConfirmMethod;
	}

	/**
	 * 確認書類提出方法(documentsConfirmMethod)の設定
	 *
	 * @param documentsConfirmMethod
	 *            String
	 */
	public void setDocumentsConfirmMethod(String documentsConfirmMethod) {
		this.documentsConfirmMethod = documentsConfirmMethod;
	}

	/**
	 * 耐火郵送フラグ(fireResistanceMailingFlag)の取得
	 *
	 * @return fireResistanceMailingFlag
	 */
	public String getFireResistanceMailingFlag() {
		return fireResistanceMailingFlag;
	}
	/**
	 * 耐火郵送フラグ(fireResistanceMailingFlag)の取得
	 *
	 * @return fireResistanceMailingFlag
	 */
	public void setFireResistanceMailingFlag(String fireResistanceMailingFlag) {
		this.fireResistanceMailingFlag = fireResistanceMailingFlag;
	}


	/**
	 * 地震郵送フラグ(earthquakeDiscountMailingFlag)の取得
	 *
	 * @return earthquakeDiscountMailingFlag
	 */
	public String getEarthquakeDiscountMailingFlag() {
		return earthquakeDiscountMailingFlag;
	}

	/**
	 * 地震郵送フラグ(earthquakeDiscountMailingFlag)の設定
	 *
	 * @param earthquakeDiscountMailingFlag
	 *            String
	 */
	public void setEarthquakeDiscountMailingFlag(String earthquakeDiscountMailingFlag) {
		this.earthquakeDiscountMailingFlag = earthquakeDiscountMailingFlag;
	}

}

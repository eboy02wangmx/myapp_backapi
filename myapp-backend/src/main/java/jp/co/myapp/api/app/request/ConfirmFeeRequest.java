package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeNoEmpty;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class ConfirmFeeRequest implements Serializable {
	
    /**
     * 申込依頼No(entryNo)
     */
    @CustomizeNoEmpty(message="E00002", params="{entryNo.label;input.event}")
    @CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;entryNo.type;input.event}")
    private String entryNo;
    
    /**
     * 処理ID
     */
    private String processingID;

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
     * 処理ID(processingID)の取得
     * @return processingID
     */
    public String getProcessingID() {
        return processingID;
    }
    /**
     * 処理ID(processingID)の設定
     * @param processingID String
     */
    public void setProcessingID(String processingID) {
        this.processingID = processingID;
    }

}

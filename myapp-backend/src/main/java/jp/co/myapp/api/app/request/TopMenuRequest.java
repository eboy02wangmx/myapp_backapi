package jp.co.myapp.api.app.request;

import java.io.Serializable;

import jp.co.myapp.api.domain.validate.annotation.CustomizeMailString;
import jp.co.myapp.api.domain.validate.annotation.CustomizeNoNull;
import jp.co.myapp.api.domain.validate.annotation.CustomizeTypeSizeString;


@SuppressWarnings("serial")
public class TopMenuRequest implements Serializable {
	
    /**
     * 申込依頼No(entryNo)
     */
	@CustomizeNoNull(message="E00002", params="{entryNo.label;enter.event}")
    @CustomizeTypeSizeString(max=6, regexp="", message="E00001", params="{entryNo.label;entryNo.size;enter.event}")
    private String entryNo;
    
    /**
     * メールアドレス
     */
    @CustomizeNoNull(message="E00002", params="{mail.label;enter.event}")
    @CustomizeTypeSizeString(max=254, regexp="", message="E00001", params="{mail.label;mail.size;enter.event}")
    @CustomizeMailString(message="E00002", params="{mail.label;correct.enter.event}")
    private String mail;

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
     * メールアドレス(mail)の取得
     * @return mail
     */
    public String getMail() {
        return mail;
    }
    /**
     * メールアドレス(mail)の設定
     * @param mail String
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

}

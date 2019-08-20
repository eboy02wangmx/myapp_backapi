package jp.co.myapp.api.app.request;

import java.io.Serializable;


@SuppressWarnings("serial")
public class TokenRefRequest implements Serializable {

    /**
     * myToken
     */
    private String mytoken;


    /**
     * myTokenの取得
     * @return myToken
     */
    public String getMytoken() {
        return mytoken;
    }
    /**
     * myTokenの設定
     * @param myToken String
     */
    public void setMytoken(String mytoken) {
        this.mytoken = mytoken;
    }

}

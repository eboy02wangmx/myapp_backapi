package jp.co.myapp.api.app.data.auth;

import jp.co.myapp.api.app.data.AbstractResultData;

public class AuthData extends AbstractResultData {
    private String name;
    private String[] ruleName;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getRuleName() {
        return ruleName;
    }
    public void setRuleName(String[] ruleName) {
        this.ruleName = ruleName;
    }
}


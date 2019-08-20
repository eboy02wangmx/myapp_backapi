package jp.co.myapp.api.app.mock;

import mockit.Mock;
import mockit.MockUp;

public class MockSystemDate extends MockUp<System> {

    /**
     * mock系统时间
     * 
     * @return 自定义的系统时间
     */
    @Mock
    public long currentTimeMillis() {
        return this.nowTime;
    }

    /**
     * 系统时间
     */
    Long nowTime;
    
    /**
     * 让调用方自定义系统时间
     * 
     * @param nowTime 自定义系统时间
     */
    public void setNowTime(Long nowTime) {
        this.nowTime = nowTime;
    }

}

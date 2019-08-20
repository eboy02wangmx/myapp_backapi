package jp.co.myapp.api.app.data;


public class ReviseResponseJson extends AbstractResponseJson {
    private int count = 0;
    
	public ReviseResponseJson() {
	}

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}

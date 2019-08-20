package jp.co.myapp.api.app.data;


public class UpdatedResponseJson extends AbstractResponseJson {
    private int count = 0;
    
	public UpdatedResponseJson() {
	}

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}

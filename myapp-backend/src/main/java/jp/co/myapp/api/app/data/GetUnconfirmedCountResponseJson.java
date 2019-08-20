package jp.co.myapp.api.app.data;


public class GetUnconfirmedCountResponseJson extends AbstractResponseJson {
    private int count01 = 0;
    
    private int count02 = 0;
    
	public GetUnconfirmedCountResponseJson() {
	}

    public int getCount01 () {
        return count01 ;
    }
    public void setCount01 (int count01 ) {
        this.count01  = count01 ;
    }

	public int getCount02() {
		return count02;
	}

	public void setCount02(int count02) {
		this.count02 = count02;
	}
    
    
}

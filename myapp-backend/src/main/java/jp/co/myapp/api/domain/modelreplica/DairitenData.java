package jp.co.myapp.api.domain.modelreplica;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jp.co.myapp.api.app.data.AbstractResultData;
@JsonInclude(Include.NON_NULL)
public class DairitenData<E> extends AbstractResultData {
    private Integer count;
    
    private List<E> list;
    
    /**
     * 営業課店名
     */
    private String sectionName;

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    
    public List<E> getList() {
        return list;
    }
    public void setList(List<E> list) {
        this.list = list;
    }
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
}


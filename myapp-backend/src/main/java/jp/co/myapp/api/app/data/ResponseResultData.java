package jp.co.myapp.api.app.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ResponseResultData<E> extends AbstractResultData {
    private Integer count;
    
    private List<E> list;

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
}


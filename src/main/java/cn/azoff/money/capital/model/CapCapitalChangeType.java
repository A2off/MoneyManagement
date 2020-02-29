package cn.azoff.money.capital.model;
 
/**
 * 
 * 资金变动类型
 * 
 * @version 2020-02-18 20:51:18
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class CapCapitalChangeType{
    //资金变动类型
    private Integer cctId;
    
    //变动类型(1资金减少、2资金增加)
    private Integer cctType;
    
    //类型排序
    private Integer cctSort;
    
    //类型描述
    private String cctDescribe;
    
    /********** get/set ***********/
    public Integer getCctId() {
        return cctId;
    }
 
    public void setCctId(Integer cctId) {
        this.cctId = cctId;
    }
     
    public Integer getCctType() {
        return cctType;
    }
 
    public void setCctType(Integer cctType) {
        this.cctType = cctType;
    }
     
    public Integer getCctSort() {
        return cctSort;
    }
 
    public void setCctSort(Integer cctSort) {
        this.cctSort = cctSort;
    }
     
    public String getCctDescribe() {
        return cctDescribe;
    }
 
    public void setCctDescribe(String cctDescribe) {
        this.cctDescribe = cctDescribe;
    }
     
}
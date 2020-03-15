package cn.azoff.money.capital.model;

import cn.azoff.common.base.BaseParam;
 
/**
 * 
 * 资金变动类型
 * 
 * @version 2020-03-15 20:58:13
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class CapCapitalChangeType extends BaseParam{
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
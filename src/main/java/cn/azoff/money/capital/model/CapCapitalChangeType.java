package cn.azoff.money.capital.model;
 
/**
 * 
 * Model类
 * 
 * @version 2020-02-16 18:02:08
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class CapCapitalChangeType{
    //资金变动类型
    private Integer cctid;
    
    //变动类型(1资金减少、2资金增加)
    private Integer ccttype;
    
    //类型排序
    private Integer cctsort;
    
    //类型描述
    private String cctdescribe;
    

 
    /********** get/set ***********/
    public Integer getCctid() {
        return cctid;
    }
 
    public void setCctid(Integer cctid) {
        this.cctid = cctid;
    }
     
    public Integer getCcttype() {
        return ccttype;
    }
 
    public void setCcttype(Integer ccttype) {
        this.ccttype = ccttype;
    }
     
    public Integer getCctsort() {
        return cctsort;
    }
 
    public void setCctsort(Integer cctsort) {
        this.cctsort = cctsort;
    }
     
    public String getCctdescribe() {
        return cctdescribe;
    }
 
    public void setCctdescribe(String cctdescribe) {
        this.cctdescribe = cctdescribe;
    }
     
}
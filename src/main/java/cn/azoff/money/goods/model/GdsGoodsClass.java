package cn.azoff.money.goods.model;
 
/**
 * 
 * Model类
 * 
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class GdsGoodsClass{
    //物品分类
    private Integer gdcid;
    
    //物品分类Pid
    private Integer gdcpid;
    
    //分类名
    private String gdcname;
    
    //分类描述
    private String gdcdescribe;
    

 
    /********** get/set ***********/
    public Integer getGdcid() {
        return gdcid;
    }
 
    public void setGdcid(Integer gdcid) {
        this.gdcid = gdcid;
    }
     
    public Integer getGdcpid() {
        return gdcpid;
    }
 
    public void setGdcpid(Integer gdcpid) {
        this.gdcpid = gdcpid;
    }
     
    public String getGdcname() {
        return gdcname;
    }
 
    public void setGdcname(String gdcname) {
        this.gdcname = gdcname;
    }
     
    public String getGdcdescribe() {
        return gdcdescribe;
    }
 
    public void setGdcdescribe(String gdcdescribe) {
        this.gdcdescribe = gdcdescribe;
    }
     
}
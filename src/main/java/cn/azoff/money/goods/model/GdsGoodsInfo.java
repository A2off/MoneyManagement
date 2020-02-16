package cn.azoff.money.goods.model;
 
/**
 * 
 * Model类
 * 
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class GdsGoodsInfo{
    //物品详情
    private Integer gdiid;
    
    //物品分类Id
    private Integer gdcid;
    
    //物品名称
    private String gdiname;
    
    //物品描述
    private String gdidescribe;
    

 
    /********** get/set ***********/
    public Integer getGdiid() {
        return gdiid;
    }
 
    public void setGdiid(Integer gdiid) {
        this.gdiid = gdiid;
    }
     
    public Integer getGdcid() {
        return gdcid;
    }
 
    public void setGdcid(Integer gdcid) {
        this.gdcid = gdcid;
    }
     
    public String getGdiname() {
        return gdiname;
    }
 
    public void setGdiname(String gdiname) {
        this.gdiname = gdiname;
    }
     
    public String getGdidescribe() {
        return gdidescribe;
    }
 
    public void setGdidescribe(String gdidescribe) {
        this.gdidescribe = gdidescribe;
    }
     
}
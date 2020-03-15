package cn.azoff.money.goods.model;

import cn.azoff.common.base.BaseParam;
 
/**
 * 
 * 物品详情
 * 
 * @version 2020-03-15 20:58:13
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class GdsGoodsInfo extends BaseParam{
    //物品详情
    private Integer gdiId;
    
    //物品分类Id
    private Integer gdcId;
    
    //物品名称
    private String gdiName;
    
    //物品描述
    private String gdiDescribe;
    

 
    /********** get/set ***********/
    public Integer getGdiId() {
        return gdiId;
    }
 
    public void setGdiId(Integer gdiId) {
        this.gdiId = gdiId;
    }
     
    public Integer getGdcId() {
        return gdcId;
    }
 
    public void setGdcId(Integer gdcId) {
        this.gdcId = gdcId;
    }
     
    public String getGdiName() {
        return gdiName;
    }
 
    public void setGdiName(String gdiName) {
        this.gdiName = gdiName;
    }
     
    public String getGdiDescribe() {
        return gdiDescribe;
    }
 
    public void setGdiDescribe(String gdiDescribe) {
        this.gdiDescribe = gdiDescribe;
    }
     
}
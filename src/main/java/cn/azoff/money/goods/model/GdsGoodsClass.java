package cn.azoff.money.goods.model;

import cn.azoff.common.base.BaseParam;
 
/**
 * 
 * 物品分类
 * 
 * @version 2020-03-15 20:58:13
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class GdsGoodsClass extends BaseParam{
    //物品分类
    private Integer gdcId;
    
    //物品分类Pid
    private Integer gdcPid;
    
    //分类名
    private String gdcName;
    
    //分类描述
    private String gdcDescribe;
    

 
    /********** get/set ***********/
    public Integer getGdcId() {
        return gdcId;
    }
 
    public void setGdcId(Integer gdcId) {
        this.gdcId = gdcId;
    }
     
    public Integer getGdcPid() {
        return gdcPid;
    }
 
    public void setGdcPid(Integer gdcPid) {
        this.gdcPid = gdcPid;
    }
     
    public String getGdcName() {
        return gdcName;
    }
 
    public void setGdcName(String gdcName) {
        this.gdcName = gdcName;
    }
     
    public String getGdcDescribe() {
        return gdcDescribe;
    }
 
    public void setGdcDescribe(String gdcDescribe) {
        this.gdcDescribe = gdcDescribe;
    }
     
}
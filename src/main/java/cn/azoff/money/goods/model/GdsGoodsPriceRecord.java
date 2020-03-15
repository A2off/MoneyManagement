package cn.azoff.money.goods.model;

import java.math.BigDecimal;

import cn.azoff.common.base.BaseParam;
 
/**
 * 
 * 物品单价记录
 * 
 * @version 2020-03-15 20:58:13
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class GdsGoodsPriceRecord extends BaseParam{
    //物品单价记录
    private Integer gprId;
    
    //物品详情Id
    private Integer gdiId;
    
    //物品单价
    private BigDecimal gprPrice;
    
    //记录时间
    private Long gprRecordTime;
    
    //记录创建时间
    private Long gprCreateTime;
    

 
    /********** get/set ***********/
    public Integer getGprId() {
        return gprId;
    }
 
    public void setGprId(Integer gprId) {
        this.gprId = gprId;
    }
     
    public Integer getGdiId() {
        return gdiId;
    }
 
    public void setGdiId(Integer gdiId) {
        this.gdiId = gdiId;
    }
     
    public BigDecimal getGprPrice() {
        return gprPrice;
    }
 
    public void setGprPrice(BigDecimal gprPrice) {
        this.gprPrice = gprPrice;
    }
     
    public Long getGprRecordTime() {
        return gprRecordTime;
    }
 
    public void setGprRecordTime(Long gprRecordTime) {
        this.gprRecordTime = gprRecordTime;
    }
     
    public Long getGprCreateTime() {
        return gprCreateTime;
    }
 
    public void setGprCreateTime(Long gprCreateTime) {
        this.gprCreateTime = gprCreateTime;
    }
     
}
package cn.azoff.money.goods.model;

import java.math.BigDecimal;

/**
 * 
 * Model类
 * 
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class GdsGoodsPriceRecord{
    //物品单价记录
    private Integer gprid;
    
    //物品详情Id
    private Integer gdiid;
    
    //物品单价
    private BigDecimal gprprice;
    
    //记录时间
    private Long gprrecordtime;
    
    //记录创建时间
    private Long gprcreatetime;
    

 
    /********** get/set ***********/
    public Integer getGprid() {
        return gprid;
    }
 
    public void setGprid(Integer gprid) {
        this.gprid = gprid;
    }
     
    public Integer getGdiid() {
        return gdiid;
    }
 
    public void setGdiid(Integer gdiid) {
        this.gdiid = gdiid;
    }
     
    public BigDecimal getGprprice() {
        return gprprice;
    }
 
    public void setGprprice(BigDecimal gprprice) {
        this.gprprice = gprprice;
    }
     
    public Long getGprrecordtime() {
        return gprrecordtime;
    }
 
    public void setGprrecordtime(Long gprrecordtime) {
        this.gprrecordtime = gprrecordtime;
    }
     
    public Long getGprcreatetime() {
        return gprcreatetime;
    }
 
    public void setGprcreatetime(Long gprcreatetime) {
        this.gprcreatetime = gprcreatetime;
    }
     
}
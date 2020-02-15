package cn.azoff.money.goods.model;

import java.math.BigDecimal;

public class GdsGoodsPriceRecord {
    private Integer gprId;

    private Integer gdiId;

    private BigDecimal gprPrice;

    private Long gprRecordTime;

    private Long gprCreateTime;

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
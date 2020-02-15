package cn.azoff.money.goods.model;

public class GdsGoodsInfo {
    private Integer gdiId;

    private Integer gdcId;

    private String gdiName;

    private String gdiDescribe;

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
        this.gdiName = gdiName == null ? null : gdiName.trim();
    }

    public String getGdiDescribe() {
        return gdiDescribe;
    }

    public void setGdiDescribe(String gdiDescribe) {
        this.gdiDescribe = gdiDescribe == null ? null : gdiDescribe.trim();
    }
}
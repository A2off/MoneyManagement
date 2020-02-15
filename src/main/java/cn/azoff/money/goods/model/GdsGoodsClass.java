package cn.azoff.money.goods.model;

public class GdsGoodsClass {
    private Integer gdcId;

    private Integer gdcPid;

    private String gdcName;

    private String gdcDescribe;

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
        this.gdcName = gdcName == null ? null : gdcName.trim();
    }

    public String getGdcDescribe() {
        return gdcDescribe;
    }

    public void setGdcDescribe(String gdcDescribe) {
        this.gdcDescribe = gdcDescribe == null ? null : gdcDescribe.trim();
    }
}
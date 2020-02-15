package cn.azoff.money.capital.model;

public class CapCapitalChangeType {
    private Integer cctId;

    private Integer cctType;

    private Integer cctSort;

    private String cctDescribe;

    public Integer getCctId() {
        return cctId;
    }

    public void setCctId(Integer cctId) {
        this.cctId = cctId;
    }

    public Integer getCctType() {
        return cctType;
    }

    public void setCctType(Integer cctType) {
        this.cctType = cctType;
    }

    public Integer getCctSort() {
        return cctSort;
    }

    public void setCctSort(Integer cctSort) {
        this.cctSort = cctSort;
    }

    public String getCctDescribe() {
        return cctDescribe;
    }

    public void setCctDescribe(String cctDescribe) {
        this.cctDescribe = cctDescribe == null ? null : cctDescribe.trim();
    }
}
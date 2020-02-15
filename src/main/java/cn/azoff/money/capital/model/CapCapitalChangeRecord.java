package cn.azoff.money.capital.model;

import java.math.BigDecimal;

public class CapCapitalChangeRecord {
    private Integer ccrId;

    private Integer suiId;

    private Integer cctId;

    private Integer ccrPid;

    private Integer ccrStatus;

    private BigDecimal ccrAmount;

    private Long ccrChangeTime;

    private Long ccrUpdateTime;

    public Integer getCcrId() {
        return ccrId;
    }

    public void setCcrId(Integer ccrId) {
        this.ccrId = ccrId;
    }

    public Integer getSuiId() {
        return suiId;
    }

    public void setSuiId(Integer suiId) {
        this.suiId = suiId;
    }

    public Integer getCctId() {
        return cctId;
    }

    public void setCctId(Integer cctId) {
        this.cctId = cctId;
    }

    public Integer getCcrPid() {
        return ccrPid;
    }

    public void setCcrPid(Integer ccrPid) {
        this.ccrPid = ccrPid;
    }

    public Integer getCcrStatus() {
        return ccrStatus;
    }

    public void setCcrStatus(Integer ccrStatus) {
        this.ccrStatus = ccrStatus;
    }

    public BigDecimal getCcrAmount() {
        return ccrAmount;
    }

    public void setCcrAmount(BigDecimal ccrAmount) {
        this.ccrAmount = ccrAmount;
    }

    public Long getCcrChangeTime() {
        return ccrChangeTime;
    }

    public void setCcrChangeTime(Long ccrChangeTime) {
        this.ccrChangeTime = ccrChangeTime;
    }

    public Long getCcrUpdateTime() {
        return ccrUpdateTime;
    }

    public void setCcrUpdateTime(Long ccrUpdateTime) {
        this.ccrUpdateTime = ccrUpdateTime;
    }
}
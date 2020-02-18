package cn.azoff.money.capital.model;

import java.math.BigDecimal;
 
/**
 * 
 * 资金变动记录
 * 
 * @version 2020-02-18 20:51:18
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class CapCapitalChangeRecord{
    //资金变动记录
    private Integer ccrId;
    
    //用户Id
    private Integer suiId;
    
    //资金类型Id
    private Integer cctId;
    
    //记录Id(退款用)
    private Integer ccrPid;
    
    //状态(1正常，2删除)
    private Integer ccrStatus;
    
    //变动金额
    private BigDecimal ccrAmount;
    
    //变动时间
    private Long ccrChangeTime;
    
    //更新时间
    private Long ccrUpdateTime;
    

 
    /********** get/set ***********/
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
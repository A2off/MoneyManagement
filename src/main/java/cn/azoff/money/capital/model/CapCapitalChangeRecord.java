package cn.azoff.money.capital.model;

import java.math.BigDecimal;

/**
 * 
 * Model类
 * 
 * @version 2020-02-16 18:02:08
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class CapCapitalChangeRecord{
    //资金变动记录
    private Integer ccrid;
    
    //用户Id
    private Integer suiid;
    
    //资金类型Id
    private Integer cctid;
    
    //记录Id(退款用)
    private Integer ccrpid;
    
    //状态(1正常，2删除)
    private Integer ccrstatus;
    
    //变动金额
    private BigDecimal ccramount;
    
    //变动时间
    private Long ccrchangetime;
    
    //更新时间
    private Long ccrupdatetime;
    

 
    /********** get/set ***********/
    public Integer getCcrid() {
        return ccrid;
    }
 
    public void setCcrid(Integer ccrid) {
        this.ccrid = ccrid;
    }
     
    public Integer getSuiid() {
        return suiid;
    }
 
    public void setSuiid(Integer suiid) {
        this.suiid = suiid;
    }
     
    public Integer getCctid() {
        return cctid;
    }
 
    public void setCctid(Integer cctid) {
        this.cctid = cctid;
    }
     
    public Integer getCcrpid() {
        return ccrpid;
    }
 
    public void setCcrpid(Integer ccrpid) {
        this.ccrpid = ccrpid;
    }
     
    public Integer getCcrstatus() {
        return ccrstatus;
    }
 
    public void setCcrstatus(Integer ccrstatus) {
        this.ccrstatus = ccrstatus;
    }
     
    public BigDecimal getCcramount() {
        return ccramount;
    }
 
    public void setCcramount(BigDecimal ccramount) {
        this.ccramount = ccramount;
    }
     
    public Long getCcrchangetime() {
        return ccrchangetime;
    }
 
    public void setCcrchangetime(Long ccrchangetime) {
        this.ccrchangetime = ccrchangetime;
    }
     
    public Long getCcrupdatetime() {
        return ccrupdatetime;
    }
 
    public void setCcrupdatetime(Long ccrupdatetime) {
        this.ccrupdatetime = ccrupdatetime;
    }
     
}
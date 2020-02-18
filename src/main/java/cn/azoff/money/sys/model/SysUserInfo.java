package cn.azoff.money.sys.model;
 
/**
 * 
 * 用户信息
 * 
 * @version 2020-02-18 20:54:49
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class SysUserInfo{
    //用户信息
    private Integer suiId;
    
    //用户登录账号
    private String suiLoginCode;
    
    //用户登录密码
    private String suiLoginPwd;
    
    //昵称
    private String suiNickname;
    
    //查询密码
    private String suiQueryPwd;
    
    //上次登录时间
    private Long suiLastLoginTime;
    

 
    /********** get/set ***********/
    public Integer getSuiId() {
        return suiId;
    }
 
    public void setSuiId(Integer suiId) {
        this.suiId = suiId;
    }
     
    public String getSuiLoginCode() {
        return suiLoginCode;
    }
 
    public void setSuiLoginCode(String suiLoginCode) {
        this.suiLoginCode = suiLoginCode;
    }
     
    public String getSuiLoginPwd() {
        return suiLoginPwd;
    }
 
    public void setSuiLoginPwd(String suiLoginPwd) {
        this.suiLoginPwd = suiLoginPwd;
    }
     
    public String getSuiNickname() {
        return suiNickname;
    }
 
    public void setSuiNickname(String suiNickname) {
        this.suiNickname = suiNickname;
    }
     
    public String getSuiQueryPwd() {
        return suiQueryPwd;
    }
 
    public void setSuiQueryPwd(String suiQueryPwd) {
        this.suiQueryPwd = suiQueryPwd;
    }
     
    public Long getSuiLastLoginTime() {
        return suiLastLoginTime;
    }
 
    public void setSuiLastLoginTime(Long suiLastLoginTime) {
        this.suiLastLoginTime = suiLastLoginTime;
    }
     
}
package cn.azoff.money.sys.model;

public class SysUserInfo {
    private Integer suiId;

    private String suiLoginCode;

    private String suiLoginPwd;

    private String suiNickname;

    private String suiQueryPwd;

    private Long suiLastLoginTime;

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
        this.suiLoginCode = suiLoginCode == null ? null : suiLoginCode.trim();
    }

    public String getSuiLoginPwd() {
        return suiLoginPwd;
    }

    public void setSuiLoginPwd(String suiLoginPwd) {
        this.suiLoginPwd = suiLoginPwd == null ? null : suiLoginPwd.trim();
    }

    public String getSuiNickname() {
        return suiNickname;
    }

    public void setSuiNickname(String suiNickname) {
        this.suiNickname = suiNickname == null ? null : suiNickname.trim();
    }

    public String getSuiQueryPwd() {
        return suiQueryPwd;
    }

    public void setSuiQueryPwd(String suiQueryPwd) {
        this.suiQueryPwd = suiQueryPwd == null ? null : suiQueryPwd.trim();
    }

    public Long getSuiLastLoginTime() {
        return suiLastLoginTime;
    }

    public void setSuiLastLoginTime(Long suiLastLoginTime) {
        this.suiLastLoginTime = suiLastLoginTime;
    }
}
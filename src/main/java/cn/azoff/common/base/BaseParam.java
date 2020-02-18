package cn.azoff.common.base;
/**
 * 
 * 基础参数类
 * 
 * @version 2020-02-18 19:48:47
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class BaseParam {
	
	private Integer page; //页数
	private Integer size; //每页显示的条数
	private Integer rows; //查询用 - 数据行实际起始数
	private Integer id;
	private String ids;
	private String token; //识别用户登录
	private String language; //语言
	private String version; //接口版本
	private String platform; //平台(未启用)
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getRows() {
		rows = (this.page -1) * this.size;
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
}


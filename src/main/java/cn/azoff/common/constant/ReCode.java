package cn.azoff.common.constant;
/**
 * 
 * 返回值状态代码
 * 
 * @version 2020-02-18 21:20:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public enum ReCode {
	
	
	SUCCESS("SC00"), //成功
	FAIL("ER99"), //失败
	;
	
	
	
	private final String value;

	ReCode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}


package cn.azoff.common.constant;
/**
 * 
 * 字符型状态
 * 
 * @version 2020-02-18 21:20:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public enum Type {
	Type_1("t1"),
	;

	private final String value;

	Type(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}


package cn.azoff.common.constant;
/**
 * 
 * 数值型状态
 * 
 * @version 2020-02-18 21:20:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public enum Status {
	Status_1(0),
	;

	private final int value;

	Status(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}


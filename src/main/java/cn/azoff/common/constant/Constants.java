package cn.azoff.common.constant;
/**
 * 
 * 静态常量
 * 
 * @version 2020-02-18 21:20:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public enum Constants {
	
	/**状态码 - Key*/
	Re_Code_Key("reCode"),
	/**返回信息 - Key*/
	Re_Msg_Key("reMsg"),
	/**状态 - Key*/
	Re_State_Key("reState"),
	
	/**返回值 -Id*/
	Re_Id_Key("id"),
	/**返回值 -Rows*/
	Re_Rows_Key("rows"),
	/**返回值 -Total*/
	Re_Total_Key("total"),
	/**返回值 -Data*/
	Re_Data_Key("data"),
	
	/**状态 - 成功*/
	SUCCESS("success"),
	/**状态 - 失败*/
	FAIL("fail"),
	/**返回信息 - 默认值*/
	Blank_Value(""),
	
	;
	private final String value;
	
	Constants(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}


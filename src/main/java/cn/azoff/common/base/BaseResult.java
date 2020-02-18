package cn.azoff.common.base;

import java.util.HashMap;

import cn.azoff.common.constant.Constants;
import cn.azoff.common.constant.ReCode;

/**
 * 
 * 返回值对象
 * 
 * @version 2020-02-18 17:32:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class BaseResult {
	
	private HashMap<String,Object> resultMap;//返回值存储Map
	
	public BaseResult() {
		resultMap = new HashMap<String, Object>();
	}
	
	/**
	 * 操作执行成功
	 */
	public void initResultSuccess(){
		initResultBase(Constants.SUCCESS.getValue(), ReCode.SUCCESS.getValue(), Constants.Blank_Value.getValue());
	}
	
	/**
	 * 操作执行成功 - 仅填入返回状态码
	 * @param reCode 返回状态码
	 */
	public void initResultSuccess(String reCode){
		initResultBase(Constants.SUCCESS.getValue(), reCode, Constants.Blank_Value.getValue());
	}
	
	/**
	 * 操作执行成功 - 填入返回状态码与提示
	 * @param reCode 返回状态码
	 * @param reMsg 返回提示
	 */
	public void initResultSuccess(String reCode, String reMsg){
		initResultBase(Constants.SUCCESS.getValue(), reCode, reMsg);
	}
	
	/**
	 * 操作执行失败
	 */
	public void initResultFail(){
		initResultBase(Constants.FAIL.getValue(), ReCode.FAIL.getValue(), Constants.Blank_Value.getValue());
	}
	
	/**
	 * 操作执行失败 - 仅填入返回状态码
	 * @param reCode 返回状态码
	 */
	public void initResultFail(String reCode){
		initResultBase(Constants.FAIL.getValue(), reCode, Constants.Blank_Value.getValue());
	}
	
	/**
	 * 操作执行失败 - 填入返回状态码与提示
	 * @param reCode 返回状态码
	 * @param reMsg 返回提示
	 */
	public void initResultFail(String reCode, String reMsg){
		initResultBase(Constants.FAIL.getValue(), reCode, reMsg);
	}
	
	/**
	 * 
	 * 初始化返回值基础方法
	 * 
	 * @param reState 返回操作状态
	 * @param reCode 返回状态码
	 * @param reMsg 返回提示
	 */
	private void initResultBase(String reState,String reCode, String reMsg){
		resultMap.put(Constants.Re_State_Key.getValue(), reState);
		resultMap.put(Constants.Re_Code_Key.getValue(), reCode);
		resultMap.put(Constants.Re_Msg_Key.getValue(), reMsg);
	}
	
	/**
	 * 追加参数
	 * @param key
	 * @param obj
	 */
	public void put(String key,Object obj){
		resultMap.put(key, obj);
	}
	
	public HashMap<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(HashMap<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

	@Override
	public String toString() {
		return "BaseResult [result=" + resultMap + "]";
	}
}
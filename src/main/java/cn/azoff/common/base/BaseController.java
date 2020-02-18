package cn.azoff.common.base;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import cn.azoff.common.constant.Constants;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * 基础控制器
 * 
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class BaseController {
	protected Logger log = Logger.getLogger(this.getClass());
	protected static boolean isEncode = false;//是否加密
	
	/**
	 * 操作完成
	 * @return
	 * @throws IOException
	 */
	public Object toSuccess() throws IOException{
		BaseResult result = new BaseResult();
		result.initResultSuccess();
		return toSuccess(result);
	}
	
	/**
	 * 操作完成
	 * @param result
	 * @return
	 * @throws IOException
	 */
	public Object toSuccess(BaseResult result) throws IOException{
		return result.getResultMap();
	}
	
	/**
	 * 操作未完成
	 * @return
	 * @throws IOException
	 */
	public Object toError() throws IOException{
		BaseResult result = new BaseResult();
		result.initResultFail();
		return toError(result);
	}
	
	/**
	 * 操作未完成
	 * @param result
	 * @return
	 * @throws IOException
	 */
	public Object toError(BaseResult result) throws IOException{
		return result.getResultMap();
	}
	
	/**
	 * 将对象转为json字符串
	 * 
	 * @param object
	 * @return
	 * @throws IOException
	 */
	public String toJson(Object object) throws IOException {
		ObjectMapper mapper = getDefaultObjectMapper();
		try {
			String resultStr = mapper.writeValueAsString(object);
			if (isEncode) {
				resultStr = toEncrypt(resultStr);
			}
			log.info("controller输出：" + resultStr.toString());
			return resultStr;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return Constants.Blank_Value.getValue();
		}
	}
	
	private ObjectMapper getDefaultObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		
		// 设置将对象转换成JSON字符串时候:包含的属性不能为空或"";
		// Include.Include.ALWAYS 默认
		// Include.NON_DEFAULT 属性为默认值不序列化
		// Include.NON_EMPTY 属性为 空（""） 或者为 NULL 都不序列化
		// Include.NON_NULL 属性为NULL 不序列化
		// mapper.setSerializationInclusion(Inclusion.NON_EMPTY);
		// 设置将MAP转换为JSON时候只转换值不等于NULL的
		// mapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES,
		// true);
		// mapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
		// mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		// 设置有属性不能映射成PO时不报错
		// mapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
		return mapper;
	}
	
	/**
	 * 数据加密
	 * @param resultStr
	 * @return
	 */
	private String toEncrypt(String resultStr){
		//
		return resultStr;
	}
	
	/**
	 * 获取IP地址
	 */
	public String printIp(HttpServletRequest request){
		String ip = request.getHeader("X-Real-IP");
		if (ip == null) {
			ip = request.getRemoteAddr();
		}
		log.info("IP地址："+request.getHeader("X-Real-IP"));
		return ip;
	}
	
    /**
     * 数值为空或者0
     * @param value
     * @return
     */
    public boolean isNullOrZero(Integer value){
    	if(value==null || value.intValue()==0){
    		return true;
    	}
    	return false;
    }
    
    /**
     * 字符串为空或者为null
     * @param value
     * @return
     */
    public boolean isBlank(String value){
    	if(value==null || value.trim().length()==0){
    		return true;
    	}
    	return false;
    }


}


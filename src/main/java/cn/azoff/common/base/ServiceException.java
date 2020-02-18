package cn.azoff.common.base;
/**
 * 
 * 异常抛出类
 * 
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public class ServiceException extends Exception{

	private static final long serialVersionUID = 1L;
	private String chMsg;//中文错误提示
	private String enMsg;//英文错误提示
	private String reCode;//错误代码
	
	public ServiceException(String chMsg) {
		super(chMsg);
		setChMsg(chMsg);
	}
	
	public ServiceException(String reCode,String chMsg) {
		super(chMsg);
		setChMsg(chMsg);
		setReCode(reCode);
	}
	
	public ServiceException(String reCode,String chMsg,String enMsg) {
		super(chMsg);
		setChMsg(chMsg);
		setEnMsg(enMsg);
		setReCode(reCode);
	}

	public String getChMsg() {
		return chMsg;
	}

	public void setChMsg(String chMsg) {
		this.chMsg = chMsg;
	}

	public String getEnMsg() {
		return enMsg;
	}

	public void setEnMsg(String enMsg) {
		this.enMsg = enMsg;
	}

	public String getReCode() {
		return reCode;
	}

	public void setReCode(String reCode) {
		this.reCode = reCode;
	}
	
	
}


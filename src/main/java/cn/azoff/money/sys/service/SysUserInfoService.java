package cn.azoff.money.sys.service;

import java.util.Map;

import cn.azoff.money.sys.model.SysUserInfo;

/**
 * 
 * 逻辑实现类接口层
 * 
 * @version 2020-02-18 20:54:48
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface SysUserInfoService {

	/**
	 * 保存编辑
	 * @param record
	 * @return
	 */
	Map<String, Object> save(SysUserInfo record);
	
	/**
	 * 查找列表
	 * @param record
	 * @return
	 */
	Map<String, Object> findByAll(SysUserInfo record);
	
	/**
	 * 根据Id查找数据
	 * @param suiId
	 * @return
	 */
	Map<String, Object> findBySuiId(Integer suiId);
	
	/**
	 * 根据Id删除数据
	 * @param suiId
	 * @return
	 */
	Map<String, Object> deleteBySuiId(Integer suiId);
	

	
}

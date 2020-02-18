package cn.azoff.money.capital.service;

import java.util.Map;

import cn.azoff.money.capital.model.CapCapitalChangeType;

/**
 * 
 * 逻辑实现类接口层
 * 
 * @version 2020-02-18 21:02:17
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface CapCapitalChangeTypeService {

	/**
	 * 保存编辑
	 * @param record
	 * @return
	 */
	Map<String, Object> save(CapCapitalChangeType record);
	
	/**
	 * 查找列表
	 * @param record
	 * @return
	 */
	Map<String, Object> findByAll(CapCapitalChangeType record);
	
	/**
	 * 根据Id查找数据
	 * @param cctId
	 * @return
	 */
	Map<String, Object> findByCctId(Integer cctId);
	
	/**
	 * 根据Id删除数据
	 * @param cctId
	 * @return
	 */
	Map<String, Object> deleteByCctId(Integer cctId);
	

	
}

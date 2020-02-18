package cn.azoff.money.capital.service;

import java.util.Map;

import cn.azoff.money.capital.model.CapCapitalChangeRecord;

/**
 * 
 * 逻辑实现类接口层
 * 
 * @version 2020-02-18 21:02:17
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface CapCapitalChangeRecordService {

	/**
	 * 保存编辑
	 * @param record
	 * @return
	 */
	Map<String, Object> save(CapCapitalChangeRecord record);
	
	/**
	 * 查找列表
	 * @param record
	 * @return
	 */
	Map<String, Object> findByAll(CapCapitalChangeRecord record);
	
	/**
	 * 根据Id查找数据
	 * @param ccrId
	 * @return
	 */
	Map<String, Object> findByCcrId(Integer ccrId);
	
	/**
	 * 根据Id删除数据
	 * @param ccrId
	 * @return
	 */
	Map<String, Object> deleteByCcrId(Integer ccrId);
	

	
}

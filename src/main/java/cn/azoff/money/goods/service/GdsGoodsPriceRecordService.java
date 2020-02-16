package cn.azoff.money.goods.service;

import java.util.Map;

import cn.azoff.money.goods.model.GdsGoodsPriceRecord;

/**
 * 
 * 逻辑实现类接口层
 * 
 * @version 2020-02-16 18:12:16
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface GdsGoodsPriceRecordService {

	/**
	 * 保存编辑
	 * @param record
	 * @return
	 */
	Map<String, Object> save(GdsGoodsPriceRecord record);
	
	/**
	 * 查找列表
	 * @param record
	 * @return
	 */
	Map<String, Object> findByAll(GdsGoodsPriceRecord record);
	
	/**
	 * 根据Id查找数据
	 * @param gprId
	 * @return
	 */
	Map<String, Object> findByGprId(Integer gprId);
	
	/**
	 * 根据Id删除数据
	 * @param gprId
	 * @return
	 */
	Map<String, Object> deleteByGprId(Integer gprId);
	

	
}

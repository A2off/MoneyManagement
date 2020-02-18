package cn.azoff.money.goods.service;

import java.util.Map;

import cn.azoff.money.goods.model.GdsGoodsClass;

/**
 * 
 * 逻辑实现类接口层
 * 
 * @version 2020-02-18 20:59:10
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface GdsGoodsClassService {

	/**
	 * 保存编辑
	 * @param record
	 * @return
	 */
	Map<String, Object> save(GdsGoodsClass record);
	
	/**
	 * 查找列表
	 * @param record
	 * @return
	 */
	Map<String, Object> findByAll(GdsGoodsClass record);
	
	/**
	 * 根据Id查找数据
	 * @param gdcId
	 * @return
	 */
	Map<String, Object> findByGdcId(Integer gdcId);
	
	/**
	 * 根据Id删除数据
	 * @param gdcId
	 * @return
	 */
	Map<String, Object> deleteByGdcId(Integer gdcId);
	

	
}

package cn.azoff.money.goods.service;

import java.util.Map;

import cn.azoff.money.goods.model.GdsGoodsInfo;

/**
 * 
 * 逻辑实现类接口层
 * 
 * @version 2020-02-18 20:59:10
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface GdsGoodsInfoService {

	/**
	 * 保存编辑
	 * @param record
	 * @return
	 */
	Map<String, Object> save(GdsGoodsInfo record);
	
	/**
	 * 查找列表
	 * @param record
	 * @return
	 */
	Map<String, Object> findByAll(GdsGoodsInfo record);
	
	/**
	 * 根据Id查找数据
	 * @param gdiId
	 * @return
	 */
	Map<String, Object> findByGdiId(Integer gdiId);
	
	/**
	 * 根据Id删除数据
	 * @param gdiId
	 * @return
	 */
	Map<String, Object> deleteByGdiId(Integer gdiId);
	

	
}

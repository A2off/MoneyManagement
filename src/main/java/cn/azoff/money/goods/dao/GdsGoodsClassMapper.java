package cn.azoff.money.goods.dao;

import java.util.List;

import cn.azoff.money.goods.model.GdsGoodsClass;

/**
 * 
 * Dao接口
 * 
 * @version 2020-02-16 18:12:16
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface GdsGoodsClassMapper {

	List<GdsGoodsClass> findByAll(GdsGoodsClass record);
	
	int findByAllCount(GdsGoodsClass record);
	
    int deleteByPrimaryKey(Integer gdcId);

    int insert(GdsGoodsClass record);

    int insertSelective(GdsGoodsClass record);

    GdsGoodsClass selectByPrimaryKey(Integer gdcId);

    int updateByPrimaryKeySelective(GdsGoodsClass record);

    int updateByPrimaryKey(GdsGoodsClass record);

}

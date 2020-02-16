package cn.azoff.money.goods.dao;

import java.util.List;

import cn.azoff.money.goods.model.GdsGoodsInfo;

/**
 * 
 * Dao接口
 * 
 * @version 2020-02-16 18:12:16
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface GdsGoodsInfoMapper {

	List<GdsGoodsInfo> findByAll(GdsGoodsInfo record);
	
	int findByAllCount(GdsGoodsInfo record);
	
    int deleteByPrimaryKey(Integer gdiId);

    int insert(GdsGoodsInfo record);

    int insertSelective(GdsGoodsInfo record);

    GdsGoodsInfo selectByPrimaryKey(Integer gdiId);

    int updateByPrimaryKeySelective(GdsGoodsInfo record);

    int updateByPrimaryKey(GdsGoodsInfo record);

}

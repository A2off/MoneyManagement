package cn.azoff.money.goods.dao;

import java.util.List;

import cn.azoff.money.goods.model.GdsGoodsPriceRecord;

/**
 * 
 * Dao接口
 * 
 * @version 2020-02-16 18:12:16
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface GdsGoodsPriceRecordMapper {

	List<GdsGoodsPriceRecord> findByAll(GdsGoodsPriceRecord record);
	
	int findByAllCount(GdsGoodsPriceRecord record);
	
    int deleteByPrimaryKey(Integer gprId);

    int insert(GdsGoodsPriceRecord record);

    int insertSelective(GdsGoodsPriceRecord record);

    GdsGoodsPriceRecord selectByPrimaryKey(Integer gprId);

    int updateByPrimaryKeySelective(GdsGoodsPriceRecord record);

    int updateByPrimaryKey(GdsGoodsPriceRecord record);

}

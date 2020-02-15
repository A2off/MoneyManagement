package cn.azoff.money.goods.dao;

import cn.azoff.money.goods.model.GdsGoodsPriceRecord;

public interface GdsGoodsPriceRecordMapper {
    int deleteByPrimaryKey(Integer gprId);

    int insert(GdsGoodsPriceRecord record);

    int insertSelective(GdsGoodsPriceRecord record);

    GdsGoodsPriceRecord selectByPrimaryKey(Integer gprId);

    int updateByPrimaryKeySelective(GdsGoodsPriceRecord record);

    int updateByPrimaryKey(GdsGoodsPriceRecord record);
}
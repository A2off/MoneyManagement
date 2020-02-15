package cn.azoff.money.goods.dao;

import cn.azoff.money.goods.model.GdsGoodsClass;

public interface GdsGoodsClassMapper {
    int deleteByPrimaryKey(Integer gdcId);

    int insert(GdsGoodsClass record);

    int insertSelective(GdsGoodsClass record);

    GdsGoodsClass selectByPrimaryKey(Integer gdcId);

    int updateByPrimaryKeySelective(GdsGoodsClass record);

    int updateByPrimaryKey(GdsGoodsClass record);
}
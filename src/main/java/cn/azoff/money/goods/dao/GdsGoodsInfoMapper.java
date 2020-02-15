package cn.azoff.money.goods.dao;

import cn.azoff.money.goods.model.GdsGoodsInfo;

public interface GdsGoodsInfoMapper {
    int deleteByPrimaryKey(Integer gdiId);

    int insert(GdsGoodsInfo record);

    int insertSelective(GdsGoodsInfo record);

    GdsGoodsInfo selectByPrimaryKey(Integer gdiId);

    int updateByPrimaryKeySelective(GdsGoodsInfo record);

    int updateByPrimaryKey(GdsGoodsInfo record);
}
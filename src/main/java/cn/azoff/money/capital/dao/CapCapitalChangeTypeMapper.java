package cn.azoff.money.capital.dao;

import cn.azoff.money.capital.model.CapCapitalChangeType;

public interface CapCapitalChangeTypeMapper {
    int deleteByPrimaryKey(Integer cctId);

    int insert(CapCapitalChangeType record);

    int insertSelective(CapCapitalChangeType record);

    CapCapitalChangeType selectByPrimaryKey(Integer cctId);

    int updateByPrimaryKeySelective(CapCapitalChangeType record);

    int updateByPrimaryKey(CapCapitalChangeType record);
}
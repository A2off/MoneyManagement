package cn.azoff.money.capital.dao;

import cn.azoff.money.capital.model.CapCapitalChangeRecord;

public interface CapCapitalChangeRecordMapper {
    int deleteByPrimaryKey(Integer ccrId);

    int insert(CapCapitalChangeRecord record);

    int insertSelective(CapCapitalChangeRecord record);

    CapCapitalChangeRecord selectByPrimaryKey(Integer ccrId);

    int updateByPrimaryKeySelective(CapCapitalChangeRecord record);

    int updateByPrimaryKey(CapCapitalChangeRecord record);
}
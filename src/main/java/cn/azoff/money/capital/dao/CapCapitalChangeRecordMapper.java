package cn.azoff.money.capital.dao;

import java.util.List;

import cn.azoff.money.capital.model.CapCapitalChangeRecord;

/**
 * 
 * Dao接口
 * 
 * @version 2020-02-16 18:02:08
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface CapCapitalChangeRecordMapper {

	List<CapCapitalChangeRecord> findByAll(CapCapitalChangeRecord record);
	
	int findByAllCount(CapCapitalChangeRecord record);
	
    int deleteByPrimaryKey(Integer ccrId);

    int insert(CapCapitalChangeRecord record);

    int insertSelective(CapCapitalChangeRecord record);

    CapCapitalChangeRecord selectByPrimaryKey(Integer ccrId);

    int updateByPrimaryKeySelective(CapCapitalChangeRecord record);

    int updateByPrimaryKey(CapCapitalChangeRecord record);

}

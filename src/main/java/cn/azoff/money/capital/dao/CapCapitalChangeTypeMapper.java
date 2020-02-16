package cn.azoff.money.capital.dao;

import java.util.List;

import cn.azoff.money.capital.model.CapCapitalChangeType;

/**
 * 
 * Dao接口
 * 
 * @version 2020-02-16 18:02:08
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface CapCapitalChangeTypeMapper {

	List<CapCapitalChangeType> findByAll(CapCapitalChangeType record);
	
	int findByAllCount(CapCapitalChangeType record);
	
    int deleteByPrimaryKey(Integer cctId);

    int insert(CapCapitalChangeType record);

    int insertSelective(CapCapitalChangeType record);

    CapCapitalChangeType selectByPrimaryKey(Integer cctId);

    int updateByPrimaryKeySelective(CapCapitalChangeType record);

    int updateByPrimaryKey(CapCapitalChangeType record);

}

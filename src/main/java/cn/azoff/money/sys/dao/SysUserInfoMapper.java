package cn.azoff.money.sys.dao;

import java.util.List;

import cn.azoff.money.sys.model.SysUserInfo;

/**
 * 
 * Dao接口
 * 
 * @version 2020-02-16 18:14:25
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
public interface SysUserInfoMapper {

	List<SysUserInfo> findByAll(SysUserInfo record);
	
	int findByAllCount(SysUserInfo record);
	
    int deleteByPrimaryKey(Integer suiId);

    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    SysUserInfo selectByPrimaryKey(Integer suiId);

    int updateByPrimaryKeySelective(SysUserInfo record);

    int updateByPrimaryKey(SysUserInfo record);

}

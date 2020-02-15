package cn.azoff.money.sys.dao;

import cn.azoff.money.sys.model.SysUserInfo;

public interface SysUserInfoMapper {
    int deleteByPrimaryKey(Integer suiId);

    int insert(SysUserInfo record);

    int insertSelective(SysUserInfo record);

    SysUserInfo selectByPrimaryKey(Integer suiId);

    int updateByPrimaryKeySelective(SysUserInfo record);

    int updateByPrimaryKey(SysUserInfo record);
}
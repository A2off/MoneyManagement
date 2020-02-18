package cn.azoff.money.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.azoff.common.base.BaseResult;
import cn.azoff.common.constant.Constants;
import cn.azoff.common.utils.DateStampUtils;
import cn.azoff.money.sys.service.SysUserInfoService;
import cn.azoff.money.sys.dao.SysUserInfoMapper;
import cn.azoff.money.sys.model.SysUserInfo;

/**
 * 
 * 逻辑实现类实现层
 * 
 * @version 2020-02-18 21:03:02
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Service("sysUserInfoService")
public class SysUserInfoServiceImpl implements SysUserInfoService{
	
	@Autowired
	private SysUserInfoMapper sysUserInfoMapper;
	
	@Override
	public Map<String, Object> save(SysUserInfo record) {
		BaseResult result = new BaseResult();
		try {
			if(record.getSuiId() == null){
				DateStampUtils.getGMTUnixTimeByCalendar();
				//record.setSuiCreateTime(DateStampUtils.getGMTUnixTimeByCalendar());
				sysUserInfoMapper.insertSelective(record);
			}
			sysUserInfoMapper.updateByPrimaryKeySelective(record);
			result.initResultSuccess();
			result.put(Constants.Re_Id_Key.getValue(), record.getSuiId());
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findByAll(SysUserInfo record) {
		BaseResult result = new BaseResult();
		try {
			List<SysUserInfo> list = sysUserInfoMapper.findByAll(record);
			int total = sysUserInfoMapper.findByAllCount(record);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), list);
			result.put(Constants.Re_Total_Key.getValue(), total);
			//result.put(Constants.Re_Data_Key.getValue(), sum);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findBySuiId(Integer suiId) {
		BaseResult result = new BaseResult();
		try {
			SysUserInfo sysUserInfo = sysUserInfoMapper.selectByPrimaryKey(suiId);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), sysUserInfo);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

	@Override
	public Map<String, Object> deleteBySuiId(Integer suiId) {
		BaseResult result = new BaseResult();
		try {
			sysUserInfoMapper.deleteByPrimaryKey(suiId);
			result.initResultSuccess();
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

}

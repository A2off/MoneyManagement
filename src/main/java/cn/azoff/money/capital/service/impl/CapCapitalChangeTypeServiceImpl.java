package cn.azoff.money.capital.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.azoff.common.base.BaseResult;
import cn.azoff.common.constant.Constants;
import cn.azoff.common.utils.DateStampUtils;
import cn.azoff.money.capital.service.CapCapitalChangeTypeService;
import cn.azoff.money.capital.dao.CapCapitalChangeTypeMapper;
import cn.azoff.money.capital.model.CapCapitalChangeType;

/**
 * 
 * 逻辑实现类实现层
 * 
 * @version 2020-02-18 21:02:17
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Service("capCapitalChangeTypeService")
public class CapCapitalChangeTypeServiceImpl implements CapCapitalChangeTypeService{
	
	@Autowired
	private CapCapitalChangeTypeMapper capCapitalChangeTypeMapper;
	
	@Override
	public Map<String, Object> save(CapCapitalChangeType record) {
		BaseResult result = new BaseResult();
		try {
			if(record.getCctId() == null){
				DateStampUtils.getGMTUnixTimeByCalendar();
				//record.setCctCreateTime(DateStampUtils.getGMTUnixTimeByCalendar());
				capCapitalChangeTypeMapper.insertSelective(record);
			}
			capCapitalChangeTypeMapper.updateByPrimaryKeySelective(record);
			result.initResultSuccess();
			result.put(Constants.Re_Id_Key.getValue(), record.getCctId());
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findByAll(CapCapitalChangeType record) {
		BaseResult result = new BaseResult();
		try {
			List<CapCapitalChangeType> list = capCapitalChangeTypeMapper.findByAll(record);
			int total = capCapitalChangeTypeMapper.findByAllCount(record);
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
	public Map<String, Object> findByCctId(Integer cctId) {
		BaseResult result = new BaseResult();
		try {
			CapCapitalChangeType capCapitalChangeType = capCapitalChangeTypeMapper.selectByPrimaryKey(cctId);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), capCapitalChangeType);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

	@Override
	public Map<String, Object> deleteByCctId(Integer cctId) {
		BaseResult result = new BaseResult();
		try {
			capCapitalChangeTypeMapper.deleteByPrimaryKey(cctId);
			result.initResultSuccess();
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

}

package cn.azoff.money.capital.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.azoff.common.base.BaseResult;
import cn.azoff.common.constant.Constants;
import cn.azoff.common.utils.DateStampUtils;
import cn.azoff.money.capital.service.CapCapitalChangeRecordService;
import cn.azoff.money.capital.dao.CapCapitalChangeRecordMapper;
import cn.azoff.money.capital.model.CapCapitalChangeRecord;

/**
 * 
 * 逻辑实现类实现层
 * 
 * @version 2020-02-18 21:02:17
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Service("capCapitalChangeRecordService")
public class CapCapitalChangeRecordServiceImpl implements CapCapitalChangeRecordService{
	
	@Autowired
	private CapCapitalChangeRecordMapper capCapitalChangeRecordMapper;
	
	@Override
	public Map<String, Object> save(CapCapitalChangeRecord record) {
		BaseResult result = new BaseResult();
		try {
			if(record.getCcrId() == null){
				DateStampUtils.getGMTUnixTimeByCalendar();
				//record.setCcrCreateTime(DateStampUtils.getGMTUnixTimeByCalendar());
				capCapitalChangeRecordMapper.insertSelective(record);
			}
			capCapitalChangeRecordMapper.updateByPrimaryKeySelective(record);
			result.initResultSuccess();
			result.put(Constants.Re_Id_Key.getValue(), record.getCcrId());
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findByAll(CapCapitalChangeRecord record) {
		BaseResult result = new BaseResult();
		try {
			List<CapCapitalChangeRecord> list = capCapitalChangeRecordMapper.findByAll(record);
			int total = capCapitalChangeRecordMapper.findByAllCount(record);
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
	public Map<String, Object> findByCcrId(Integer ccrId) {
		BaseResult result = new BaseResult();
		try {
			CapCapitalChangeRecord capCapitalChangeRecord = capCapitalChangeRecordMapper.selectByPrimaryKey(ccrId);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), capCapitalChangeRecord);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

	@Override
	public Map<String, Object> deleteByCcrId(Integer ccrId) {
		BaseResult result = new BaseResult();
		try {
			capCapitalChangeRecordMapper.deleteByPrimaryKey(ccrId);
			result.initResultSuccess();
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

}

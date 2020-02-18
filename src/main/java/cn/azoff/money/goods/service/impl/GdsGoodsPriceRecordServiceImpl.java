package cn.azoff.money.goods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.azoff.common.base.BaseResult;
import cn.azoff.common.constant.Constants;
import cn.azoff.common.utils.DateStampUtils;
import cn.azoff.money.goods.service.GdsGoodsPriceRecordService;
import cn.azoff.money.goods.dao.GdsGoodsPriceRecordMapper;
import cn.azoff.money.goods.model.GdsGoodsPriceRecord;

/**
 * 
 * 逻辑实现类实现层
 * 
 * @version 2020-02-18 21:01:37
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Service("gdsGoodsPriceRecordService")
public class GdsGoodsPriceRecordServiceImpl implements GdsGoodsPriceRecordService{
	
	@Autowired
	private GdsGoodsPriceRecordMapper gdsGoodsPriceRecordMapper;
	
	@Override
	public Map<String, Object> save(GdsGoodsPriceRecord record) {
		BaseResult result = new BaseResult();
		try {
			if(record.getGprId() == null){
				DateStampUtils.getGMTUnixTimeByCalendar();
				//record.setGprCreateTime(DateStampUtils.getGMTUnixTimeByCalendar());
				gdsGoodsPriceRecordMapper.insertSelective(record);
			}
			gdsGoodsPriceRecordMapper.updateByPrimaryKeySelective(record);
			result.initResultSuccess();
			result.put(Constants.Re_Id_Key.getValue(), record.getGprId());
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findByAll(GdsGoodsPriceRecord record) {
		BaseResult result = new BaseResult();
		try {
			List<GdsGoodsPriceRecord> list = gdsGoodsPriceRecordMapper.findByAll(record);
			int total = gdsGoodsPriceRecordMapper.findByAllCount(record);
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
	public Map<String, Object> findByGprId(Integer gprId) {
		BaseResult result = new BaseResult();
		try {
			GdsGoodsPriceRecord gdsGoodsPriceRecord = gdsGoodsPriceRecordMapper.selectByPrimaryKey(gprId);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), gdsGoodsPriceRecord);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

	@Override
	public Map<String, Object> deleteByGprId(Integer gprId) {
		BaseResult result = new BaseResult();
		try {
			gdsGoodsPriceRecordMapper.deleteByPrimaryKey(gprId);
			result.initResultSuccess();
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

}

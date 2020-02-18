package cn.azoff.money.goods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.azoff.common.base.BaseResult;
import cn.azoff.common.constant.Constants;
import cn.azoff.common.utils.DateStampUtils;
import cn.azoff.money.goods.service.GdsGoodsClassService;
import cn.azoff.money.goods.dao.GdsGoodsClassMapper;
import cn.azoff.money.goods.model.GdsGoodsClass;

/**
 * 
 * 逻辑实现类实现层
 * 
 * @version 2020-02-18 21:01:37
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Service("gdsGoodsClassService")
public class GdsGoodsClassServiceImpl implements GdsGoodsClassService{
	
	@Autowired
	private GdsGoodsClassMapper gdsGoodsClassMapper;
	
	@Override
	public Map<String, Object> save(GdsGoodsClass record) {
		BaseResult result = new BaseResult();
		try {
			if(record.getGdcId() == null){
				DateStampUtils.getGMTUnixTimeByCalendar();
				//record.setGdcCreateTime(DateStampUtils.getGMTUnixTimeByCalendar());
				gdsGoodsClassMapper.insertSelective(record);
			}
			gdsGoodsClassMapper.updateByPrimaryKeySelective(record);
			result.initResultSuccess();
			result.put(Constants.Re_Id_Key.getValue(), record.getGdcId());
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findByAll(GdsGoodsClass record) {
		BaseResult result = new BaseResult();
		try {
			List<GdsGoodsClass> list = gdsGoodsClassMapper.findByAll(record);
			int total = gdsGoodsClassMapper.findByAllCount(record);
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
	public Map<String, Object> findByGdcId(Integer gdcId) {
		BaseResult result = new BaseResult();
		try {
			GdsGoodsClass gdsGoodsClass = gdsGoodsClassMapper.selectByPrimaryKey(gdcId);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), gdsGoodsClass);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

	@Override
	public Map<String, Object> deleteByGdcId(Integer gdcId) {
		BaseResult result = new BaseResult();
		try {
			gdsGoodsClassMapper.deleteByPrimaryKey(gdcId);
			result.initResultSuccess();
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

}

package cn.azoff.money.goods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.azoff.common.base.BaseResult;
import cn.azoff.common.constant.Constants;
import cn.azoff.common.utils.DateStampUtils;
import cn.azoff.money.goods.service.GdsGoodsInfoService;
import cn.azoff.money.goods.dao.GdsGoodsInfoMapper;
import cn.azoff.money.goods.model.GdsGoodsInfo;

/**
 * 
 * 逻辑实现类实现层
 * 
 * @version 2020-02-18 21:01:37
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Service("gdsGoodsInfoService")
public class GdsGoodsInfoServiceImpl implements GdsGoodsInfoService{
	
	@Autowired
	private GdsGoodsInfoMapper gdsGoodsInfoMapper;
	
	@Override
	public Map<String, Object> save(GdsGoodsInfo record) {
		BaseResult result = new BaseResult();
		try {
			if(record.getGdiId() == null){
				DateStampUtils.getGMTUnixTimeByCalendar();
				//record.setGdiCreateTime(DateStampUtils.getGMTUnixTimeByCalendar());
				gdsGoodsInfoMapper.insertSelective(record);
			}
			gdsGoodsInfoMapper.updateByPrimaryKeySelective(record);
			result.initResultSuccess();
			result.put(Constants.Re_Id_Key.getValue(), record.getGdiId());
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}
	
	@Override
	public Map<String, Object> findByAll(GdsGoodsInfo record) {
		BaseResult result = new BaseResult();
		try {
			List<GdsGoodsInfo> list = gdsGoodsInfoMapper.findByAll(record);
			int total = gdsGoodsInfoMapper.findByAllCount(record);
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
	public Map<String, Object> findByGdiId(Integer gdiId) {
		BaseResult result = new BaseResult();
		try {
			GdsGoodsInfo gdsGoodsInfo = gdsGoodsInfoMapper.selectByPrimaryKey(gdiId);
			result.initResultSuccess();
			result.put(Constants.Re_Rows_Key.getValue(), gdsGoodsInfo);
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

	@Override
	public Map<String, Object> deleteByGdiId(Integer gdiId) {
		BaseResult result = new BaseResult();
		try {
			gdsGoodsInfoMapper.deleteByPrimaryKey(gdiId);
			result.initResultSuccess();
		} catch (Exception e){
			e.printStackTrace();
			result.initResultFail();
		}
		return result.getResultMap();
	}

}

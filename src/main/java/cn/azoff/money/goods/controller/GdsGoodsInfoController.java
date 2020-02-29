package cn.azoff.money.goods.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.azoff.money.goods.model.GdsGoodsInfo;
import cn.azoff.money.goods.service.GdsGoodsInfoService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-29 15:50:56
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@RestController
@RequestMapping("gdsGoodsInfo")
public class GdsGoodsInfoController {
	
	@Autowired
	private GdsGoodsInfoService gdsGoodsInfoService;
	
	/**
	 * 分页查询
	 * @param record
	 * @return
	 */
	@RequestMapping("findByAll")
	public Map<String, Object> findByAll(GdsGoodsInfo record){
		return gdsGoodsInfoService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	public Map<String, Object> save(GdsGoodsInfo record) {
		return gdsGoodsInfoService.save(record);
	}
	
	/**
	 * 通过gdiId查看详细
	 * @param gdiId
	 * @return
	 */
	@RequestMapping("findByGdiId")
	public Map<String, Object> findByGdiId(Integer gdiId) {
		return gdsGoodsInfoService.findByGdiId(gdiId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param gdiId
	 * @return
	 */
	@RequestMapping("/deleteByGdiId")
	public Map<String, Object> deleteByGdiId(Integer gdiId){
		return gdsGoodsInfoService.deleteByGdiId(gdiId);
	}

}

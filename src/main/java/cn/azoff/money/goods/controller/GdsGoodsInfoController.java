package cn.azoff.money.goods.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.azoff.money.goods.model.GdsGoodsInfo;
import cn.azoff.money.goods.service.GdsGoodsInfoService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-16 18:12:16
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Controller
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
	@ResponseBody
	public Map<String, Object> findByAll(GdsGoodsInfo record){
		return gdsGoodsInfoService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String, Object> save(GdsGoodsInfo record) {
		return gdsGoodsInfoService.save(record);
	}
	
	/**
	 * 通过gdiId查看详细
	 * @param gdiId
	 * @return
	 */
	@RequestMapping("findByGdiId")
	@ResponseBody
	public Map<String, Object> findByGdiId(Integer gdiId) {
		return gdsGoodsInfoService.findByGdiId(GdiId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param gdiId
	 * @return
	 */
	@RequestMapping("/deleteByGdiId")
	@ResponseBody
	public Map<String, Object> deleteByGdiId(Integer gdiId){
		return gdsGoodsInfoService.deleteByGdiId(GdiId);
	}

}

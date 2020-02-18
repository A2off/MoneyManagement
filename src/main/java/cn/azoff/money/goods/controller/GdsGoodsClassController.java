package cn.azoff.money.goods.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.azoff.money.goods.model.GdsGoodsClass;
import cn.azoff.money.goods.service.GdsGoodsClassService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-18 20:54:35
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Controller
@RequestMapping("gdsGoodsClass")
public class GdsGoodsClassController {
	
	@Autowired
	private GdsGoodsClassService gdsGoodsClassService;
	
	/**
	 * 分页查询
	 * @param record
	 * @return
	 */
	@RequestMapping("findByAll")
	@ResponseBody
	public Map<String, Object> findByAll(GdsGoodsClass record){
		return gdsGoodsClassService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String, Object> save(GdsGoodsClass record) {
		return gdsGoodsClassService.save(record);
	}
	
	/**
	 * 通过gdcId查看详细
	 * @param gdcId
	 * @return
	 */
	@RequestMapping("findByGdcId")
	@ResponseBody
	public Map<String, Object> findByGdcId(Integer gdcId) {
		return gdsGoodsClassService.findByGdcId(gdcId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param gdcId
	 * @return
	 */
	@RequestMapping("/deleteByGdcId")
	@ResponseBody
	public Map<String, Object> deleteByGdcId(Integer gdcId){
		return gdsGoodsClassService.deleteByGdcId(gdcId);
	}

}

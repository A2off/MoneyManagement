package cn.azoff.money.goods.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.azoff.money.goods.model.GdsGoodsPriceRecord;
import cn.azoff.money.goods.service.GdsGoodsPriceRecordService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-29 15:50:56
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@RestController
@RequestMapping("gdsGoodsPriceRecord")
public class GdsGoodsPriceRecordController {
	
	@Autowired
	private GdsGoodsPriceRecordService gdsGoodsPriceRecordService;
	
	/**
	 * 分页查询
	 * @param record
	 * @return
	 */
	@RequestMapping("findByAll")
	public Map<String, Object> findByAll(GdsGoodsPriceRecord record){
		return gdsGoodsPriceRecordService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	public Map<String, Object> save(GdsGoodsPriceRecord record) {
		return gdsGoodsPriceRecordService.save(record);
	}
	
	/**
	 * 通过gprId查看详细
	 * @param gprId
	 * @return
	 */
	@RequestMapping("findByGprId")
	public Map<String, Object> findByGprId(Integer gprId) {
		return gdsGoodsPriceRecordService.findByGprId(gprId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param gprId
	 * @return
	 */
	@RequestMapping("/deleteByGprId")
	public Map<String, Object> deleteByGprId(Integer gprId){
		return gdsGoodsPriceRecordService.deleteByGprId(gprId);
	}

}

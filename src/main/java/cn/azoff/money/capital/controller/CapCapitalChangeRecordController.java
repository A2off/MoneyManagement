package cn.azoff.money.capital.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.azoff.money.capital.model.CapCapitalChangeRecord;
import cn.azoff.money.capital.service.CapCapitalChangeRecordService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Controller
@RequestMapping("capCapitalChangeRecord")
public class CapCapitalChangeRecordController {
	
	@Autowired
	private CapCapitalChangeRecordService capCapitalChangeRecordService;
	
	/**
	 * 分页查询
	 * @param record
	 * @return
	 */
	@RequestMapping("findByAll")
	@ResponseBody
	public Map<String, Object> findByAll(CapCapitalChangeRecord record){
		return capCapitalChangeRecordService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String, Object> save(CapCapitalChangeRecord record) {
		return capCapitalChangeRecordService.save(record);
	}
	
	/**
	 * 通过ccrId查看详细
	 * @param ccrId
	 * @return
	 */
	@RequestMapping("findByCcrId")
	@ResponseBody
	public Map<String, Object> findByCcrId(Integer ccrId) {
		return capCapitalChangeRecordService.findByCcrId(CcrId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param ccrId
	 * @return
	 */
	@RequestMapping("/deleteByCcrId")
	@ResponseBody
	public Map<String, Object> deleteByCcrId(Integer ccrId){
		return capCapitalChangeRecordService.deleteByCcrId(CcrId);
	}

}

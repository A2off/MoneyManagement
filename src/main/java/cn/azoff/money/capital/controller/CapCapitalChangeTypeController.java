package cn.azoff.money.capital.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.azoff.money.capital.model.CapCapitalChangeType;
import cn.azoff.money.capital.service.CapCapitalChangeTypeService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-29 15:51:02
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@RestController
@RequestMapping("capCapitalChangeType")
public class CapCapitalChangeTypeController {
	
	@Autowired
	private CapCapitalChangeTypeService capCapitalChangeTypeService;
	
	/**
	 * 分页查询
	 * @param record
	 * @return
	 */
	@RequestMapping("findByAll")
	public Map<String, Object> findByAll(CapCapitalChangeType record){
		return capCapitalChangeTypeService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	public Map<String, Object> save(CapCapitalChangeType record) {
		return capCapitalChangeTypeService.save(record);
	}
	
	/**
	 * 通过cctId查看详细
	 * @param cctId
	 * @return
	 */
	@RequestMapping("findByCctId")
	public Map<String, Object> findByCctId(Integer cctId) {
		return capCapitalChangeTypeService.findByCctId(cctId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param cctId
	 * @return
	 */
	@RequestMapping("/deleteByCctId")
	public Map<String, Object> deleteByCctId(Integer cctId){
		return capCapitalChangeTypeService.deleteByCctId(cctId);
	}

}

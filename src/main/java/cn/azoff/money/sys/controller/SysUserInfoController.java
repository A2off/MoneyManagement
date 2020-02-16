package cn.azoff.money.sys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.azoff.money.sys.model.SysUserInfo;
import cn.azoff.money.sys.service.SysUserInfoService;

/**
 * 
 * 控制器
 * 
 * @version 2020-02-16 18:14:25
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@Controller
@RequestMapping("sysUserInfo")
public class SysUserInfoController {
	
	@Autowired
	private SysUserInfoService sysUserInfoService;
	
	/**
	 * 分页查询
	 * @param record
	 * @return
	 */
	@RequestMapping("findByAll")
	@ResponseBody
	public Map<String, Object> findByAll(SysUserInfo record){
		return sysUserInfoService.findByAll(record);
	}
	
	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String, Object> save(SysUserInfo record) {
		return sysUserInfoService.save(record);
	}
	
	/**
	 * 通过suiId查看详细
	 * @param suiId
	 * @return
	 */
	@RequestMapping("findBySuiId")
	@ResponseBody
	public Map<String, Object> findBySuiId(Integer suiId) {
		return sysUserInfoService.findBySuiId(SuiId);
	}
	
	/**
	 * 通过id删除对应数据
	 * @param suiId
	 * @return
	 */
	@RequestMapping("/deleteBySuiId")
	@ResponseBody
	public Map<String, Object> deleteBySuiId(Integer suiId){
		return sysUserInfoService.deleteBySuiId(SuiId);
	}

}

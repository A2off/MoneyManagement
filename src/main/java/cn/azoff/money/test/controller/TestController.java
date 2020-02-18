package cn.azoff.money.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.azoff.common.base.BaseController;
import cn.azoff.common.base.BaseParam;

/**
 * 
 * 
 * 
 * @Time 2019年12月18日 下午4:36:31 
 * @author huangzhuozhen
 */
@RestController
@RequestMapping(value = "/test")
@EnableAutoConfiguration
public class TestController extends BaseController{

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public Object userCode(HttpSession session, HttpServletRequest request, BaseParam param) throws IOException {
		try {
			log.info("----->>测试接口<<-----");
			printIp(request);
			log.info("参数：" + param.toString());
			if (StringUtils.isEmpty(param.getLanguage())) {
				return toError();
			}
			return toSuccess();
		} catch (Exception e) {
			e.printStackTrace();
			return toError();
		}
	}
}


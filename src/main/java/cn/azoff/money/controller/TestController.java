package cn.azoff.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Controller
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 * @date 2020/2/12 9:37
 */
@Controller("test")
public class TestController {

    @RequestMapping(value="/m1")
    @ResponseBody
    public String runMethod1(){
        return "Hello,Method1";
    }
}
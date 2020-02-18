package cn.azoff.money;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * SpringBoot启动器
 * @version 2020-02-16 18:10:40
 * @author Azoff <a href="http://www.azoff.cn">Azoff</a>
 */
@SpringBootApplication
// @SpringBootApplication声明让spring boot自动给程序进行必要的配置

public class RunMain {
    public static void main(String[] args) {
        SpringApplication.run(RunMain.class,args);
    }
}
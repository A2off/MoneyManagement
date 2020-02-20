package cn.azoff.money;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages={"cn.azoff"})
@MapperScan("cn.azoff.money.*.dao")
//@AutoConfigureMybatis
public class SpringdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringdemoApplication.class, args);
    }
    
}

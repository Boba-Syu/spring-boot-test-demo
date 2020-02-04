package cn.bobasyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot启动类
 *
 * @author Boba
 */
@SpringBootApplication
@MapperScan("cn.bobasyu.mapper")
public class SpringBootTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestDemoApplication.class, args);
    }

}

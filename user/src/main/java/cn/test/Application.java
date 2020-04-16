package cn.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 模板工程，mysql数据库连接 boot 1.5.9
 * 分页
 *
 */
@SpringBootApplication
@MapperScan("cn.test.mapper")
public class Application 
{
    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo.dao")//是mapper接口，而不是映射文件
@SpringBootApplication
public class SpringBootMybatisJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisJspApplication.class, args);
	}

}

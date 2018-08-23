package com.example.sureoa;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.example.sureoa.dao.mapper")
public class SureoaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SureoaWebApplication.class, args);
	}
}

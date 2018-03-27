package com.wjh.demo.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wjh.demo")
@MapperScan("com.wjh.demo.*.dao")
@SpringBootApplication
public class MybootApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MybootApiApplication.class, args);
	}
}

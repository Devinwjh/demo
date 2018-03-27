package com.wjh.demo.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.wjh.demo.*.dao")
@ComponentScan("com.wjh.demo")
public class MybootTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(MybootTestApplication.class, args);
	}
}

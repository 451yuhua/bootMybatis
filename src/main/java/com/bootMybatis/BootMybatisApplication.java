package com.bootMybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.bootMybatis.dao")
public class BootMybatisApplication {

	public static void main(String[] args) {
		//develop分支的东西aaaaa
		SpringApplication.run(BootMybatisApplication.class, args);
	}
}

package com.cnpiec.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cnpiec.demo.dao")
public class OracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OracleApplication.class, args);
	}
}

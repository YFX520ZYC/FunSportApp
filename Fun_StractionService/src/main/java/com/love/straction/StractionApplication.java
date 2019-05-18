package com.love.straction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.love.straction.dao")
public class StractionApplication {

	public static void main(String[] args) {
		SpringApplication.run(StractionApplication.class, args);
	}

}

package com.love.fun_serveruser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //标记这是一个服务提供者
@MapperScan("com.love.fun_serveruser.dao")
public class FunServeruserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunServeruserApplication.class, args);
	}

}

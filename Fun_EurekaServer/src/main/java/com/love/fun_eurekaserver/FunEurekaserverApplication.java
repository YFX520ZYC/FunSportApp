package com.love.fun_eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //注册中心是服务器，其他都是客户端，只是一个服务提供者，一个服务消费者
public class FunEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunEurekaserverApplication.class, args);
	}

}

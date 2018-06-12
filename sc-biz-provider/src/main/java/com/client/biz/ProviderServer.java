package com.client.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
<<<<<<< HEAD

@SpringBootApplication
@EnableEurekaClient
=======
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
>>>>>>> new version
public class ProviderServer {
	public static void main(String[] args) {
		SpringApplication.run(ProviderServer.class, args);
	}
}

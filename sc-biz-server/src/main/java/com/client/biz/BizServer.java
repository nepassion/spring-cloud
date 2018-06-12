package com.client.biz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BizServer {
	public static void main(String[] args) {
		new SpringApplicationBuilder(BizServer.class).web(true).run(args);
	}
}

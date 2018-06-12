package org.sc.generator.coder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author cuiwenbin
 */
@SpringBootApplication
@EnableEurekaClient
public class DBServer {
	public static void main(String[] args) {
		new SpringApplicationBuilder(DBServer.class).web(true).run(args);
	}
}

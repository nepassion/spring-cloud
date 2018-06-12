package com.client.biz.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements HelloClient {

	public String hello(Integer id) {
		return "fallback hello";
	}

	public String sayHi() {
		return "fallback sayHi";
	}

}

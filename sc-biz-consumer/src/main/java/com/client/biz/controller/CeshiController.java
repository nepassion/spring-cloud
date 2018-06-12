package com.client.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.biz.feign.HelloClient;

@RestController
public class CeshiController {
	@Autowired
	HelloClient hc;

	@GetMapping("/hello")
	public String hello() {
		String m = hc.hello(777);
		return m;
	}

	@GetMapping("/say")
	public String sayHi() {
		return hc.sayHi();
	}
}

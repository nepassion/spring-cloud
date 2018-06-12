package com.client.biz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "biz-provider", fallback = HelloClientFallback.class)
public interface HelloClient {
	@GetMapping("/hello/{id}")
	public String hello(@PathVariable("id") Integer id);

	@GetMapping("/sayHi")
	public String sayHi();
}

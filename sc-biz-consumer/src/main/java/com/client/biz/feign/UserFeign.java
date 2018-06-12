package com.client.biz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.client.biz.core.Result;
import com.client.biz.feign.fallback.UserFeignFallback;

@FeignClient(name = "biz-provider", fallback = UserFeignFallback.class)
public interface UserFeign {
	@PostMapping("/user/list")
	public Result getAllUser(@RequestParam(name = "page", defaultValue = "0") Integer page,
			@RequestParam(name = "size", defaultValue = "0") Integer size);
}

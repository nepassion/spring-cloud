package com.client.biz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.client.biz.core.Result;
import com.client.biz.feign.fallback.UserFeignFallback;
import com.github.pagehelper.PageInfo;

@FeignClient(name = "db-server", fallback = UserFeignFallback.class)
public interface UserFeign {
	@PostMapping("/user/list")
	public PageInfo getAllUser(@RequestParam(name = "page", defaultValue = "0") Integer page,
			@RequestParam(name = "size", defaultValue = "0") Integer size);

	@PostMapping("/user/getOne")
	public Result getOne();
}

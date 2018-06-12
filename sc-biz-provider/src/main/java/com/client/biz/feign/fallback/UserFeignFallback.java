package com.client.biz.feign.fallback;

import org.springframework.stereotype.Component;

import com.client.biz.core.Result;
import com.client.biz.feign.UserFeign;
import com.github.pagehelper.PageInfo;

@Component
public class UserFeignFallback implements UserFeign {
	@Override
	public PageInfo getAllUser(Integer page, Integer size) {
		Result result = new Result();
		result.setCode(400).setMessage("getAllUserFallback");
		return null;
	}

	@Override
	public Result getOne() {
		Result result = new Result();
		result.setCode(400).setMessage("getOneFallback");
		return null;
	}

}

package com.client.biz.feign.fallback;

import org.springframework.stereotype.Component;

import com.client.biz.core.Result;
import com.client.biz.core.ResultCode;
import com.client.biz.feign.UserFeign;

@Component
public class UserFeignFallback implements UserFeign {

	@Override
	public Result getAllUser(Integer page, Integer size) {
		Result result = new Result();
		result.setCode(ResultCode.FAIL).setMessage("getAllUserFallback");
		return result;
	}

}

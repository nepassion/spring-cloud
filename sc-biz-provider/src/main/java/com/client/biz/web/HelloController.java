package com.client.biz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.client.biz.core.Result;
import com.client.biz.feign.UserFeign;
import com.github.pagehelper.PageInfo;

@RestController
public class HelloController {
	@Autowired
	UserFeign userFeign;

	@PostMapping("/getAllUser")
	public PageInfo hello(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "0") Integer size) {
		// Result result = userFeign.getAllUser(page, size);
		PageInfo p = userFeign.getAllUser(page, size);
		return p;
	}

	@GetMapping("/sayHi")
	public String sayHi() {
		return "Hi yo~";
	}

	@PostMapping("/getOne")
	public Result getOne() {
		Result user = userFeign.getOne();
		return user;
	}
}

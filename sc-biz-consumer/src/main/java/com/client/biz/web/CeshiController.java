package com.client.biz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.client.biz.core.Result;
import com.client.biz.feign.UserFeign;

@RestController
public class CeshiController {
	@Autowired
	UserFeign uf;

	@PostMapping("/getAllUser")
	public Result hello(@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "0") Integer size) {
		Result result = uf.getAllUser(page, size);
		return result;
	}

	@GetMapping("/sayHi")
	public String sayHi() {
		return "Hi yo~";
	}
}

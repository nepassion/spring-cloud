package com.client.biz.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.biz.bean.User;
import com.client.biz.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/get")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}

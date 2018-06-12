package com.client.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.biz.bean.User;
import com.client.biz.core.AbstractService;
import com.client.biz.dao.UserMapper;
import com.client.biz.service.UserService;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> getUsers() {
		return userMapper.selectAll();
	}
}

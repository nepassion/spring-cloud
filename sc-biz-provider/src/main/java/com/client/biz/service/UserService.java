package com.client.biz.service;

import java.util.List;

import com.client.biz.bean.User;
import com.client.biz.core.Service;

public interface UserService extends Service<User> {
	public List<User> getUsers();
}

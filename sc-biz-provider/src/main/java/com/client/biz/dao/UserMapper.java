package com.client.biz.dao;

import com.client.biz.bean.User;
import com.client.biz.core.Mapper;

public interface UserMapper extends Mapper<User> {
	int deleteByPrimaryKey(Integer id);

	@Override
	int insert(User record);

	@Override
	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	@Override
	int updateByPrimaryKeySelective(User record);

	@Override
	int updateByPrimaryKey(User record);
}
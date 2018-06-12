package org.sc.generator.coder.service.impl;

import org.sc.generator.coder.dao.UserMapper;
import org.sc.generator.coder.model.User;
import org.sc.generator.coder.service.UserService;
import org.sc.generator.coder.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by cuiwenbin on 2018/06/11.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}

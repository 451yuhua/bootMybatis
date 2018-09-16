package com.bootMybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootMybatis.dao.UserMapper;
import com.bootMybatis.pojo.User;
import com.bootMybatis.service.UserService;

@Service
public class UserInterfaceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}

package com.bootMybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootMybatis.pojo.User;
import com.bootMybatis.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userInterface;
	
	@RequestMapping("getUser")
	public User getUser(Integer id) {
		return userInterface.findUserById(id);
	}
	
}

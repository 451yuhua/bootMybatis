package com.bootMybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootMybatis.pojo.User;
import com.bootMybatis.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="swaggerDemoController相关的api")
public class UserController {

	@Autowired
	private UserService userInterface;
	
	@RequestMapping("getUser/{id}")
	@ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个用户的信息")
	@ApiImplicitParam(name = "id", value = "用户id",paramType="path", required = true, dataType = "Integer")
	public User getUser(@PathVariable Integer id) {
		return userInterface.findUserById(id);
	}
	
	@ApiOperation(value="test", notes = "test...")
	@GetMapping("/test")
	public String testAPI() {
		return "test";
	}
	
	@GetMapping("/getStr")
	@ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个用户的信息")
	@ApiImplicitParam(name = "str", value = "str",paramType="query", required = true, dataType = "String")
	public String getStr(String str) {
		return str;
	}
	
}

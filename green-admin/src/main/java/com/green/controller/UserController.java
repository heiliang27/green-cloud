package com.green.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.vo.BaseResponse;
import com.green.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getUserServiceInfo")
	public BaseResponse<List> getUserServiceInfo(){
		List list = userService.getUserList();
		return new BaseResponse<>(list);
	}

}

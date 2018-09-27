package com.green.controller;

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
	public BaseResponse<String> getUserServiceInfo(){
		return new BaseResponse<>(userService.toString());
	}

}

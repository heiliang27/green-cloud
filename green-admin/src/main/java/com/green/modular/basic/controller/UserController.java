package com.green.modular.basic.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.controller.BaseController;
import com.green.base.vo.BaseResponse;
import com.green.modular.basic.entity.User;
import com.green.modular.basic.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author limingliang
 * @since 2018-11-01
 */
@RestController
@RequestMapping("/basic/user")
public class UserController extends BaseController {
	
	@Resource
	IUserService iUserService;
	
	@Value("${server.port}")
	public String port;

	@RequestMapping("/list")
	public BaseResponse<List<User>> getUsers(){
		List<User> user = iUserService.list(null);
		logger.info(port);
		return new BaseResponse<>(user);
	}
}

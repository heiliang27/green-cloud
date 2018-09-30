package com.green.modular.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.controller.BaseController;
import com.green.base.vo.BaseResponse;
import com.green.modular.entity.User;
import com.green.modular.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author limingliang
 * @since 2018-09-30
 */
@RestController
@RequestMapping("/modular/user")
public class UserController extends BaseController {

	@Autowired
	private IUserService iUserService;
	
	@RequestMapping("/list")
	public BaseResponse<List> getUserList(){
		List<User> list = iUserService.list(null); 
		return new BaseResponse<List>(list);
	}
}

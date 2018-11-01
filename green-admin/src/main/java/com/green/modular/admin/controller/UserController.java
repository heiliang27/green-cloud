package com.green.modular.admin.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.controller.BaseController;
import com.green.base.vo.BaseResponse;
import com.green.modular.admin.entity.User;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author limingliang
 * @since 2018-11-01
 */
@RestController
@RequestMapping("/admin/user")
public class UserController extends BaseController {
	
	@Value("server.port")
	String port;
	
	@RequestMapping("/list")
	public BaseResponse<User> getUserList(String name){
		User user = new User();
		user.setAccount("mmmm");
		user.setName("limingli9ang");
		user.setEmail(port);
		return new BaseResponse<User>(user);
	}

}

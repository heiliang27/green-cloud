package com.green.modular.controller;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.controller.BaseController;
import com.green.base.vo.BaseResponse;
import com.green.modular.entity.User;
import com.green.modular.service.IUserService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

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
	@Autowired
	private JedisPool jedisPool;
	
	@RequestMapping("/list")
	public BaseResponse<List> getUserList(){
		Jedis jedis = jedisPool.getResource();
		jedis.setex("lml",2000, "jedis"+new Random().nextInt(1000));		
		List<User> list = iUserService.list(null); 
		jedis.setex("use", 2000, list.toString());
		System.out.println("---------redis----"+jedis.get("lml"));
		System.out.println(jedis.get("use"));
		return new BaseResponse<List>(list);
	}
}

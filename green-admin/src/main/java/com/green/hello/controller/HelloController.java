package com.green.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.controller.BaseController;

@RestController
public class HelloController extends BaseController{

	@Value("${server.port}")
	String port ;
	// 注意文件命名 yml和proper... 及访问资源的配置文件
	@Value("${spring.application.name}")
	String admin;
	
	
	@RequestMapping(value = "/hello" , method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name){
		logger.info("hello word : "+port+" -- name : "+name +" admin:"+admin);
		return "hello word : "+port+" -- name : "+name +" admin:"+admin;
	}
}

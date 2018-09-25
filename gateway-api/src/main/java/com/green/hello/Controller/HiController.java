package com.green.hello.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.green.hello.service.HiGateway;

@RestController
public class HiController {

	@Autowired
	HiGateway hiGateway;
	
	@RequestMapping("/gateway")
	public String getwate(@RequestParam(value = "name", defaultValue = "gateway") String name){
		return hiGateway.sayHiFromClientOne(name);
	}
}

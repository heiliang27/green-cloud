package com.green.hello.service.impl;

import org.springframework.stereotype.Component;

import com.green.hello.service.HiGateway;

@Component
public class HiGatewayImpl implements HiGateway{

	@Override
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "sorry :"+name;
	}

}

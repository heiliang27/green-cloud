package com.green.hello.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.hello.service.impl.HiGatewayImpl;

@FeignClient(value = "green-admin",fallback = HiGatewayImpl.class)
public interface HiGateway {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

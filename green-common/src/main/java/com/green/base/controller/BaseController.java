package com.green.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
	@Autowired
	private HttpServletRequest request;
	
	protected org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	
}

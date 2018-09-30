package com.green.modular.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.base.controller.BaseController;
import com.green.base.vo.BaseResponse;
import com.green.modular.entity.Dept;
import com.green.modular.service.IDeptService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author limingliang
 * @since 2018-09-30
 */
@RestController
@RequestMapping("/modular/dept")
public class DeptController extends BaseController {
	@Autowired
	private IDeptService iDeptService;
	
	@RequestMapping("/list")
	public BaseResponse<List<Dept>> getUserList(){
		List<Dept> list = iDeptService.list(null);
		return new BaseResponse<>(list);
	}
}

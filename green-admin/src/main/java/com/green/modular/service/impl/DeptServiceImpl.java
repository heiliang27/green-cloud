package com.green.modular.service.impl;

import com.green.modular.entity.Dept;
import com.green.modular.mapper.DeptMapper;
import com.green.modular.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author limingliang
 * @since 2018-09-30
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}

package com.green.modular.admin.service.impl;

import com.green.modular.admin.entity.User;
import com.green.modular.admin.mapper.UserMapper;
import com.green.modular.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author limingliang
 * @since 2018-11-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

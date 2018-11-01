package com.green.modular.basic.service.impl;

import com.green.modular.basic.entity.User;
import com.green.modular.basic.mapper.UserMapper;
import com.green.modular.basic.service.IUserService;
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

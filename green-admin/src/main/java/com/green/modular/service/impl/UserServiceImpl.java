package com.green.modular.service.impl;

import com.green.modular.entity.User;
import com.green.modular.mapper.UserMapper;
import com.green.modular.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

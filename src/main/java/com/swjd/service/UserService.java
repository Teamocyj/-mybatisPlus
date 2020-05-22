package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.User;
import com.swjd.mapper.UserMapper;


public interface UserService extends IService<User> {
    public abstract User login(User user);
}

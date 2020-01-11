package com.xr.logistics.service.impl;

import com.xr.logistics.dao.UserMapper;
import com.xr.logistics.model.SyEmp;
import com.xr.logistics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public SyEmp query(String account) {
        return userMapper.query(account);
    }
}

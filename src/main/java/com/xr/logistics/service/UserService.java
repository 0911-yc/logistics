package com.xr.logistics.service;

import com.xr.logistics.model.SyEmp;

public interface UserService {
    //根据账号密码查询该账号
    SyEmp query(String account);
}

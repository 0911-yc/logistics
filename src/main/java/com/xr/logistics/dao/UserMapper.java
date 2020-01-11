package com.xr.logistics.dao;

import com.xr.logistics.model.SyEmp;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    //根据账号密码查询该用户
   public SyEmp query(String account);
}

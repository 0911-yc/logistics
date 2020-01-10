package com.xr.logistics.service;

import com.xr.logistics.model.PacPackaging;

import java.util.List;

public interface PacPackagingService {

    //查询所有包装材料表的信息
    List<PacPackaging> findPacPackagings();
}

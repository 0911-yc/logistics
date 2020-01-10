package com.xr.logistics.service.impl;

import com.xr.logistics.dao.PacPackagingMapper;
import com.xr.logistics.model.PacPackaging;
import com.xr.logistics.service.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacPackagingServiceImpl implements PacPackagingService {

    @Autowired
    private PacPackagingMapper pacPackagingMapper;

    @Override
    public List<PacPackaging> findPacPackagings() {
        return pacPackagingMapper.findPacPackagings();
    }
}

package com.xr.logistics.service.impl;

import com.xr.logistics.dao.SorStorageMapper;
import com.xr.logistics.model.SorStorage;
import com.xr.logistics.service.SorStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SorStorageServiceImpl implements SorStorageService {
    @Autowired
    private SorStorageMapper sorStorageMapper;

    @Override
    public List<SorStorage> select() {
        return sorStorageMapper.select();
    }

    @Override
    public List<Map<String, Object>> findwhere(SorStorage sorStorage) {
        return null;
    }

}

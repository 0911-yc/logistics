package com.xr.logistics.service;

import com.xr.logistics.model.SorStorage;

import java.util.List;
import java.util.Map;

public interface SorStorageService {
    public List<SorStorage> select();

    public List<Map<String,Object>> findwhere(SorStorage sorStorage);
}

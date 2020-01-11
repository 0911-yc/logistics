package com.xr.logistics.dao;

import com.xr.logistics.model.SorStorage;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SorStorageMapper {
    public List<SorStorage> select();

    public List<Map<String,Object>> findwhere(SorStorage sorStorage);
}

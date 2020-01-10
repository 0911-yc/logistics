package com.xr.logistics.dao;

import com.xr.logistics.model.PacPackaging;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacPackagingMapper {

    //查询所有包装材料表的信息
    @Select("select ID,ItemCode,ItemName,PlannedPrice,Specifications,type,MeasurementUnit,Status from PAC_Packaging")
    List<PacPackaging> findPacPackagings();



}


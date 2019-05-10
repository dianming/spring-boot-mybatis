package com.mapper;

import java.util.List;

import com.model.DistrictEntity;
import com.model.DistrictEntityExample;
import org.apache.ibatis.annotations.Param;

public interface DistrictEntityMapper {
    long countByExample(DistrictEntityExample example);

    int deleteByExample(DistrictEntityExample example);

    int insert(DistrictEntity record);

    int insertSelective(DistrictEntity record);

    List<DistrictEntity> selectByExample(DistrictEntityExample example);

    int updateByExampleSelective(@Param("record") DistrictEntity record, @Param("example") DistrictEntityExample example);

    int updateByExample(@Param("record") DistrictEntity record, @Param("example") DistrictEntityExample example);
}
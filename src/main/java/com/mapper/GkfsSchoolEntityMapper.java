package com.mapper;

import java.util.List;

import com.model.GkfsSchoolEntity;
import com.model.GkfsSchoolEntityExample;
import org.apache.ibatis.annotations.Param;

public interface GkfsSchoolEntityMapper {
    long countByExample(GkfsSchoolEntityExample example);

    int deleteByExample(GkfsSchoolEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GkfsSchoolEntity record);

    int insertSelective(GkfsSchoolEntity record);

    List<GkfsSchoolEntity> selectByExample(GkfsSchoolEntityExample example);

    GkfsSchoolEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GkfsSchoolEntity record, @Param("example") GkfsSchoolEntityExample example);

    int updateByExample(@Param("record") GkfsSchoolEntity record, @Param("example") GkfsSchoolEntityExample example);

    int updateByPrimaryKeySelective(GkfsSchoolEntity record);

    int updateByPrimaryKey(GkfsSchoolEntity record);
}
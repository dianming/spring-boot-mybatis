package com.mapper;

import java.util.List;

import com.model.SchoolEntity;
import com.model.SchoolEntityExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchoolEntityMapper {
    long countByExample(SchoolEntityExample example);

    int deleteByExample(SchoolEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SchoolEntity record);

    int insertSelective(SchoolEntity record);

    List<SchoolEntity> selectByExample(SchoolEntityExample example);

    List<SchoolEntity> findBy(SchoolEntity e);

    SchoolEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SchoolEntity record, @Param("example") SchoolEntityExample example);

    int updateByExample(@Param("record") SchoolEntity record, @Param("example") SchoolEntityExample example);

    int updateByPrimaryKeySelective(SchoolEntity record);

    int updateByPrimaryKey(SchoolEntity record);
}
package com.mapper;

import java.util.List;

import com.model.GkfsAreaEntity;
import com.model.GkfsAreaEntityExample;
import org.apache.ibatis.annotations.Param;

public interface GkfsAreaEntityMapper {
    long countByExample(GkfsAreaEntityExample example);

    int deleteByExample(GkfsAreaEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GkfsAreaEntity record);

    int insertSelective(GkfsAreaEntity record);

    List<GkfsAreaEntity> selectByExample(GkfsAreaEntityExample example);

    GkfsAreaEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GkfsAreaEntity record, @Param("example") GkfsAreaEntityExample example);

    int updateByExample(@Param("record") GkfsAreaEntity record, @Param("example") GkfsAreaEntityExample example);

    int updateByPrimaryKeySelective(GkfsAreaEntity record);

    int updateByPrimaryKey(GkfsAreaEntity record);
}
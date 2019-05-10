package com.mapper;

import java.util.List;

import com.model.GkfsDictEntity;
import com.model.GkfsDictEntityExample;
import org.apache.ibatis.annotations.Param;

public interface GkfsDictEntityMapper {
    long countByExample(GkfsDictEntityExample example);

    int deleteByExample(GkfsDictEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(GkfsDictEntity record);

    int insertSelective(GkfsDictEntity record);

    List<GkfsDictEntity> selectByExample(GkfsDictEntityExample example);

    GkfsDictEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GkfsDictEntity record, @Param("example") GkfsDictEntityExample example);

    int updateByExample(@Param("record") GkfsDictEntity record, @Param("example") GkfsDictEntityExample example);

    int updateByPrimaryKeySelective(GkfsDictEntity record);

    int updateByPrimaryKey(GkfsDictEntity record);
}
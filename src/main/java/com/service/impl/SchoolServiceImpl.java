package com.service.impl;

import com.mapper.SchoolEntityMapper;
import com.model.SchoolEntity;
import com.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 2019/5/10.
 */
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolEntityMapper schoolEntityMapper;

    @Override
    public List getSchoolList(SchoolEntity s) {
        return schoolEntityMapper.selectByExample(null);
    }
}

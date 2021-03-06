package com.service.impl;

import com.mapper.GkfsSchoolEntityMapper;
import com.mapper.SchoolEntityMapper;
import com.model.GkfsSchoolEntity;
import com.model.SchoolEntity;
import com.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/5/10.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolEntityMapper schoolEntityMapper;

    @Autowired
    GkfsSchoolEntityMapper gkfsSchoolEntityMapper;

    @Override
    public List<SchoolEntity> getSchoolList(SchoolEntity s) {
        return schoolEntityMapper.findBy(s);
    }

    @Override
    public List<GkfsSchoolEntity> getGkfsSchoolList(GkfsSchoolEntity gs) {
        return gkfsSchoolEntityMapper.findBy(gs);
    }
}

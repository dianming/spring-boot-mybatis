package com.service;

import com.mapper.SchoolEntityMapper;
import com.model.GkfsSchoolEntity;
import com.model.SchoolEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/5/10.
 */
public interface SchoolService {

    public List<SchoolEntity> getSchoolList(SchoolEntity s);

    public List<GkfsSchoolEntity> getGkfsSchoolList(GkfsSchoolEntity gs);

}

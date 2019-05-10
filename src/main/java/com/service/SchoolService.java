package com.service;

import com.mapper.SchoolEntityMapper;
import com.model.SchoolEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/5/10.
 */
public interface SchoolService {

    public List getSchoolList(SchoolEntity s);

}

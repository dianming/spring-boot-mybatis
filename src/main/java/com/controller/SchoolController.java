package com.controller;

import com.model.SchoolEntity;
import com.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/5/10.
 */
@RequestMapping("/school")
@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @GetMapping("/getList/{type}")
    public Object getList(SchoolEntity se){
        schoolService.getSchoolList(se);
        return null;
    }
}

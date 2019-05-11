package com.controller;

import com.common.Result;
import com.model.SchoolEntity;
import com.service.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2019/5/10.
 */
@RequestMapping("/school")
@RestController
public class SchoolController {

    private static Logger log = LoggerFactory.getLogger(SchoolController.class);

    @Autowired
    SchoolService schoolService;

    @GetMapping("/getList/{type}")
    public Object getList(SchoolEntity se) {
        Result result = new Result();
        try {
            List list = schoolService.getSchoolList(se);
            result.setData(list);
        } catch (Exception e) {
            log.error("getList {}", e);
            result.setCode("s00001");
        }
        return result;
    }
}

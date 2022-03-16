package com.currentbp.controller;

import com.currentbp.dao.ext.MyPinyinExtMapper;
import com.currentbp.module.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baopan
 * @createTime 20220315
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    private static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private MyPinyinExtMapper myPinyinExtMapper;

    /**
     *
     */
    @RequestMapping(value = "/getDetail", method = RequestMethod.GET)
    public Student detail(Long id) {
        Student student = myPinyinExtMapper.queryStudent(id);
        return student;
    }


}

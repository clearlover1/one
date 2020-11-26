/*
 * Copyright (C) 2019 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Chao YANG <yangchao@xwsoft.com.cn>, 09/2020
 */
package com.xwsoft.springbootpartone;

import com.xwsoft.springbootpartone.common.data.School;
import com.xwsoft.springbootpartone.common.data.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

/**
 * 测试类
 */
@SpringBootTest
class SpringbootpartoneApplicationTests {

    @Autowired
    private School school;

    /**
     * 测试 {@link School} 类型的对象是否成功加载
     */
    @Test
    public void contextLoads() {
        Date date = new Date("2019/03/09");

        List<Teacher> teachers = school.getTeachers();
        System.out.println(school.toString());

//        assert school.getSchoolName().equals("pipixiaxiaoxue");
//        assert school.getSchoolmaster().getName().equals("pdd");
//        assert school.getSchoolmaster().getAge() == 49;
//        assert school.getSchoolmaster().getEmail().equals("pdd@163.com");
//        assert school.getCreateDate().equals(date);
//        assert teachers.get(0).getName().equals("xiaoma");
//        assert teachers.get(0).getAge() == 19;
//        assert teachers.get(1).getName().equals("uzi");
//        assert teachers.get(1).getAge() == 20;
//        assert school.getEmail().equals("pipixia@xwsoft.com");
//        assert school.getStudentCount() == 500;
    }

}

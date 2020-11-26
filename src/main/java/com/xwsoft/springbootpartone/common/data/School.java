/*
 * Copyright (C) 2019 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Chao YANG <yangchao@xwsoft.com.cn>, 09/2020
 */
package com.xwsoft.springbootpartone.common.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;

/**
 * 使用 {@link ConfigurationProperties} 注解配置 {@link School} 类型的对象
 */
@Component
@ConfigurationProperties(prefix = "school")
@Validated
public class School {

    private String schoolName;
    private Schoolmaster schoolmaster;
    private Date createDate;
    private List<Teacher> teachers;
    private int studentCount;

    @Email(regexp = "^\\w{6,}@([a-z0-9A-Z]+\\.)+[a-zA-Z]{2,}$")
    private String email;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Schoolmaster getSchoolmaster() {
        return schoolmaster;
    }

    public void setSchoolmaster(Schoolmaster schoolmaster) {
        this.schoolmaster = schoolmaster;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolmaster=" + schoolmaster +
                ", createDate=" + createDate +
                ", teachers=" + teachers +
                ", studentCount=" + studentCount +
                ", email='" + email + '\'' +
                '}';
    }
}

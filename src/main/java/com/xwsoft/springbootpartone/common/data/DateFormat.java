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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 使用 {@link Value} 注解加载成员变量
 */
@Component
public class DateFormat {

    @Value("${date.format}")
    private String dateFormat;

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString() {
        return "DateFormat{" +
                "dateFormat='" + dateFormat + '\'' +
                '}';
    }
}

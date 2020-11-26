/*
 * Copyright (C) 2019 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Chao YANG <yangchao@xwsoft.com.cn>, 09/2020
 */
package com.xwsoft.springbootpartone.service.date;

import com.xwsoft.springbootpartone.exception.SpringbootException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 日期服务的接口
 */
public interface DateService {

    /**
     * 计算间隔天数
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 间隔天数
     */
    int calculationDuration(String startDate, String endDate) throws ParseException, SpringbootException;

}

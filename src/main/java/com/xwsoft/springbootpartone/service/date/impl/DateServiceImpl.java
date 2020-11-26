/*
 * Copyright (C) 2019 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Chao YANG <yangchao@xwsoft.com.cn>, 09/2020
 */
package com.xwsoft.springbootpartone.service.date.impl;

import com.xwsoft.springbootpartone.exception.SpringbootException;
import com.xwsoft.springbootpartone.service.date.DateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期服务的具体实现类
 */
@Service
@Slf4j
public class DateServiceImpl implements DateService {

    @Value("${date.format}")
    private String format;

    private SimpleDateFormat simpleDateFormat;

    @PostConstruct
    public void init(){
        simpleDateFormat = new SimpleDateFormat(format);
    }

    /**
     * 根据传入的开始日期、结束日期以及日期格式进行判断日期是否符合要求，如果符合要求，则计算间隔天数，否则抛出异常
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 间隔天数
     */
    @Override
    public int calculationDuration(String startDate, String endDate) throws ParseException, SpringbootException {

        checkDateFormat(startDate);
        checkDateFormat(endDate);

        Date start = simpleDateFormat.parse(startDate);
        Date end = simpleDateFormat.parse(endDate);
        if (start.after(end)){
            throw new SpringbootException("请检查输入的开始日期和结束日期");
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        long startTimeStamp = calendar.getTimeInMillis();
        calendar.setTime(end);
        long endTimeStamp = calendar.getTimeInMillis();
        long duration = endTimeStamp - startTimeStamp;
        return (int) (duration / (1000 * 3600 * 24));
    }

    /**
     * 检查日期是否符合配置文件中预先设置的格式
     *
     * @param date 日期格式
     */
    private void checkDateFormat(String date) throws ParseException {
        simpleDateFormat.parse(date);
    }
}

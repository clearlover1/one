/*
 * Copyright (C) 2019 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Chao YANG <yangchao@xwsoft.com.cn>, 09/2020
 */
package com.xwsoft.springbootpartone.controller;

import com.xwsoft.springbootpartone.exception.SpringbootException;
import com.xwsoft.springbootpartone.service.date.DateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

/**
 * 定义一个日期的 Controller 类
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/date")
public class DateController extends BaseController{

    @Autowired
    private DateService dateService;

    @Value("${date.format}")
    private String format;

    /**
     * 计算传入的两个日期参数，根据日期计算间隔时间
     *
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 间隔天数
     */
    @GetMapping(value = "/calculation")
    public int duration(@RequestParam("start") String startDate,
                        @RequestParam("end") String endDate) throws SpringbootException, ParseException {
        check(startDate);
        check(endDate);

        return dateService.calculationDuration(startDate, endDate);
    }
}

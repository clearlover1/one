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

import com.xwsoft.springbootpartone.exception.BizException;
import com.xwsoft.springbootpartone.exception.CommonEnum;
import com.xwsoft.springbootpartone.exception.SpringbootException;

/**
 * 定义一个抽象的 Controller 类，包含一些常用的检查方法
 */
public abstract class BaseController {

    /**
     * 检查输入的字符串参数是否存在，如果不存在，则抛出异常
     *
     * @param checkParam 字符串参数
     */
    public void check(String checkParam) throws SpringbootException {
        if (checkParam == null || checkParam.equals("")){
            throw new BizException(CommonEnum.BODY_NOT_MATCH);
        }
    }
}

/*
 * Copyright (C) 2019 XW Soft, LLC - All Rights Reserved
 *
 * This program and the accompanying materials are made by XW Soft, LLC.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Chao YANG <yangchao@xwsoft.com.cn>, 09/2020
 */
package com.xwsoft.springbootpartone.exception;

/**
 * 自定义异常
 */
public class SpringbootException extends Exception{

    public SpringbootException() {
        super();
    }

    public SpringbootException(String message) {
        super(message);
    }
}

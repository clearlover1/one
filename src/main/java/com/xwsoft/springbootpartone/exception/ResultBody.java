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

import lombok.Data;

@Data
public class ResultBody {
    private String code;
    private String message;

    public ResultBody(String code, String message) {
        this.code = code;
        this.message = message;
    }
}

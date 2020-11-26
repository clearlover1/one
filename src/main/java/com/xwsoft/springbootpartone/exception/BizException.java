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

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BizException extends RuntimeException{
    protected String errorCode;
    protected String errorMsg;

    public BizException(BaseErrorInfoInterface errorInfoInterface) {
        this.errorCode = errorInfoInterface.getResultCode();
        this.errorMsg = errorInfoInterface.getResultMsg();
    }
}

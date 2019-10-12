package com.mamba.cig.cigbiz.error;

import com.ne.boot.common.exception.IError;

public enum ServiceError implements IError {
    CIG_SERVICE_ERROR("9999", "内部服务错误"),
    CIG_PHONE_PASSWORD_ERROR("0001", "用户名或密码错误"),
    CIG_NOT_FOUND_ERROR("0002","没有找到对应的香烟"),
    SA_ACTIVE_FAIL("0010", "激活失败");

    String errorCode;
    String errorMessage;
    private static final String ns = "SIMCARD_ACTIVE";

    ServiceError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getNamespace() {
        return ns;
    }

    @Override
    public String getErrorCode() {
        return ns + "_" + errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}

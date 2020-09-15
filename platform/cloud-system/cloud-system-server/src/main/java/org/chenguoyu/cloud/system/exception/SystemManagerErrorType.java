package org.chenguoyu.cloud.system.exception;


import org.chenguoyu.cloud.common.core.exception.ErrorType;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
public enum SystemManagerErrorType implements ErrorType {
    USER_NOT_FOUND(30100, "用户未找到！"),
    ROLE_NOT_FOUND(30200, "角色未找到！");

    /**
     * 错误类型码
     */
    private Integer code;
    /**
     * 错误类型描述信息
     */
    private String message;

    SystemManagerErrorType(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

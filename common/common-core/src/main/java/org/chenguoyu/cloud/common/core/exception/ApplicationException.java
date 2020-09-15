package org.chenguoyu.cloud.common.core.exception;

/**
 *
 * @author 陈国钰 on 2020-7-8.
 * @version 1.0
 */
public class ApplicationException extends RuntimeException{
    /**
     * 异常对应的错误类型
     */
    private final ErrorType errorType;

    /**
     * 默认是系统异常
     */
    public ApplicationException() {
        this.errorType = SystemErrorType.SYSTEM_ERROR;
    }

    public ApplicationException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public ApplicationException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public ApplicationException(ErrorType errorType, String message, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}

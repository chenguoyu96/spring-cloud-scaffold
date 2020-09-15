package org.chenguoyu.cloud.system.exception;


import org.chenguoyu.cloud.common.core.exception.ApplicationException;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
public class UserNotFoundException extends ApplicationException {
    public UserNotFoundException() {
        super(SystemManagerErrorType.USER_NOT_FOUND);
    }

    public UserNotFoundException(String message) {
        super(SystemManagerErrorType.USER_NOT_FOUND, message);
    }
}

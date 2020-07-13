package org.chenguoyu.cloud.system.exception;


import org.chenguoyu.cloud.common.core.exception.ApplicationException;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public class RoleNotFoundException extends ApplicationException {
    public RoleNotFoundException() {
        super(SystemManagerErrorType.ROLE_NOT_FOUND);
    }

    public RoleNotFoundException(String message) {
        super(SystemManagerErrorType.ROLE_NOT_FOUND, message);
    }

}

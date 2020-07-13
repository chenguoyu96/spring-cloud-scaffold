package org.chenguoyu.cloud.common.web.config;

import org.chenguoyu.cloud.common.core.exception.ApplicationException;
import org.chenguoyu.cloud.common.core.exception.SystemErrorType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
@Aspect
public class ParamValidAspect {
    @Pointcut("execution(public * org.chenguoyu.cloud..controller.*.*(..))")
    public void pointCut() {
    }

    @Before(value = "pointCut()")
    public void paramValid(JoinPoint joinPoint) {
        BindingResult bindingResult = null;
        //遍历被通知方法(controller方法)的参数列表
        for (Object arg : joinPoint.getArgs()) {
            //参数校验结果会存放在BindingResult中
            if (arg instanceof BindingResult) {
                bindingResult = (BindingResult) arg;
                String message = validRequestParams(bindingResult);
                if (message.length() > 0) {
                    throw new ApplicationException(SystemErrorType.ARGUMENT_NOT_VALID, message);
                }
                break;
            }
        }
    }

    /**
     * 校验
     */
    private String validRequestParams(BindingResult result) {
        StringBuilder sb = new StringBuilder();
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError objectError : allErrors) {
                sb.append(objectError.getDefaultMessage());
            }
        }
        return sb.toString();
    }
}

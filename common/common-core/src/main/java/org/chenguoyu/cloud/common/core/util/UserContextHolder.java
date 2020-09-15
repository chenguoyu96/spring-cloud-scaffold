package org.chenguoyu.cloud.common.core.util;

/**
 *用户上下文
 * @author 陈国钰 on 2020-7-8.
 * @version 1.0
 */
public class UserContextHolder {
    private static final ThreadLocal<UserContext> USER_CONTEXT = new ThreadLocal<>();


    public static UserContext getCurrentUser(){
        return USER_CONTEXT.get();
    }
}

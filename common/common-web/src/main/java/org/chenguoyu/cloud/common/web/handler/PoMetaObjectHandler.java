package org.chenguoyu.cloud.common.web.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.chenguoyu.cloud.common.core.util.UserContextHolder;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * @author 陈国钰 on 2020-7-8.
 * @version 1.0
 */
public class PoMetaObjectHandler implements MetaObjectHandler {
    /**
     * 获取当前用户，为空返回默认system
     *
     * @return
     */
    private Long getCurrentUserId() {
        return UserContextHolder.getCurrentUser() == null ? 1 : UserContextHolder.getCurrentUser().getId();
    }

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createdUserId", Long.class, getCurrentUserId());
        this.strictInsertFill(metaObject, "createdTime", LocalDateTime.class, LocalDateTime.now());
        this.updateFill(metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updatedUserId", Long.class, getCurrentUserId());
        this.strictUpdateFill(metaObject, "updatedTime", LocalDateTime.class, LocalDateTime.now());
    }
}

package org.chenguoyu.cloud.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.chenguoyu.cloud.system.model.po.User;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public interface UserService extends IService<User> {

    /**
     * 根据用户唯一标识获取用户信息
     * 目前用户标识不用户名或mobile
     *
     * @param uniqueId
     * @return
     */
    User getByUniqueId(String uniqueId);

    boolean add(User user);
}

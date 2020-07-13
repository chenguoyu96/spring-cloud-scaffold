package org.chenguoyu.cloud.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.chenguoyu.cloud.system.model.po.UserRoleRelation;

import java.util.Set;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public interface UserRoleRelationService extends IService<UserRoleRelation> {


    Set<Long> queryByUserId(Long id);

    boolean saveUserRoleRelations(Long userId, Set<Long> roleIds);
}

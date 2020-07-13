package org.chenguoyu.cloud.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.chenguoyu.cloud.system.model.po.Resource;
import org.chenguoyu.cloud.system.model.po.RoleResourceRelation;

import java.util.Set;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public interface RoleResourceRelationService extends IService<RoleResourceRelation> {

    /**
     * 根据用户ID查找关联的资源
     * @param roleIds
     * @return
     */
    Set<Resource> findResourcesByRoleIds(Set<Long> roleIds);

}

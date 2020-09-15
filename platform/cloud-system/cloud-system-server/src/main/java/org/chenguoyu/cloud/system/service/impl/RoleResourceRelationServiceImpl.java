package org.chenguoyu.cloud.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.chenguoyu.cloud.system.mapper.RoleResourceRelationMapper;
import org.chenguoyu.cloud.system.model.po.Resource;
import org.chenguoyu.cloud.system.model.po.RoleResourceRelation;
import org.chenguoyu.cloud.system.service.RoleResourceRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Service
public class RoleResourceRelationServiceImpl extends ServiceImpl<RoleResourceRelationMapper, RoleResourceRelation> implements RoleResourceRelationService {
    @Autowired
    private RoleResourceRelationMapper roleResourceRelationMapper;

    @Override
    public Set<Resource> findResourcesByRoleIds(Set<Long> roleIds) {
        return roleResourceRelationMapper.findResourcesByRoleIds(roleIds);
    }
}

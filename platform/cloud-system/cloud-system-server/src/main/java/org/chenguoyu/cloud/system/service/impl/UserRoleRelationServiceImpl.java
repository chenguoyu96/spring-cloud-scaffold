package org.chenguoyu.cloud.system.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.chenguoyu.cloud.system.mapper.UserRoleRelationMapper;
import org.chenguoyu.cloud.system.model.po.UserRoleRelation;
import org.chenguoyu.cloud.system.service.UserRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Service
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelation> implements UserRoleRelationService {
    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;

    @Override
    public Set<Long> queryByUserId(Long userId) {
        List<UserRoleRelation> userRoleRelationList = userRoleRelationMapper.queryByUserId(userId);
        return userRoleRelationList.stream().map(UserRoleRelation::getRoleId).collect(Collectors.toSet());
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveUserRoleRelations(Long userId, Set<Long> roleIds) {
        if (CollectionUtil.isNotEmpty(roleIds)){
            return false;
        }
        userRoleRelationMapper.removeByUserId(userId);
        List<UserRoleRelation> roleRelationList = roleIds.stream().map(roleId -> new UserRoleRelation(roleId, userId)).collect(Collectors.toList());
        return super.saveBatch(roleRelationList);
    }
}

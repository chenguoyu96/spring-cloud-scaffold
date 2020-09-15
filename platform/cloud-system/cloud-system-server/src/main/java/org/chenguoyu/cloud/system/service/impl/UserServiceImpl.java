package org.chenguoyu.cloud.system.service.impl;


import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.chenguoyu.cloud.system.exception.UserNotFoundException;
import org.chenguoyu.cloud.system.mapper.UserMapper;
import org.chenguoyu.cloud.system.model.po.User;
import org.chenguoyu.cloud.system.service.RoleResourceRelationService;
import org.chenguoyu.cloud.system.service.UserRoleRelationService;
import org.chenguoyu.cloud.system.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleRelationService userRoleRelationService;
    @Autowired
    private RoleResourceRelationService roleResourceRelationService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean add(User user) {
        if (StringUtils.isNotBlank(user.getPassword())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        super.save(user);
        userRoleRelationService.saveUserRoleRelations(user.getId(), user.getRoleIds());
        return false;
    }

    @Override
    public User getByUniqueId(String uniqueId) {
        User user = userMapper.getByMobileOrAccount(uniqueId);
        if (Objects.isNull(user)) {
            throw new UserNotFoundException("user not found with uniqueId:" + uniqueId);
        }
        Set<Long> roleIds = userRoleRelationService.queryByUserId(user.getId());
        user.setRoleIds(roleIds);
        if (CollectionUtils.isNotEmpty(roleIds)) {
            roleResourceRelationService.findResourcesByRoleIds(roleIds);
        }
        return user;
    }
}

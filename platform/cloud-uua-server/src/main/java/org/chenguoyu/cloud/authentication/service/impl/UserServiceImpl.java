package org.chenguoyu.cloud.authentication.service.impl;

import org.chenguoyu.cloud.authentication.service.UserService;
import org.chenguoyu.cloud.common.core.entity.vo.Result;
import org.chenguoyu.cloud.system.feign.UserServiceClient;
import org.chenguoyu.cloud.system.model.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
  * 
  * @author 陈国钰 on 2020-7-8.
  * @version 1.0
  */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserServiceClient userServiceClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Result<User> result = userServiceClient.queryByUniqueId(username);

        if (result.isSuccess()) {
            User user = result.getData();
            return new org.springframework.security.core.userdetails.User(
                    user.getAccount(),
                    user.getPassword(),
                    user.getEnable(),
                    user.getAccountNonExpired(),
                    user.getCredentialsNonExpired(),
                    user.getAccountNonLocked(),
                    this.obtainGrantedAuthorities(user));
        }
        return null;
    }
}

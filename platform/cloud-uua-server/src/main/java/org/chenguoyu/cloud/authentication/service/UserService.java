package org.chenguoyu.cloud.authentication.service;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import org.chenguoyu.cloud.system.model.po.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**
  * 
  * @author 陈国钰 on 2020-7-8.
  * @version 1.0
  */
public interface UserService extends UserDetailsService {
    default Set<GrantedAuthority> obtainGrantedAuthorities(User user) {
        if (CollectionUtils.isNotEmpty(user.getResourceCodes())) {
            return user.getResourceCodes().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toSet());
        }
        return Collections.emptySet();
    }
}

package org.chenguoyu.cloud.system.config;

import org.chenguoyu.cloud.common.web.config.ParamValidAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
@Configuration
public class SystemConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public ParamValidAspect paramValidAspect() {
        return new ParamValidAspect();
    }

}

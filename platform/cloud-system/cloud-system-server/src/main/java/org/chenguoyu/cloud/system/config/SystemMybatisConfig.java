package org.chenguoyu.cloud.system.config;

import org.chenguoyu.cloud.common.web.config.MybatisConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Configuration
public class SystemMybatisConfig extends MybatisConfig {

}

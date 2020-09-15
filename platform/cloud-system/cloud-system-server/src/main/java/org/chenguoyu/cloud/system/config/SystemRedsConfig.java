package org.chenguoyu.cloud.system.config;

import org.chenguoyu.cloud.common.web.redis.RedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 陈国钰 on 2020-7-8.
 * @version 1.0
 */

@Configuration
@EnableCaching
public class SystemRedsConfig extends RedisConfig {
}

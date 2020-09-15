package org.chenguoyu.cloud.gateway.config;

import org.springframework.boot.actuate.autoconfigure.security.reactive.EndpointRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 *
 * @author 陈国钰 on 2020-7-11.
 * @version 1.0
 */
@EnableWebFluxSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange()
                // 允许actuator endpoints不进行认证
                .matchers(EndpointRequest.toAnyEndpoint()).permitAll()
                .pathMatchers("/uua/**").permitAll()
                .anyExchange().authenticated().and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }
}

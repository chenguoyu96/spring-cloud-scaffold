package org.chenguoyu.cloud.system.feign;

import org.chenguoyu.cloud.common.core.entity.vo.Result;
import org.chenguoyu.cloud.system.model.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author 陈国钰 on 2020-7-12.
 * @version 1.0
 */
@FeignClient("system")
public interface UserServiceClient {
    /**
     * 根据用户唯一标识获取用户信息
     * 目前用户标识不用户名或mobile
     *
     * @param uniqueId
     * @return
     */
    @GetMapping("/user/queryByUniqueId")
    Result<User> queryByUniqueId(@RequestParam("uniqueId") String uniqueId);
}

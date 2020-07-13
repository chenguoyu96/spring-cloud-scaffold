package org.chenguoyu.cloud.system.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
  * 
  * @author 陈国钰 on 2020-7-12.
  * @version 1.0
  */
@FeignClient(value = "system")
public interface RoleServiceClient {

}

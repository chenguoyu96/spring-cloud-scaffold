package org.chenguoyu.cloud.system.service.impl;

import org.chenguoyu.cloud.system.model.po.Resource;
import org.springframework.stereotype.Service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.chenguoyu.cloud.system.mapper.ResourceMapper;
import org.chenguoyu.cloud.system.service.ResourceService;
/**
 * 
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService{

}

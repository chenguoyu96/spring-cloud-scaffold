package org.chenguoyu.cloud.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.chenguoyu.cloud.system.model.po.Resource;
import org.chenguoyu.cloud.system.model.po.RoleResourceRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Mapper
public interface RoleResourceRelationMapper extends BaseMapper<RoleResourceRelation> {
    Set<Resource> findResourcesByRoleIds(@Param("roleIds") Set<Long> roleIds);
}
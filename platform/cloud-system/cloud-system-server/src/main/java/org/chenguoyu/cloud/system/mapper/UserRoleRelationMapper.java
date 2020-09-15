package org.chenguoyu.cloud.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.chenguoyu.cloud.system.model.po.UserRoleRelation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Mapper
public interface UserRoleRelationMapper extends BaseMapper<UserRoleRelation> {
    /**
     * 根据用户ID查找关联角色
     * @param userId
     * @return
     */
    @Select("select * from user_role_relation where user_id = #{userId} ")
    List<UserRoleRelation> queryByUserId(@Param("userId") Long userId);

    /**
     * 根据用户ID查找用户角色关系
     * @param userId
     */
    @Delete("delete from user_role_relation where user_id = #{userId} ")
    void removeByUserId(@Param("userId") Long userId);

}
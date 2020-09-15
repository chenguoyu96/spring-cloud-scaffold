package org.chenguoyu.cloud.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.chenguoyu.cloud.system.model.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据手机号或用户名查找用户
     * @param uniqueId
     * @return
     */
    @Select("select * from user where mobile = #{uniqueId} or account = #{uniqueId} ")
    User getByMobileOrAccount(@Param("uniqueId") String uniqueId);
}
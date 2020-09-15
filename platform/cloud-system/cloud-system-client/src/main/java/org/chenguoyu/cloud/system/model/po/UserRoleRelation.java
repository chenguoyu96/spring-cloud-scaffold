package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.chenguoyu.cloud.common.web.entity.po.BasePo;

/**
*
* @author 陈国钰 on 2020-7-9.
* @version 1.0
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName(value = "user_role_relation")
public class UserRoleRelation extends BasePo {
    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;
}
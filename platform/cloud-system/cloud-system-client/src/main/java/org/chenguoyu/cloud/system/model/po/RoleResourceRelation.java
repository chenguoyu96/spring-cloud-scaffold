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
@TableName(value = "role_resource_relation")
public class RoleResourceRelation extends BasePo {
    @TableField(value = "role_id")
    private Long roleId;

    @TableField(value = "resource_id")
    private Long resourceId;

}
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
@TableName(value = "`role`")
public class Role extends BasePo {
    /**
     * 角色名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 角色描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 是否删除： 0-否 1-是
     */
    @TableField(value = "deleted")
    private Integer deleted;
}
package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.*;
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
@TableName(value = "`resource`")
public class Resource extends BasePo {
    /**
     * 资源code
     */
    @TableField(value = "code")
    private String code;

    /**
     * 资源类型 1-按钮 2-接口
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 资源名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 资源URL
     */
    @TableField(value = "url")
    private String url;

    /**
     * 资源方法
     */
    @TableField(value = "method")
    private String method;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 菜单ID 属于哪个菜单
     */
    @TableField(value = "menu_id")
    private Long menuId;

    /**
     * 是否删除： 0-否 1-是
     */
    @TableField(value = "deleted")
    @TableLogic
    private Integer deleted;

}
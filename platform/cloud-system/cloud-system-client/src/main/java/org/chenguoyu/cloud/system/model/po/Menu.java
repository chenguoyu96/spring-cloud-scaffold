package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName(value = "menu")
public class Menu extends BasePo {
    /**
     * 父ID
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 路由路径
     */
    @TableField(value = "router_path")
    private String routerPath;

    /**
     * 图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 是否是叶子节点
     */
    @TableField(value = "leaf")
    private Integer leaf;

    /**
     * 菜单位置
     */
    @TableField(value = "position")
    private Integer position;

    /**
     * 是否删除：0-否 1-是
     */
    @TableField(value = "deleted")
    @TableLogic
    private Integer deleted;
}
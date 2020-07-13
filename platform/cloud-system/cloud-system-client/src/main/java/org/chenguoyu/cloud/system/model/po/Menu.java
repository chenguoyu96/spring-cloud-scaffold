package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import org.chenguoyu.cloud.common.web.entity.po.BasePo;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
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

    /**
     * 获取父ID
     *
     * @return parent_id - 父ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父ID
     *
     * @param parentId 父ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取路由路径
     *
     * @return router_path - 路由路径
     */
    public String getRouterPath() {
        return routerPath;
    }

    /**
     * 设置路由路径
     *
     * @param routerPath 路由路径
     */
    public void setRouterPath(String routerPath) {
        this.routerPath = routerPath;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取是否是叶子节点
     *
     * @return leaf - 是否是叶子节点
     */
    public Integer getLeaf() {
        return leaf;
    }

    /**
     * 设置是否是叶子节点
     *
     * @param leaf 是否是叶子节点
     */
    public void setLeaf(Integer leaf) {
        this.leaf = leaf;
    }

    /**
     * 获取菜单位置
     *
     * @return position - 菜单位置
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置菜单位置
     *
     * @param position 菜单位置
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 获取是否删除：0-否 1-是
     *
     * @return deleted - 是否删除：0-否 1-是
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除：0-否 1-是
     *
     * @param deleted 是否删除：0-否 1-是
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", routerPath=").append(routerPath);
        sb.append(", icon=").append(icon);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", leaf=").append(leaf);
        sb.append(", position=").append(position);
        sb.append(", deleted=").append(deleted);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
                && (this.getRouterPath() == null ? other.getRouterPath() == null : this.getRouterPath().equals(other.getRouterPath()))
                && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getLeaf() == null ? other.getLeaf() == null : this.getLeaf().equals(other.getLeaf()))
                && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
                && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
                && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getRouterPath() == null) ? 0 : getRouterPath().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLeaf() == null) ? 0 : getLeaf().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
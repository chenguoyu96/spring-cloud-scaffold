package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.*;
import org.chenguoyu.cloud.common.web.entity.po.BasePo;

/**
 * 
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
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

    /**
     * 获取资源code
     *
     * @return code - 资源code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置资源code
     *
     * @param code 资源code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取资源类型 1-按钮 2-接口
     *
     * @return type - 资源类型 1-按钮 2-接口
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置资源类型 1-按钮 2-接口
     *
     * @param type 资源类型 1-按钮 2-接口
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资源URL
     *
     * @return url - 资源URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源URL
     *
     * @param url 资源URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取资源方法
     *
     * @return method - 资源方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 设置资源方法
     *
     * @param method 资源方法
     */
    public void setMethod(String method) {
        this.method = method;
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
     * 获取菜单ID 属于哪个菜单
     *
     * @return menu_id - 菜单ID 属于哪个菜单
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单ID 属于哪个菜单
     *
     * @param menuId 菜单ID 属于哪个菜单
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取是否删除： 0-否 1-是
     *
     * @return deleted - 是否删除： 0-否 1-是
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除： 0-否 1-是
     *
     * @param deleted 是否删除： 0-否 1-是
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
        sb.append(", code=").append(code);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", method=").append(method);
        sb.append(", description=").append(description);
        sb.append(", menuId=").append(menuId);
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
        Resource other = (Resource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
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
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
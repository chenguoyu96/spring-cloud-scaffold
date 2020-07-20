package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.chenguoyu.cloud.common.web.entity.po.BasePo;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * 
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName(value = "`user`")
public class User extends BasePo {
    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 手机号
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * QQ号
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 微信号
     */
    @TableField(value = "wechat")
    private String wechat;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 头像
     */
    @TableField(value = "head_image")
    private String headImage;

    /**
     * 是否有效用户
     */
    @TableField(value = "enable")
    private Boolean enable;

    /**
     * 账号是否未过期
     */
    @TableField(value = "account_non_expired")
    private Boolean accountNonExpired;

    /**
     * 密码是否未过期
     */
    @TableField(value = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    /**
     * 是否未锁定
     */
    @TableField(value = "account_non_locked")
    private Boolean accountNonLocked;

    /**
     * 锁定时间
     */
    @TableField(value = "lock_time")
    private LocalDateTime lockTime;

    /**
     * 是否删除：0-否 1-是
     */
    @TableField(value = "deleted")
    private Boolean deleted;

    /**
     * 角色ID
     */
    @TableField(exist = false)
    private Set<Long> roleIds;
    /**
     * 资源code
     */
    @TableField(exist = false)
    private Set<String> resourceCodes;
}
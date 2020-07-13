package org.chenguoyu.cloud.system.model.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.chenguoyu.cloud.common.web.entity.po.BasePo;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * 
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
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

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取QQ号
     *
     * @return qq - QQ号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ号
     *
     * @param qq QQ号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微信号
     *
     * @return wechat - 微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信号
     *
     * @param wechat 微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 获取头像
     *
     * @return head_image - 头像
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 设置头像
     *
     * @param headImage 头像
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    /**
     * 获取是否有效用户
     *
     * @return enable - 是否有效用户
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * 设置是否有效用户
     *
     * @param enable 是否有效用户
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * 获取账号是否未过期
     *
     * @return account_non_expired - 账号是否未过期
     */
    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * 设置账号是否未过期
     *
     * @param accountNonExpired 账号是否未过期
     */
    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    /**
     * 获取密码是否未过期
     *
     * @return credentials_non_expired - 密码是否未过期
     */
    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * 设置密码是否未过期
     *
     * @param credentialsNonExpired 密码是否未过期
     */
    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    /**
     * 获取是否未锁定
     *
     * @return account_non_locked - 是否未锁定
     */
    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * 设置是否未锁定
     *
     * @param accountNonLocked 是否未锁定
     */
    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    /**
     * 获取锁定时间
     *
     * @return lock_time - 锁定时间
     */
    public LocalDateTime getLockTime() {
        return lockTime;
    }

    /**
     * 设置锁定时间
     *
     * @param lockTime 锁定时间
     */
    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * 获取是否删除：0-否 1-是
     *
     * @return deleted - 是否删除：0-否 1-是
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除：0-否 1-是
     *
     * @param deleted 是否删除：0-否 1-是
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", qq=").append(qq);
        sb.append(", wechat=").append(wechat);
        sb.append(", email=").append(email);
        sb.append(", description=").append(description);
        sb.append(", headImage=").append(headImage);
        sb.append(", enable=").append(enable);
        sb.append(", accountNonExpired=").append(accountNonExpired);
        sb.append(", credentialsNonExpired=").append(credentialsNonExpired);
        sb.append(", accountNonLocked=").append(accountNonLocked);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWechat() == null ? other.getWechat() == null : this.getWechat().equals(other.getWechat()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getHeadImage() == null ? other.getHeadImage() == null : this.getHeadImage().equals(other.getHeadImage()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getAccountNonExpired() == null ? other.getAccountNonExpired() == null : this.getAccountNonExpired().equals(other.getAccountNonExpired()))
            && (this.getCredentialsNonExpired() == null ? other.getCredentialsNonExpired() == null : this.getCredentialsNonExpired().equals(other.getCredentialsNonExpired()))
            && (this.getAccountNonLocked() == null ? other.getAccountNonLocked() == null : this.getAccountNonLocked().equals(other.getAccountNonLocked()))
            && (this.getLockTime() == null ? other.getLockTime() == null : this.getLockTime().equals(other.getLockTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWechat() == null) ? 0 : getWechat().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getHeadImage() == null) ? 0 : getHeadImage().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getAccountNonExpired() == null) ? 0 : getAccountNonExpired().hashCode());
        result = prime * result + ((getCredentialsNonExpired() == null) ? 0 : getCredentialsNonExpired().hashCode());
        result = prime * result + ((getAccountNonLocked() == null) ? 0 : getAccountNonLocked().hashCode());
        result = prime * result + ((getLockTime() == null) ? 0 : getLockTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public Set<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Set<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public Set<String> getResourceCodes() {
        return resourceCodes;
    }

    public void setResourceCodes(Set<String> resourceCodes) {
        this.resourceCodes = resourceCodes;
    }
}
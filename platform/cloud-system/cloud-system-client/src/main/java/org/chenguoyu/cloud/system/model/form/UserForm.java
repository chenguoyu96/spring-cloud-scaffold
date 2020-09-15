package org.chenguoyu.cloud.system.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.chenguoyu.cloud.common.web.entity.form.BaseForm;
import org.chenguoyu.cloud.system.model.po.User;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserForm extends BaseForm<User> {
    @ApiModelProperty(value = "用户ID")
    private String id;

    @ApiModelProperty(value = "用户账号")
    @NotBlank(message = "用户账号不能为空")
    @Length(min = 3, max = 20, message = "用户名长度在3到20个字符")
    private String account;

    @ApiModelProperty(value = "用户密码")
    @NotBlank(message = "用户密码不能为空")
    @Length(min = 5, max = 20, message = "密码长度在5到20个字符")
    private String password;

    @ApiModelProperty(value = "用户姓名")
    @NotBlank(message = "用户姓名不能为空")
    private String name;

    @ApiModelProperty(value = "用户手机号")
    @NotBlank(message = "用户手机号不能为空")
    private String mobile;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户QQ")
    private String qq;

    @ApiModelProperty(value = "用户微信")
    private String wechat;

    @ApiModelProperty(value = "用户描述")
    private String description;

    @ApiModelProperty(value = "用户拥有的角色id列表")
    private Set<Long> roleIds;

    @ApiModelProperty(value = "用户状态，true为可用")
    private boolean enable = true;

    @ApiModelProperty(value = "用户账号是否过期，true为未过期")
    private boolean accountNonExpired = true;

    @ApiModelProperty(value = "用户密码是否过期，true为未过期")
    private boolean credentialsNonExpired = true;

    @ApiModelProperty(value = "用户账号是否被锁定，true为未锁定")
    private boolean accountNonLocked = true;

}

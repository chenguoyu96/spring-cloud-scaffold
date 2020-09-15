package org.chenguoyu.cloud.common.web.entity.po;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 *
 * @author 陈国钰 on 2020-7-8.
 * @version 1.0
 */
@Setter
@Getter
public class BasePo extends IdPo {

    public final static String DEFAULT_USERNAME = "root";


    @TableField(value = "create_user_id", fill = FieldFill.INSERT)
    protected Long createUserId;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected LocalDateTime createTime;

    @TableField(value = "update_user_id", fill = FieldFill.INSERT_UPDATE)
    protected Long updateUserId;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    protected LocalDateTime updateTime;

    @TableLogic
    protected boolean deleted;
}

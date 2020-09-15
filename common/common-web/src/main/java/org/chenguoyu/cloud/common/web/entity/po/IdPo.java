package org.chenguoyu.cloud.common.web.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 *
 * @author 陈国钰 on 2020-7-8.
 * @version 1.0
 */
public class IdPo implements Serializable {
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

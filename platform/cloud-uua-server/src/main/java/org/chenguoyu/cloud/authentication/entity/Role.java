package org.chenguoyu.cloud.authentication.entity;

import org.chenguoyu.cloud.common.web.entity.po.BasePo;

/**
  * 
  * @author 陈国钰 on 2020-7-8.
  * @version 1.0
  */
public class Role extends BasePo {
    private String code;
    private String name;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

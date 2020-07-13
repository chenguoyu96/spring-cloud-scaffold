package org.chenguoyu.cloud.common.core.util;

/**
  * 
  * @author 陈国钰 on 2020-7-11.
  * @version 1.0
  */
public class UserContext {
    private Long id;
    private String name;
    private String mobile;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

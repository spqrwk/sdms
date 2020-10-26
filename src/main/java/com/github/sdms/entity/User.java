package com.github.sdms.entity;

import java.io.Serializable;

/**
 * 系统登录用户信息(User)实体类
 *
 * @author makejava
 * @since 2020-10-26 09:41:01
 */
public class User implements Serializable {
    private static final long serialVersionUID = 986859445603971790L;
    /**
     * 登录用户ID
     */
    private Long id;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 账号密码
     */
    private String password;
    /**
     * 账号昵称
     */
    private String username;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
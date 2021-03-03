package com.winsoar.cams.entity;

import java.io.Serializable;

/**
 * 管理员表(User)实体类
 *
 * @author makejava
 * @since 2021-02-28 16:40:41
 */
public class User implements Serializable {
    private static final long serialVersionUID = 810373989955281320L;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户类型: 1:老师，2:学生
     */
    private Integer usertype;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

}

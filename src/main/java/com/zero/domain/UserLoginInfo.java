package com.zero.domain;

import java.util.Date;

/**
 * Created by liyanyong on 2017/12/22.
 */
public class UserLoginInfo {
    public Long id;
    public String userName;
    public Date loginDate;
    public String loginIp;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }
}

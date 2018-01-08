package com.zero.domain;

/**
 * Created by liyanyong on 2017/12/22.
 */
public class UserInfo {
    public Long id;
    public String userName;
    public String passWord;
    public String userType;
    public Integer enabled;
    public String realname;
    public String qq;
    public String email;
    public String tel;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserType() {
        return userType;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public String getRealname() {
        return realname;
    }

    public String getQq() {
        return qq;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public UserInfo() {
        super();
    }

    public UserInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}

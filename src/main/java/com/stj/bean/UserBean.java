package com.stj.bean;

public class UserBean {
    private Integer id;
    private String zh;
    private String pass;
    private String realName;

    public UserBean(Integer id, String zh, String pass, String realName) {
        this.id = id;
        this.zh = zh;
        this.pass = pass;
        this.realName = realName;
    }

    public UserBean() {
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", zh='" + zh + '\'' +
                ", pass='" + pass + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public UserBean(String zh, String pass, String realName) {
        this.zh = zh;
        this.pass = pass;
        this.realName = realName;
    }
}

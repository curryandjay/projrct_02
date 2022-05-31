package com.stj.bean;

import javax.print.DocFlavor;

public class MenuBean {
    private Integer id;
    private Integer typeId;
    private Integer userId;
    private String title;
    private String content;
    private String createTime;

    public MenuBean() {
    }

    public MenuBean(Integer id, Integer typeId, Integer userId, String title, String content, String createTime) {
        this.id = id;
        this.typeId = typeId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "MenuBean{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}

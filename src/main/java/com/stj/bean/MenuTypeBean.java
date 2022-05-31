package com.stj.bean;

public class MenuTypeBean {
    private Integer id;
    private String typeName;

    public MenuTypeBean(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public MenuTypeBean() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "MenuTypeBean{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}

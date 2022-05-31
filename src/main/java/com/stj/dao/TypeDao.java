package com.stj.dao;

import com.stj.bean.MenuTypeBean;
import com.stj.bean.UserBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TypeDao extends BaseDao{
    Connection conn =null;
    PreparedStatement pre=null;
    ResultSet res =null;


    public int queryByTypeName(MenuTypeBean menuTypeBean) {
        conn = getConnect();
        String sql ="select id from type where type_name = ?";
        try {
            pre = getConnect().prepareStatement(sql);
            pre.setString(1,menuTypeBean.getTypeName());
            res = pre.executeQuery();
            while (res.next()){
                int id = res.getInt("id");
                menuTypeBean.setId(id);
                return id;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}

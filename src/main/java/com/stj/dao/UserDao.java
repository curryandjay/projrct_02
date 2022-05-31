package com.stj.dao;

import com.stj.bean.UserBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UserDao extends BaseDao{
    Connection conn =null;
    PreparedStatement pre=null;
    ResultSet res =null;
    //注册user
    public boolean registerUser(UserBean userBean){

        conn = getConnect();
        String sql="insert into user(zh,pass,real_name) values (?,?,?)";
        int i =0;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1,userBean.getZh());
            pre.setString(2,userBean.getPass());
            pre.setString(3,userBean.getRealName());
            i = pre.executeUpdate();
            if (i>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public UserBean loginBy(String zh, String pass) {
         conn = getConnect();
        String sql ="select * from user where zh=? and pass =?";
        try {
            pre = getConnect().prepareStatement(sql);
            pre.setString(1,zh);
            pre.setString(2,pass);
            res = pre.executeQuery();
            while (res.next()){
                UserBean userBean =new UserBean();

                String realName =res.getNString("real_name");
                int id =res.getInt("id");
                userBean.setZh(zh);
                userBean.setPass(pass);
                userBean.setId(id);
                userBean.setRealName(realName);
                System.out.println(userBean.getRealName());
                return userBean;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

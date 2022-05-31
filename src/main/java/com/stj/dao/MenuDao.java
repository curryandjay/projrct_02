package com.stj.dao;

import com.stj.bean.MenuBean;
import com.stj.bean.MenuTypeBean;
import com.stj.bean.UserBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MenuDao extends BaseDao{
    Connection conn =null;
    PreparedStatement pre=null;
    ResultSet res =null;
    //根据用户id查询menu
    public List<MenuBean> queryMenu(Integer userId) {
        List<MenuBean> list =new ArrayList<>();
         conn = getConnect();
        String sql ="select * from menu where user_id =?";
        try {
            pre = getConnect().prepareStatement(sql);
            pre.setInt(1,userId);
            res = pre.executeQuery();
            while (res.next()){
               MenuBean menuBean =new MenuBean();
                int id = res.getInt("id");
                int type_id = res.getInt("type_id");
                String title = res.getString("title");
                String content = res.getString("content");
                String createTime = res.getString("create_time");
                menuBean.setId(id);
                menuBean.setTypeId(type_id);
                menuBean.setUserId(userId);
                menuBean.setTitle(title);
                menuBean.setContent(content);
                menuBean.setCreateTime(createTime);
                list.add(menuBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addMenu(MenuBean menuBean) {
        conn = getConnect();
        String sql="insert into menu(user_id,title,content,create_time,type_id) values (?,?,?,?,?)";
        int i =0;
        try {
            pre = conn.prepareStatement(sql);
            pre.setInt(1,menuBean.getUserId());
            pre.setString(2,menuBean.getTitle());
            pre.setString(3, menuBean.getContent());
            pre.setString(4,menuBean.getCreateTime());
            pre.setInt(5,menuBean.getTypeId());
            i = pre.executeUpdate();
            if (i>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public MenuBean getMenuById(int menuId) {
        conn = getConnect();
        String sql ="select * from menu where id =?";
        try {
            pre = getConnect().prepareStatement(sql);
            pre.setInt(1,menuId);
            res = pre.executeQuery();
            while (res.next()){
                MenuBean menuBean =new MenuBean();
                int id = res.getInt("id");
                int type_id = res.getInt("type_id");
                int userId = res.getInt("user_id");
                String title = res.getString("title");
                String content = res.getString("content");
                String createTime = res.getString("create_time");
                menuBean.setId(id);
                menuBean.setTypeId(type_id);
                menuBean.setUserId(userId);
                menuBean.setTitle(title);
                menuBean.setContent(content);
                menuBean.setCreateTime(createTime);
                return menuBean;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean upMenuById(MenuBean menuBean) {
        conn = getConnect();
        String sql="update menu set title = ?,content = ? where id = ?";
        int i =0;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1,menuBean.getTitle());
            pre.setString(2, menuBean.getContent());
            pre.setInt(3,menuBean.getId());
            i = pre.executeUpdate();
            if (i>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delMenuById(int menuId) {
        conn = getConnect();
        String sql="delete from menu where id = ?";
        int i =0;
        try {
            pre = conn.prepareStatement(sql);
            pre.setInt(1,menuId);
            i = pre.executeUpdate();
            if (i>0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public List<MenuBean> queryMenuByTypeId(MenuTypeBean menuTypeBean) {
        List<MenuBean> list = new ArrayList<>();
        conn = getConnect();
        String sql ="select * from menu where type_id=? ";
        try {
            pre = getConnect().prepareStatement(sql);
            pre.setInt(1,menuTypeBean.getId());
            res = pre.executeQuery();

            while (res.next()){
                MenuBean menuBean =new MenuBean();

                int id = res.getInt("id");
                int type_id = res.getInt("type_id");
                int userId1 = res.getInt("user_id");
                String title = res.getString("title");
                String content = res.getString("content");
                String createTime = res.getString("create_time");
                menuBean.setId(id);
                menuBean.setTypeId(type_id);
                menuBean.setUserId(userId1);
                menuBean.setTitle(title);
                menuBean.setContent(content);
                menuBean.setCreateTime(createTime);
                list.add(menuBean);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

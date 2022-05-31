package com.stj.dao;

import java.sql.*;

public class BaseDao {
    public Connection getConnect(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql:///project02","root","root");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public void close(ResultSet res,PreparedStatement pre,Connection conn){
        if(res!=null){
            try {
                res.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (pre!=null){
            try {
                pre.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }


}

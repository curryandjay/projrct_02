package com.stj.web;

import com.stj.bean.UserBean;
import com.stj.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //从页面当中获取页面的值，将其封装在实体类中
       // req.setCharacterEncoding("utf-8");
        String zh =req.getParameter("zh");
        String pass =req.getParameter("pass");
        String realName =req.getParameter("real_name");
      //  System.out.println(realName);
        UserBean userBean =new UserBean();
        userBean.setZh(zh);
        userBean.setPass(pass);
        userBean.setRealName(realName);

        UserDao userDao =new UserDao();
        boolean b = userDao.registerUser(userBean);
        req.getRequestDispatcher("/page/login.jsp").forward(req,resp);

    }
}

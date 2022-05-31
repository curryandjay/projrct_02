package com.stj.web;

import com.stj.bean.UserBean;
import com.stj.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从页面当中获取页面的值，将其封装在实体类中
        //req.setCharacterEncoding("utf-8");
        String zh =req.getParameter("zh");
        String pass =req.getParameter("pass");


        UserDao userDao =new UserDao();
        UserBean userBean =userDao.loginBy(zh,pass);
        HttpSession session =req.getSession();
        session.setAttribute("loginUser",userBean);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}

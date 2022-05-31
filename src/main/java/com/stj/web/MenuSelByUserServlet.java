package com.stj.web;

import com.stj.bean.MenuBean;
import com.stj.bean.UserBean;
import com.stj.dao.MenuDao;
import com.stj.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/menuselbyuser")
public class MenuSelByUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从页面当中获取页面的值，将其封装在实体类中
        HttpSession session = req.getSession();
        UserBean userBean =(UserBean) session.getAttribute("loginUser");
        Integer userId = userBean.getId();
        //查询该用户下的菜单列表
        MenuDao menuDao = new MenuDao();
        List<MenuBean> menuBean =menuDao.queryMenu(userId);
        req.setAttribute("menus",menuBean);
        req.getRequestDispatcher("/page/menu_my.jsp").forward(req,resp);

    }
}

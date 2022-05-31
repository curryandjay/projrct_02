package com.stj.web;

import com.stj.bean.MenuBean;
import com.stj.dao.MenuDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/menuDetail")
public class MenuDetailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从页面当中获取页面的值，将其封装在实体类中
        //req.setCharacterEncoding("utf-8");
        //从页面中获取menuid
        String id =req.getParameter("id");
        int menuId = Integer.parseInt(id);

        MenuDao menuDao = new MenuDao();
        MenuBean menuBean= menuDao.getMenuById(menuId);
        req.setAttribute("menu",menuBean);
        req.getRequestDispatcher("/page/menu_detail.jsp").forward(req,resp);

    }
}

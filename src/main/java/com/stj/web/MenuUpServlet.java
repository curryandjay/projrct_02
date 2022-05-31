package com.stj.web;

import com.stj.bean.MenuBean;
import com.stj.dao.MenuDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menuup")
public class MenuUpServlet extends HttpServlet {
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
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        MenuBean menuBean = new MenuBean();
        menuBean.setId(menuId);
        menuBean.setTitle(title);
        menuBean.setContent(content);
        //根据menuId从数据库中修该菜单
        MenuDao menuDao = new MenuDao();
        boolean falg =menuDao.upMenuById(menuBean);
        req.getRequestDispatcher("/menuselbyuser").forward(req,resp);

    }
}

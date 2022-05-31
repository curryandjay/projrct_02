package com.stj.web;

import com.stj.bean.MenuBean;
import com.stj.bean.MenuTypeBean;
import com.stj.dao.MenuDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/menu/huaiyangcai")
public class HuaiYangCaiServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从页面当中获取页面的值，将其封装在实体类中
        //req.setCharacterEncoding("utf-8");
        //查询该登录用户的菜单
        //获取登陆用户信息
        //String typeName = req.getParameter("typeName");
        MenuTypeBean menuTypeBean = new MenuTypeBean();
      //  menuTypeBean.setTypeName(typeName);
        menuTypeBean.setId(6);
        System.out.println(menuTypeBean.getId());


        MenuDao menuDao = new MenuDao();
        List<MenuBean> menuBean =menuDao.queryMenuByTypeId(menuTypeBean);
        System.out.println(menuBean);
        req.setAttribute("menuList",menuBean);
        req.getRequestDispatcher("/page/menu_cuisinei.jsp").forward(req,resp);

    }
}

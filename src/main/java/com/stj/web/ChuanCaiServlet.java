package com.stj.web;

import com.stj.bean.MenuBean;
import com.stj.bean.MenuTypeBean;
import com.stj.bean.UserBean;
import com.stj.dao.MenuDao;
import com.stj.dao.TypeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@WebServlet("/menu/chuanCai")
public class ChuanCaiServlet extends HttpServlet {
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
        menuTypeBean.setId(1);
        System.out.println(menuTypeBean.getId());
       /* HttpSession session = req.getSession();
        UserBean userBean =(UserBean) session.getAttribute("loginUser");
        Integer userId = userBean.getId();*/


        MenuDao menuDao = new MenuDao();
        List<MenuBean> menuBean =menuDao.queryMenuByTypeId(menuTypeBean);
        System.out.println(menuBean);
        req.setAttribute("menuList",menuBean);
        req.getRequestDispatcher("/page/menu_cuisinei.jsp").forward(req,resp);

    }
}

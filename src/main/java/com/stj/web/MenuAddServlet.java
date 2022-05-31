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
import java.text.SimpleDateFormat;
import java.util.Date;

//新增菜谱
@WebServlet("/menuadd")
public class MenuAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从页面当中获取页面的值，将其封装在实体类中
        //req.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String typeName = req.getParameter("typeName");
        MenuTypeBean menuTypeBean = new MenuTypeBean();
        menuTypeBean.setTypeName(typeName);
        TypeDao typeDao = new TypeDao();
        int typeId = typeDao.queryByTypeName(menuTypeBean);

        HttpSession session =req.getSession();
        UserBean userBean = (UserBean) session.getAttribute("loginUser");
        Integer userId = userBean.getId();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime= simpleDateFormat.format(new Date());
        MenuBean menuBean = new MenuBean();
        menuBean.setUserId(userId);
        menuBean.setTypeId(typeId);
        menuBean.setTitle(title);
        menuBean.setContent(content);
        menuBean.setCreateTime(nowTime);
        MenuDao menuDao = new MenuDao();
        boolean flag =menuDao.addMenu(menuBean);
        req.getRequestDispatcher("/menuselbyuser").forward(req,resp);

    }
}

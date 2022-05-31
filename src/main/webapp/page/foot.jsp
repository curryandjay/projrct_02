<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<div class="container-layout">
    <div class="border-top padding-top">
        <div class="text-center">
            <ul class="nav nav-inline">
                <li class="active"><a href="#">网站首页</a> </li>
                <li><a href="#">新闻资讯</a> </li>
                <li><a href="#">产品中心</a> </li>
                <li><a href="#">技术反馈</a> </li>
                <li><a href="#">留言反馈</a> </li>
                <li><a href="#">联系方式</a> </li>
            </ul>
        </div>
        <div class="text-center height-big">
            版权所有 © 双体精英人才产业学院</div>
    </div>
</div>

</body>
</html>
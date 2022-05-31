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
    <style>
        body{
            background-color: aliceblue;
        }
        form{
            background-color: white;
            width: 400px;
            margin: 100px auto;
            border: lightgrey solid 1px;
            text-align: center;
            border-radius: 8px;
            box-shadow: 0px 0px 50px lightgrey;
        }
        p{
            font-size: 22px;
            font-weight: bold;
            color: cornflowerblue;
            margin: 20px 0px;
        }
        input{
            width: 75%;
            height: 40px;
            margin: 10px 0px;
            font-size: 18px;
            border-radius: 3px;
        }
        button{
            background-color: cornflowerblue;
            color: white;
            width: 150px;
            height: 40px;
            margin: 10px;
            border: 1px white solid;
            font-size: 18px;
            border-radius: 8px;
        }
    </style>
</head>
<body>

<div class="">
    <form action="<%=basePath %>register" method="post">
        <p>注册</p>
       用户名： <input type="text"  placeholder="用户名" name="zh">
       密&nbsp;&nbsp;码： <input type="password" placeholder="密码" name="pass">
        昵&nbsp;&nbsp;称：<input type="text" placeholder="昵称" name="real_name"/><br/>
        <div>
            <button type="submit">注册</button>
        </div>
    </form>
</div>
</body>
</html>
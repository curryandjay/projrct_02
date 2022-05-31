<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<link rel="stylesheet" href="<%=basePath%>css/pintuer.css" />
<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>js/pintuer.js"></script>

</head>
<body>


	<div class="layout bg-mix bg-inverse hidden-l">
		<div class="container-layout height-big">
			<span class="float-right">
<c:if test="${loginUser!=null}">
			${loginUser.realName},欢迎你！
						<a href="<%=basePath%>menuselbyuser">我的菜谱</a>
					<span class="text-little text-gray">|</span>
					<a href="<%=basePath%>page/menu_add.jsp">新增菜谱</a>
					<span class="text-little text-gray">|</span>
					<a href="<%=basePath%>logout">退出登录</a>
</c:if>
<c:if test="${loginUser==null}">
					<a href="<%=basePath%>page/register.jsp">注册</a>
					<span class="text-little text-gray">|</span>
					<a href="<%=basePath%>page/login.jsp">登录</a>
</c:if>
			</span>双体菜谱
		</div>
	</div>
	<div
		class="container-layout padding-big-top padding-big-bottom bg-green bg-inverse">
		<div class="line">
			<div class="xl12 xs2 xm2 xb1">
				<button class="button icon-navicon float-right bg-white"
					data-target="#header-demo4"></button>
				<%--<img src="images/40-white.png" />--%>
			</div>
			<div class=" xl12 xs10 xm10 xb11 padding-top nav-navicon"
				id="header-demo4">
				<div class="xs8 xm8 xb6">
					<ul class="nav nav-menu nav-inline nav-pills">
						<%--<li><a href="#">川菜</a></li>--%>
							<li><a href="<%=basePath%>menu/chuanCai">川菜</a></li>
							<li><a href="<%=basePath%>menu/yuecai">粤菜</a></li>
							<li><a href="<%=basePath%>menu/lucai">鲁菜</a></li>
							<li><a href="<%=basePath%>menu/dongbeicai">东北菜</a></li>
							<li><a href="<%=basePath%>menu/xiangcai">湘菜</a></li>
							<li><a href="<%=basePath%>menu/huaiyangcai">淮扬菜</a></li>
					</ul>
				</div>

				<div class="hidden-s hidden-m xb2 xb1-move">
					<div class="xl6 xb12 text-red"></div>
					<div class="xl6 xb12 text-small">
						<a href="#" class="win-homepage"></a>  <a href="#"
							class="win-favorite"></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
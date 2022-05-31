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
	#left{
		width:20%;
		height:500px;
		float:left;
		
	}
	#right{
		width:80%;
		height:500px;
		float:left;
		
	}
</style>
</head>
<body>
	<jsp:include page="page/top.jsp"></jsp:include>
	<div class="banner">
		<div class="carousel">
			<div class="item">
				<img src="images/lb.png"/>
			</div>
		</div>
	</div>

	<jsp:include page="page/foot.jsp"></jsp:include>
</body>
</html>
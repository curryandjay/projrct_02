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
	<jsp:include page="top.jsp"></jsp:include>
	<table style="width:80%;margin:auto;margin-top:20px;"  class="border border-main">
		<tr>
			<td align="center">
				<h2>${menu.title }</h2>
			</td>
		</tr>
		<tr>
			<td align="center">
				<%--菜谱类型：${menu.typeName }&nbsp;&nbsp;&nbsp;&nbsp;--%>&nbsp;&nbsp;
				<%--作者：${menu.realName }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--%>
				创建时间：${menu.createTime }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<button class="button icon-thumbs-o-up">点赞</button>
			</td>
		</tr>
		<tr>
			<td >
				${menu.content }
			</td>
		</tr>
		
	</table>
	
	
	
	
</body>
</html>
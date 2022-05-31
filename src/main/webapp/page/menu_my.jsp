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

<table style="width:80%;margin:auto;" class="table table-hover" >
	<tr >
		<th align="center">标题</th>
		<th align="center">创建时间</th>
		<th align="center">操作</th>
	</tr>
	<c:forEach items="${requestScope.menus}" var="menu">
		<tr>
			<td><a href="<%=basePath %>menu/menuDetail?id=${menu.id }">${menu.title }</a></td>
			<td>${menu.createTime }</td>
			<td>
				<div class="button-group">
					<a href="<%=basePath %>menu/menuEdit?id=${menu.id }" type="button" class="button">
						<span class="icon-edit text-blue"></span>修改</a>
					<a class="button" href="<%=basePath %>menu/deleteMenu?id=${menu.id }" onclick="return confirm('确定要删除吗?')" type="button" class="button">
						<span class="icon-trash-o text-red"></span>删除</a>
				</div>

			</td>
		</tr>
	</c:forEach>
</table>

<ul  class="list-unstyle height">

</ul>

</body>
</html>
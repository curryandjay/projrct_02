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
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

	<script src="js/jquery-1.4.4.min.js"></script>
	
	
	<link rel="stylesheet" href="js/kindeditor/themes/default/default.css" />
	<link rel="stylesheet" href="js/kindeditor/plugins/code/prettify.css" />
	<script charset="utf-8" src="js/kindeditor/kindeditor.js"></script>
	<script charset="utf-8" src="js/kindeditor/lang/zh_CN.js"></script>
	<script charset="utf-8" src="js/kindeditor/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="content"]', {
				cssPath : 'js/kindeditor/plugins/code/prettify.css',
				uploadJson : 'js/kindeditor/jsp/upload_json.jsp',
				fileManagerJson : 'js/kindeditor/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<div style="width:800px;margin: auto">
		<form action="<%=basePath %>menuadd" method="post">

			菜名：<input class="input" name="title"/><br/>
			<%--菜系：<input class="input" name="typeName"/><br/>&ndash;%&gt;--%>
			<label>菜系</label>
			<select name="typeName">
				<option value="川菜">川菜</option>
				<option value="粤菜">粤菜</option>
				<option value="鲁菜">鲁菜</option>
				<option value="东北菜">东北菜</option>
				<option value="湘菜">湘菜</option>
				<option value="淮扬菜">淮扬菜</option>
			</select><br/>
			<%--菜系列表--%>
			<%--<div  margin:20px,20px>菜系:
				<c:forEach items="${menuTypeList}" var="menuType" >
					<label><input class="input" name="typeName" value="${menuType.id}">${menuType.typeName}</label>
				</c:forEach>
			</div>--%>
			介绍：<textarea  class="input"  name="content" rows="10" cols="80"></textarea><br/>
			<input type="submit" class="shake-hover button bg-dot button-big button-block" value="新增菜谱" />
		</form>
	</div>
</body>
</html>
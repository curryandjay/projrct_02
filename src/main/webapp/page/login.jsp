<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	System.out.println(path);
    System.out.println(basePath);
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
/*特别说明，验证码样式不包含在拼图pintuer.css文件内，需要自己添加到自己的style.css文件中，若要使用登录模块，需复制.passcode样式。*/
.passcode {
    position: absolute;
    right: 0;
    top: 0;
    height: 32px;
    margin: 1px;
    border-left: solid 1px #ddd;
    text-align: center;
    line-height: 32px;
    border-radius: 0 4px 4px 0;
}
</style>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	
	
	<div align="center" >
	<form  action="<%=basePath %>login" method="post">
		<div class="panel padding" style="width: 450px;text-align: left;">
			<div class="text-center">
				<br>
				<h2><strong>欢迎使用&nbsp;双体菜谱</strong></h2></div>
			<div class="" style="padding:30px;">
				<div class="form-group">
					<div class="field field-icon-right">
						<input type="text" class="input" name="zh" placeholder="登录账号" data-validate="required:请填写账号,length#>=3:账号长度不符合要求" />
						<span class="icon icon-user"></span>
					</div>
				</div>
				<div class="form-group">
					<div class="field field-icon-right">
						<input type="password" class="input" name="pass" placeholder="登录密码" data-validate="required:请填写密码,length#>=3:密码长度不符合要求" />
						<span class="icon icon-key"></span>
					</div>
				</div>
				
				<div class="form-group">
					<div class="field">
						<button class="button button-block bg-main text-big">立即登录</button>
					</div>
				</div>
				<div class="form-group">
					<div class="field text-center">
						<p class="text-muted text-center"> <a class="" href="#login.html"><small>忘记密码了？</small></a> | <a class="" href="<%=basePath %>page/register.jsp">注册新账号</a>
						</p>
					</div>
				</div>
				<div class="text-right text-small text-gray padding-top"><a class="text-gray" target="_blank" href="">双体</a> 版权所有</div>
			</div>
		</div>
	</form>
</div>
	
	
	
</body>
</html>
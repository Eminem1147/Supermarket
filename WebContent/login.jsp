<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>登录界面</title>
</head>
<body>
	<h1>小型超市管理系统</h1>
	<!-- 对于为什么是login.action博客有 -->
	<!-- 加了theme="simple"下面的控件就不会自动换行 -->
	<s:form action="login.action" method="post" theme="simple" >
		用户名： 
		<s:textfield name="name" id="name" /><s:fielderror fieldName="name" /> <br><br>
		密码：&nbsp;
		<s:password name="password" id="password" /><s:fielderror fieldName="password" /> <br><br>
		<s:submit value="登录" align="left" />
		&nbsp;&nbsp;
		<s:reset value="重置" align="left" />
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>添加账户</title>
</head>
<body>
	<h3>添加账户界面</h3>
	<s:form action="AccountAction_insert.action" method="post" theme="simple">
		姓名：
		<s:textfield name="name" id="name" /><s:fielderror fieldName="name" /><br><br>
		密码：
		<s:textfield name="password" id="password" /><s:fielderror fieldName="password" /><br><br>
		真实姓名：
		<s:textfield name="realname" id="realname" /><s:fielderror fieldName="realname" /><br><br>
		电子邮箱：
		<s:textfield name="email" id="email" /><s:fielderror fieldName="email" /><br><br>
		手机号码：
		<s:textfield name="telephone" id="telephone" /><s:fielderror fieldName="telephone" /><br><br>
		<s:submit value="添加" align="left" /><br><br>
	</s:form>
</body>
</html>
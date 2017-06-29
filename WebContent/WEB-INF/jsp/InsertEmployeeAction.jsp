<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>添加员工</title>
</head>
<body>
	<h3>添加员工界面</h3>
	<s:form action="EmployeeAction_insert.action" method="post" theme="simple">
		姓名：
		<s:textfield name="name" id="name" /><s:fielderror fieldName="name" /><br><br>
		电子邮箱：
		<s:textfield name="email" id="email" /><s:fielderror fieldName="email" /><br><br>
		手机号码：
		<s:textfield name="telephone" id="telephone" /><s:fielderror fieldName="telephone" /><br><br>
		入职时间：
		<s:textfield name="employdate" id="employdate" /><s:fielderror fieldName="employdate" /><br><br>
		<s:submit value="添加" align="left" /><br><br>
	</s:form>
</body>
</html>
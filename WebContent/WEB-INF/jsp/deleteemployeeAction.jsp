<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>移除员工</title>
</head>
<body>
	<h3>移除员工界面</h3>
	<s:form action="EmployeeAction_delete.action" method="post" theme="simple">
		您所要移除的员工ID：
		<s:textfield name="delete_id" id="delete_id" /><br><br>
		<s:submit value="删除" align="left" /><br><br>
	</s:form>
</body>
</html>
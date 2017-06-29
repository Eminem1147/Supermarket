<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>主界面</title>
</head>
<body>
	<!-- name获取到前一个Action的参数值 -->
	<h1>小型超市管理系统</h1><br>
	
	<a href="changeurlaccountmanagement.action">账户管理</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="changeurlproductmanagement.action">商品管理</a><br><br>
	<a href="changeurlemployeemanagement.action">员工管理</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="changeurlstockmanagement.action">库存管理</a><br><br>
	<a href="changeurlsellmanagement.action">销售管理</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="changeurlpurchasemanagement.action">进货管理</a><br><br>
</body>
</html>
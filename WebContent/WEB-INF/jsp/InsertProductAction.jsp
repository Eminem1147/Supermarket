<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>添加商品</title>
</head>
<body>
	<h3>添加商品界面</h3>
	<s:form action="ProductAction_insert.action" method="post" theme="simple">
		商品名：
		<s:textfield name="name" id="name" /><s:fielderror fieldName="name" /><br><br>
		进货价：
		<s:textfield name="inprice" id="inprice" /><s:fielderror fieldName="inprice" /><br><br>
		销售价：
		<s:textfield name="saleprice" id="saleprice" /><s:fielderror fieldName="saleprice" /><br><br>
		保质期：
		<s:textfield name="qualityguarantee" id="qualityguarantee" /><s:fielderror fieldName="qualityguarantee" /><br><br>
		<s:submit value="添加" align="left" /><br><br>
	</s:form>
</body>
</html>
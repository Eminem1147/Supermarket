<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>添加库存</title>
</head>
<body>
	<h3>添加库存界面</h3>
	<s:form action="StockAction_insert.action" method="post" theme="simple">
		商品ID：
		<s:textfield name="productid" id="productid" /><s:fielderror fieldName="productid" /><br><br>
		商品名：
		<s:textfield name="productname" id="productname" /><s:fielderror fieldName="productname" /><br><br>
		数量：
		<s:textfield name="number" id="number" /><s:fielderror fieldName="number" /><br><br>
		生产日期：
		<s:textfield name="producedate" id="producedate" /><s:fielderror fieldName="producedate" /><br><br>
		<s:submit value="添加" align="left" /><br><br>
	</s:form>
</body>
</html>
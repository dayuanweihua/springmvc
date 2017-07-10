
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>余额详情</title>
</head>
<body>	
	
	<% Object balance=session.getAttribute("balance");%>
	<h1 style="color:red">余额详情页</h1>
	<h2 style="color:red">用户:${cardNo }</h2>
	<h4 style="color:red">您的余额为：${requestScope.money}</h4>
	<br/>
	<a href="${pageContext.request.contextPath}/backHomepage.do">返回主页</a>
</body>
</html>
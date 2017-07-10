<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
				
		<h1 style="color:red">主页</h1>
		<h2 style="color:red">用户:${sessionScope.cardNo}</h2>
		<h3>请选择您所需的业务:</h3>		
		
	<a href="${pageContext.request.contextPath}/forward/check_balance.do">查询余额</a>
	<a href="${pageContext.request.contextPath}/forward/take_money_action.do">取款</a>	
	<a href="${pageContext.request.contextPath}/forward/save_money_action.do">存款</a>	
	<a href="${pageContext.request.contextPath}/forward/transfer_action.do">转账</a>
	<a href="${pageContext.request.contextPath}/forward/reLogin.do">重新登录</a>

	
</body>
</html>
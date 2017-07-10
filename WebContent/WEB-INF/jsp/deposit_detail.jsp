<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>存款详情</title>
</head>
<body>

	
	<h1 style="color: red">存款详情</h1>
	<h2 style="color: red">
		用户:${sessionScope.cardNo}
		存入金额：${requestScope.depositNumber }
		您当前余额为：</h2>
	<a href="${pageContext.request.contextPath}/backHomepage.do">返回主页</a>
</body>
</html>
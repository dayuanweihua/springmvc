<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<h1>${message}</h1>
	<form action="${pageContext.request.contextPath}/login/check.do"
		method="post">
	卡号：<input type="text" name="username" /><br>
	密码：<input type="text" name="password" /><br>
		<input type="submit" name="submit" value="提交"/>	
		<br>
		${statu}
		</form>


</body>
</html>
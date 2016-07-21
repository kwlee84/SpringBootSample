<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>SIGN IN</h1>
	<form action="/login" method="post">
		<input type="hidden" id="csrf-token" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="hidden" name="name" value="admin"/>
		<p>ID: <input type="text" name="username"/></p>
		<p>PW: <input type="password" name="password"/></p>
		<p><input type="submit" title="LOGIN"/></p>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>
</head>
<body>

	<h1>Login here !!!!!</h1>
	<form action="loginProcess" method="post" name="f1">
		User Name : <input type="text", name="txtUname" /><br/>
		Password : <input type="password" name="txtPwd"/><br/>
		<input type="submit" value="Login Here" />
	</form>
	<h2>${msg}</h2>

</body>
</html>
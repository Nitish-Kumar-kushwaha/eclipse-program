<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<div align="center" style="font-size: 25px">
		<h1>User Login</h1>
			<form action="LoginServlet" method="post">
				Enter name:   <input type="text" name="txtname" /> <br/> <br/>
				Enter Password: <input type="password" name="txtpassword" />
				<br/> <br/>
				<input type="submit" value="Login"  style="width: 100px ; font-size: 20px"/>
				<br/> <br/>
			</form>
				<h3 style="color: red;">${err }</h3>
	</div>

	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This Page 2 using Spring Boot App !!!!!</h1>
	<form action="p2" method="post" name="f1">
		Person Name : <input type="text", name="txtPname" />
		<input type="submit" value="Click Me" />
	</form>
	<h1>${msg} </h1>

</body>
</html>
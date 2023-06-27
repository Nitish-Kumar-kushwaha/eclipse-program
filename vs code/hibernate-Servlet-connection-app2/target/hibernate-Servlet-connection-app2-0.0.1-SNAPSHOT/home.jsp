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
	<form action="insert" method="post">
		Product Name : <input type="text" name="pname" /><br/>
		Product Price : <input type="text" name="price" /><br/>
		<input type="submit" value="insert" />
	</form>
	
	<form action="show" method="post">
		<input type="submit" value="show" />
	</form>

</body>
</html>
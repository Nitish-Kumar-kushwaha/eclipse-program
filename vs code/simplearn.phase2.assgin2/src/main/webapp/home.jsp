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
	<div align="center">
	<h1>Search Product detail</h1>
	
	<form action="show" method="post">
		Enter the product Id : <input type="text" name="id" /><br/> <br/>
		<input type="submit" value="check" />
	</form>
	
	<h3>${msg }</h3>
		
	</div>

</body>
</html>
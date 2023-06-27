<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo jsp </title>
</head>
<body>
	<form action="">
		Enter Name  :<input type="text" name="fname">
		<input type="submit" name="click" value="click me" >
		
	</form>
	<% if(request.getParameter("click") != null){
		out.println("hello " + request.getParameter("fname"));
	} %>

</body>
</html>
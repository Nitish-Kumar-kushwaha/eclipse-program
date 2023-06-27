<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>About nitish</h1>
	<% String usn = (String) request.getAttribute("usn"); %>
	
	<h2>USN <%= usn %> </h2>

</body>
</html>
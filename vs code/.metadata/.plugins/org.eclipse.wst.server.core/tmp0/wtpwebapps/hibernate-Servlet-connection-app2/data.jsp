<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
	
		<h1>Product Info</h1>
		<table border="5" cellspacing="2" style="width: 400px; height: 400px;">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>price</th>
		</tr>
		<c:forEach var="e" items="${product }"  >
			<tr>
				<td><c:out value="${e.id }" /></td>
				<td>${e.name }</td>
				<td>${e.price }</td>
			</tr>
		</c:forEach>
	</table>
	</div>

	

</body>
</html>
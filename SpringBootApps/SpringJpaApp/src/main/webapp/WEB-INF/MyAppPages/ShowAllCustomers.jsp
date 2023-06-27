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

	<h1>All Customers</h1>
	<hr/>
	<table>
		<tr>
			<th> Customer ID</th>
			<th> Person Name</th>
			<th> Phone Nmuber</th>
			<th> Email</th> 
		</tr>
		<c:forEach var = "pb" items="${vall}">
			<tr>
				<td>
					${pb.custId} 
				</td>
				<td>
					${pb.pname} 
				</td>
				<td>
					${pb.phone} 
				</td>
				<td>
					${pb.email} 
				</td>
			</tr>
		</c:forEach>	
	</table>

</body>
</html>
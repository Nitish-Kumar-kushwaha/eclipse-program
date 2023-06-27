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
	<h1>Search Customer Based on ID</h1>
	<form action="fetchinfo" method="post" name="frmSearch" >
		Customer ID: <input type="text" name="txtSearch" placeholder="Customer ID For Search" />
		<input type="submit" value="Search"/>
	</form>
	
	<table>
		<tr>
			<th>Customer ID</th>
			<th>Person Name</th>
			<th>Phone Number</th>
			<th>Email</th> 
		</tr>
		<tr>
			<th>${pb.custId }</th>
			<th>${pb.pname }</th>
			<th>${pb.phone }</th>
			<th>${pb.email }</th> 
		</tr>
		
	</table>
	
	<h2>${msg }</h2>
</body>
</html>
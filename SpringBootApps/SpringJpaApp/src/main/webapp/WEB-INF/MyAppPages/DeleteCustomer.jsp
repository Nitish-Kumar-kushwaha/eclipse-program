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
	<h1>Delete Customer Based on ID</h1>
	<form action="delcust" method="post" name="frmSearch" >
		Customer ID: <input type="text" name="txtSearch" placeholder="Customer ID For Search" />
		<input type="submit" value="Delete"/>
	</form>
	<p> ${msg }</p>

</body>
</html>
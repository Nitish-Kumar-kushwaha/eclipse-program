<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Products</title>
</head>
<body>
	<div align="center">
		<h2>Product detail </h2>
		<h3>product id : ${product.id }</h3>
		<h3>product name :${product.name }</h3>
		<h3>product price : ${product.price }</h3>
	</div>

</body>
</html>
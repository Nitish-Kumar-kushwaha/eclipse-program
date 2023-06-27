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
		<h1>Insert Product Details</h1>
		<h2>${msg }</h2>
		<div style="font-size: 30px; ">
			<form action="insert" method="post">
				Product Name : <input type="text" name="pname" /><br/>
				Product Price : <input type="text" name="price" /><br/>
				<input type="submit" value="insert" style="width: 150px; font-size: 15px" />
			</form>
					<form action="show" method="post">
					<input type="submit" value="show" style="width: 150px; font-size: 15px"  />
			</form>
			
		</div>
	</div>

	
	
	
	
</body>
</html>
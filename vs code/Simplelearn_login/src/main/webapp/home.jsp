<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DashBoard</title>
</head>
<body>

	<div align="center" style="display: flex; flex-direction: column">
			<h1>Welcom to Dashboard ${msg }</h1>
				<form action="LogoutServlet" method="post">
					<input type="submit" value="LOG OUT" style="width: 100px ; font-size: 20px" />
				</form>
	
	</div>


</body>
</html>
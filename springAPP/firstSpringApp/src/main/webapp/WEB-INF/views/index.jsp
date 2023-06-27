<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello nitish</h1>
	<%
		String msg1 = (String)request.getAttribute("msg");
	%>
	<h1> message is  <%=msg1 %></h1>

</body>
</html>
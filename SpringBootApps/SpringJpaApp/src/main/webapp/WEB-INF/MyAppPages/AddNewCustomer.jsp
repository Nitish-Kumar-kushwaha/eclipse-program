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
	<h1  style="text-align: centre; width: 100%" >Add new Customers</h1>
	<form action="addnewcustomer" name="frmReg" method="post">
	<p style="text-align: centre; width: 100%" >
	 	<input type="text" name="txtPname" placeholder="Person name" />
	 	<br/> <br/>
	 	
	 	<input type="text" name="txtPhone" placeholder="Person nnumber" />
	 	<br/> <br/>
	 	
	 	<input type="text" name="txtEmail" placeholder="Person email" />
	 	<br/> <br/>
	 	
	 	<input type="submit" value="Add New Customer" />
	 	<br/> <br/>
	 	
	 	<h2>${msg}</h2>
	</p>
	</form>

</body>
</html>
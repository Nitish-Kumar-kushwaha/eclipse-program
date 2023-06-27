<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- <%@ page isIgnore="false" %> --%>
    <%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  </head>
  <body>
    
    <div class="container mt-5">
    	<h1 class="text-center"> Enter Product Id to serch</h1>
    	
    	<form action="search" method="post">
    		<div class="form-floating mb-3">
			  <input type="text" class="form-control" id="floatingInput" placeholder="Id" name="productId">
			  <label for="floatingInput">Enter Id</label>
			</div>
			<div class="d-flex justify-content-center">
				<button class="btn btn-lg btn-primary mx-2">Search</button>
				<a class="btn btn-lg btn-primary mx-2" href="update">Update</a>
			</div>
    	</form>
    	
    	<div class="text-center">
    		<h1>   ${msg }</h1>
    		
    		<h2>${pmsg.id }</h2>
    		<h2> ${pmsg.name }</h2>
    		<h2>${pmsg.price }</h2>
    	</div>
		
    	
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
	<script type="" src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
	
	  
  </body>
</html>
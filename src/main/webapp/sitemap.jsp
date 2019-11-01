<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<head>
<meta charset="ISO-8859-1">
<title>Sitemap</title>
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-sm-12">
            <h3>Public Site:</h3>
    	    <ul>
    	    	<li><a href="index.jsp"><strong>Login</strong></a></li>
    	    	<li><a href="register.jsp"><strong>Register</strong></a></li>
    	    	<li><a href="passwordReset.jsp"><strong>Password Reset</strong></a></li>
    	    	<li><a href="home.jsp"><strong>Home</strong></a></li>
    	    	<ul><li><a href="viewProfile.jsp">Profile Page</a></li></ul>  
    	    	   
             
    	    </ul>
    	    
    	     <h3>Private Site:</h3>
    	    <ul>
                <li><a href="adminpage.jsp"><strong>Administrator Page</strong></a></li>
                <ul><li><a href="report.jsp">Report Page</a></li></ul>  
                
    	    </ul>    
		</div>
	</div>
</div>

</body>
</html>
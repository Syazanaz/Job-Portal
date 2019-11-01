<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>

<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="css/styles.css">

<style>
html,body{
background-color: #202092;
}
</style>
	
</head>
<body>
 <header>
<%@ include file= "adminHeader.jsp" %>
</header>

     <div class="container">
         <div class="row justify-content-center">
            <div class="col=12 mt-3">
                <div class="jumbotron" style="background-color: rgba(0,0,0,0.5) !important; color: #ffffff;">
                  <h1 class="display-4">Welcome Admin!</h1>
                  <hr class="my-4" style="background-color: #ffffff;">
                  <p>Click on the link below to proceed to Administrator task</p>
                  <p class="lead">
                    <a class="btn btn-primary btn-lg" role="button" href="<s:url action='report'/>">Report</a>
                    <a class="btn btn-primary btn-lg" role="button" href="sendemail.jsp">Bulk Mailer</a>
                    <a class="btn btn-primary btn-lg" role="button" href="JobManager.jsp">Job Manager</a>
                  </p>
            </div>
         </div>
        </div>
    </div>
    
    <footer class="bg-dark">
       <%@ include file= "footer.jsp" %>
    </footer>
</body>
</html>
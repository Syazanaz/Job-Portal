<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Reset</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
 
 <!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="css/styles.css">

<style>
.form-gap {
    padding-top: 70px;
}

html,body{
background-color: #202092;
}
</style>

</head>
<body>

 <div class="form-gap"></div>
<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
            <div style="background-color:rgba(0,0,0,0.5) !important;" class="panel panel-default">
              <div class="panel-body">
                <div class="text-center">
                  <h3><i style="color: white;" class="fa fa-lock fa-4x"></i></h3>
                  <h2 class="text-center" style="color: white;">Forgot Password?</h2>
                  <p style="color: white;">You can reset your password here.</p>
                  <div class="panel-body">
                  
                    <form action="resetpassword" id="register-form" role="form" autocomplete="off" class="form" method="post">
         
                      <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                          <input id="resEmail" name="resEmail" placeholder="email address" class="form-control"  type="email">
                        </div>
                      </div>
                      <div class="form-group">
                        <input style="cursor:pointer; color: black; border:none; background-color: #FFC312;" name="recover-submit" class="btn btn-lg btn-primary btn-block" value="Reset Password" type="submit">
                      </div>
                          
                  <div style="color:red">
                	   <span><s:property value="resetMessage"/></span>
                  </div>
                  
                      <input type="hidden" class="hide" name="token" id="token" value=""> 
                    </form>
    
                  </div>
                </div>
              </div>
            </div>
          </div>
	</div>
</div>

</body>
</html>
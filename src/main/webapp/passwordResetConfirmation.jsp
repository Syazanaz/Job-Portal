<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Registration Successful</title>
<style type="text/css">

.jumbotron {
background-color: #262664;
}
</style>
<title>Password Reset Confirmation</title>
</head>
<body>
<div class="jumbotron text-center">
<h2 style="color:#ffffff;" class="display-3">Password Reset is Successful</h2>

<p class="lead" style="color:#ffffff;">An email has been sent to <span style="color:blue"><s:property value="resEmail"/></span>. Please follow the instructions given to reset your password.</p>

<a style="background-color:#FFC312; color:#000000;" class="btn btn-primary btn-sm" href="index.action" role="button">Return to login</a>
</div>
</body>
</html>
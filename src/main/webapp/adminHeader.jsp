<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<meta charset="ISO-8859-1">
<title>Admin Header</title>

</head>
<body>

<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #FFC312;">
  <a class="navbar-brand" href="adminpage.jsp">Community Portal</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="adminpage.jsp">Home<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <s:a cssClass="nav-link" action="report">Report</s:a>
      </li>
      <li class="nav-item">
        <s:a cssClass="nav-link" href="sendemail.jsp">Bulk Mailer</s:a>
      </li>
      <li class="nav-item">
        <s:a cssClass="nav-link" href="JobManager.jsp">Job Manager</s:a>
      </li>
      <li class="nav-item">
        <s:a cssClass="nav-link" action="logout">Logout</s:a>
      </li>
      
      
      <!-- <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>-->
      
    </ul>
    <form action="searchProfile" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" name="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-dark my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

</body>
</html>
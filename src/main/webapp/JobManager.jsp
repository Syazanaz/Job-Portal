<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<style>

body { padding-top:20px; }
.panel-body .btn:not(.btn-block) { width:120px;margin-bottom:10px; }

</style>

<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	
<title>Job Manager</title>
</head>
<body>

<div style="align-content:center;" class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        <span class="glyphicon glyphicon-bookmark"></span> Admin Job Manager</h3>
                </div>
                <div style="align-content:center;" class="panel-body">
                    <!--<div class="row">
                        <div class="col-xs-6 col-md-6">-->
                          <a href="createJob.jsp" class="btn btn-warning btn-lg" role="button"><span class="glyphicon glyphicon-list-alt"></span> <br/>Create Job</a>
                          <a href="report.action" class="btn btn-warning btn-lg" role="button"><span class="glyphicon glyphicon-user"></span> <br/>Users</a>
                          <a href="jobreport.action" class="btn btn-warning btn-lg" role="button"><span class="glyphicon glyphicon-signal"></span> <br/>Job Report</a>
                          <a href="#" class="btn btn-warning btn-lg" role="button"><span class="glyphicon glyphicon-comment"></span> <br/>Messages</a>
                        <!--</div>
                        <div class="col-xs-6 col-md-6">
                          <a href="#" class="btn btn-warning btn-lg" role="button"><span class="glyphicon glyphicon-bookmark"></span> <br/>Bookmarks</a>
                          <a href="#" class="btn btn-info btn-lg" role="button"><span class="glyphicon glyphicon-file"></span> <br/>Notes</a>
                          <a href="#" class="btn btn-primary btn-lg" role="button"><span class="glyphicon glyphicon-picture"></span> <br/>Photos</a>
                          <a href="#" class="btn btn-primary btn-lg" role="button"><span class="glyphicon glyphicon-tag"></span> <br/>Tags</a>
                        </div>
                    </div>-->
                    <a href="adminpage.jsp" class="btn btn-primary active btn-lg btn-block" role="button"><span class="glyphicon glyphicon-globe"></span> Admin Home</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
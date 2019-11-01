<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
<title>Update Job Posting</title>

<style type="text/css">

html,body{
background-image: url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');
background-size: cover;
background-repeat: no-repeat;
font-family: 'Numans', sans-serif;
}

.note
{
    text-align: center;
    height: 80px;
    background: -webkit-linear-gradient(left, #0072ff, #8811c5);
    color: #fff;
    font-weight: bold;
    line-height: 80px;
}

.form-control{
    margin-bottom: 5%;
    
}
.btnSubmit
{
    border:none;
    border-radius:1.5rem;
    padding: 1%;
    width: 100px;
    cursor: pointer;
    color: black;
	background-color: #FFC312;
	margin-top: 5%;
}
.container
{
	background-color: rgba(0,0,0,0.5) !important;
	padding: 5%;
    border: 1px solid #ced4da;
    margin-bottom: 2%;
    height: auto;
    text-align: left;
}

b
{ 
	color: white;
}

</style>

</head>
<body>

<div class="container register-form">
     <div class="form">
           <div class="note">
			<p>Update Job Posting below<p>
		   </div>
	<form action=updatejobdetails method="post">
	<div class="input-group form-group">
	    </div>
		<pre>
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>		
	
<b>Job Title:         </b><input class="form-control" type="text" name="jobTitle" value='<s:property value="jobTitle"/>'>

<b>Company Name:         </b><input class="form-control" type="text" name="companyName" value='<s:property value="companyName"/>'>
		
<b>Salary:  		</b><input class="form-control" type="text" name="salary" value='<s:property value="salary"/>'>

<b>Job Description:  </b><input class="form-control" type="text" name="jobDescription" value='<s:property value="jobDescription"/>'>
		
		<button class="btnSubmit" name="submitType" value="update" type="submit">Update Job Post</button>
		</pre>
	</form>

</div>
</div>
</body>
</html>
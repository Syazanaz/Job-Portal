<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
<title>Create Job Post</title>

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

</style>

<s:head />
</head>
<body>

<div class="container register-form">
     <div class="form">
           <div class="note">
              <p>Hi Administrators, create new job post by filling up the form below.</p>
           </div>
	<s:form action="createjob" method="post">
	
	                     <div class="input-group form-group">
	                     </div>
							<s:textfield cssClass="form-control" placeholder="Job Title *" value="" name="jobTitle" />
							
							<s:textfield cssClass="form-control"  placeholder="Company Name *" value="" name="companyName" />
							
							<s:textfield cssClass="form-control" placeholder="Salary *" value="" name="salary" />
						
							<s:textarea cssClass="form-control" placeholder="Job Description *" value="" name="jobDescription" />
							
						
						<s:submit name="submit" value="Submit" cssClass="btnSubmit" />
	
	</s:form>
	
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
   
    </div>
</div>

 <div>
    <a class="btnSubmit" role="button" href="JobManager.jsp">Back</a>
 </div>
</body>
</html>
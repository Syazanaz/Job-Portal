<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
<title>Register</title>

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
              <p>Register in the form below to create your account.</p>
           </div>
	<s:form action="registeruser" method="post">
	
	                     <div class="input-group form-group">
	                     </div>
							<s:textfield cssClass="form-control" placeholder="Your First Name *" value="" name="firstname" />
							
							<s:textfield cssClass="form-control"  placeholder="Your Last Name " value="" name="lastname" />
							
							
							<s:textfield cssClass="form-control" placeholder="Your Email *" value="" name="email" />
							
							
							<s:password cssClass="form-control" placeholder="Your Password *" value="" name="password" />
							
								
							<s:textfield cssClass="form-control" placeholder="Company Name *" value="" name="company_name" />
							
							
							<s:textfield cssClass="form-control" placeholder="City *" value="" name="city" />
							
							<s:textfield cssClass="form-control" placeholder="Country *" value="" name="country" />
							
						
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
</body>
</html>
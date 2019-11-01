<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
<title>Update</title>

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
			<p>Update your details below<p>
		   </div>
	<form action=updatedetails method="post">
	<div class="input-group form-group">
	    </div>
		<pre>
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>		
	
<b>First Name:         </b><input class="form-control" type="text" name="firstName" value='<s:property value="firstName"/>'>

<b>Last Name:         </b><input class="form-control" type="text" name="lastName" value='<s:property value="lastName"/>'>
		
<b>Email:        </b><input class="form-control" type="email"  name="email" value='<s:property value="email"/>'>
		            <input class="form-control" type="hidden" name="emailhidden" value='<s:property value="email"/>'>
		
<b>Company Name:  </b><input class="form-control" type="text" name="company_Name" value='<s:property value="company_Name"/>'>

<b>City:  </b><input class="form-control" type="text" name="city" value='<s:property value="city"/>'>

<b>Country:  </b><input class="form-control" type="text" name="country" value='<s:property value="country"/>'>
		
		<button class="btnSubmit" name="submitType" value="update" type="submit">Update</button>
		</pre>
	</form>

</div>
</div>
</body>
</html>
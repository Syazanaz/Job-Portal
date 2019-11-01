<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<style>
body{
		background-color: #25274d;
	}
	.contact{
		padding: 4%;
		height: 400px;
	}
	.col-md-3{
		background: #ff9b00;
		padding: 4%;
		border-top-left-radius: 0.5rem;
		border-bottom-left-radius: 0.5rem;
	}
	.contact-info{
		margin-top:10%;
	}
	.contact-info img{
		margin-bottom: 15%;
	}
	.contact-info h2{
		margin-bottom: 10%;
	}
	.col-md-9{
		background: #fff;
		padding: 3%;
		border-top-right-radius: 0.5rem;
		border-bottom-right-radius: 0.5rem;
	}
	.contact-form label{
		font-weight:600;
	}
	.contact-form button{
		background: #25274d;
		color: #fff;
		font-weight: 600;
		width: 25%;
	}
	.contact-form button:focus{
		box-shadow:none;
	}
</style>
<title>Struts2 - Send Email</title>
</head>
<body>

<div class="container contact">
	<div class="row">
		<div class="col-md-3">
			<div class="contact-info">
				<img src="https://image.ibb.co/kUASdV/contact-image.png" alt="image"/>
				<h2>Bulk Mailer</h2>
				<br>
				<h4>Hello Administrator!</h4>
				<h6>Use the form to send out bulk email. Use a comma(,) to separate email addresses to ensure the email is sent successfully.</h6>
			</div>
		</div>
		<div class="col-md-9">
			<div class="contact-form">		
				<s:if test="hasActionErrors()">
				<s:actionerror />
				</s:if>
				<s:if test="hasActionMessages()">
				<s:actionmessage />
				</s:if>
				<s:form action="sendEmail" method="post">
				
				<div class="form-group">
				<s:textfield cssClass="col-sm-10" label="To Address" name="emailToAddresses"></s:textfield>
				</div>
				
				<div class="form-group">
				<s:textfield cssClass="col-sm-10" label="Subject" name="emailSubject"></s:textfield>
				</div>
				
				<div class="form-group">
				<s:textarea cssClass="col-sm-10" label="Message" name="emailBodyText" rows="5" cols="50"></s:textarea>
				</div>
				
				<div class="form-group">        
				  <div class="col-sm-offset-2 col-sm-10">
					<s:submit cssClass="btn btn-default" value="Send Email"></s:submit>
				  </div>
				</div>
				</s:form>
			</div>	
		</div>
	</div>
</div>
</body>
</html>
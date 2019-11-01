<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Profile</title>

<style type="text/css">
.glyphicon-lg
{
    font-size:4em
}
.info-block
{
    border-right:5px solid #E6E6E6;margin-bottom:25px
}
.info-block .square-box
{
    width:100px;min-height:110px;margin-right:22px;text-align:center!important;background-color:#676767;padding:20px 0
}
.info-block.block-info
{
    border-color:#00008b
}
.info-block.block-info .square-box
{
    background-color:#20819e;color:#FFF
}

html,body{
background-color: #202092;
font-family: 'Numans', sans-serif;
}

.container
{
    height: 100%;
    text-align: left;
}

</style>		
	
</head>
<body>
<header>
<%@ include file= "header.jsp" %>
</header>

<body>

<div class="container">
<s:iterator value="persons">
  <div class="searchable-container" style="color:#ffffff;">
            <div class="items col-xs-12 col-sm-6 col-md-6 col-lg-6 clearfix">
               <div class="info-block block-info clearfix" style="background-color:rgba(0,0,0,0.5) !important;">
                    <div class="square-box pull-left">
                        <span style="color:#00008b;" class="glyphicon glyphicon-user glyphicon-lg"></span>
                    </div>
                    <h5>First Name :<s:property value="firstName" /></h5>
                    <h4>Last Name :<s:property value="lastName" /></h4>
                    <p>Company Name :<s:property value="company_Name" /></p>
                    <span>City: <s:property value="city" /></span>
                    <span>Country: <s:property value="country" /></span>
                </div>
            </div>
   </div>     
</s:iterator>
       
<p style="color:#e60000;"><b><s:property value="message"/></b></p>

<p><a href="home.jsp">Return Home</a></p>
</div>

<footer class="bg-dark">
<%@ include file= "footer.jsp" %>
</footer>
</body>

</html>
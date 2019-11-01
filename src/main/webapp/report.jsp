<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Report</title>
<style>
body, html {background-color: #262664}
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%; background-color: #ffffff}
th {height: 30px;}
.button-update {background-color: #FFC312;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
	<h2 style="color: white;">Administrator Report</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #FFC312;">
						<th>Sr.No.</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Password</th>
						<th>Company Name</th>
						<th>City</th>
						<th>Country</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="srNo" /></td>
						<td><s:property value="firstName" /></td>
						<td><s:property value="lastName" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="password" /></td>
						<td><s:property value="company_Name" /></td>
						<td><s:property value="city" /></td>
						<td><s:property value="country" /></td>
						<td>
							<a href="updatedetails.action?submitType=updatedata&email=<s:property value="email"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?email=<s:property value="email"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div>
</body>
</html>
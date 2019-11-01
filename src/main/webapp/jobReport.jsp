<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Job Posting Report</title>
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
	<h2 style="color: white;">Administrator Job Posting Report</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #FFC312;">
						<th>Job ID</th>
						<th>Job Title</th>
						<th>Company Name</th>
						<th>Salary</th>
						<th>Job Description</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="jobID" /></td>
						<td><s:property value="jobTitle" /></td>
						<td><s:property value="companyName" /></td>
						<td><s:property value="salary" /></td>
						<td><s:property value="jobDescription" /></td>
						<td>
							<a href="updatejobdetails.action?submitType=updatedata&jobID=<s:property value="jobID"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deletejobrecord.action?jobID=<s:property value="jobID"/>">
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
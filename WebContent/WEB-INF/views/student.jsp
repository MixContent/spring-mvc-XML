<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center" style="color: red;">
		<h1>Student Information</h1>
	</div>
	<form action="${pageContext.request.contextPath}/studentInfo.action"
		method="post">
		<table align="center">
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Student College</td>
				<td><input type="text" name="scollege"></td>
			</tr>
			<tr>
				<td>Student Phone Number</td>
				<td><input type="text" name="sphone"></td>
			</tr>
			<tr>
				<td>Student Email ID</td>
				<td><input type="text" name="semail"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit Info"></td>
			</tr>
		</table>
	</form>
</body>
</html>
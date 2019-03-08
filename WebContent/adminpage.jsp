<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>adminpage</title>
</head>
<style>
body {
	background-image: url("image/as.jfif");
	background-repeat: no-repeat;
	background-attachement: fixed;
	text-align: center;
	padding-top: 200px;
}

form {
	display: inline-block;
}
</style>
<body bgcolor="orange">
	<form method="post" action="AdminPageServlet">
		<table>
			<tbody>
				<tr>
					<td align="left"><b>AdminId</b></td>
					<td><input type="number" name="
"></td>
				</tr>
				<tr>
					<td align="left"><b>AdminName</b></td>
					<td><input type="text" name="adminName"></td>
				</tr>
				<tr>
					<td align="left"><b>AdminPhonenumber</b></td>
					<td><input type="number" name="adminPhoneno"></td>
				</tr>
				<tr>
					<td align="left"><b>StudentName</b></td>
					<td><input type="text" name="studentName"></td>
				</tr>
				<tr>
					<td align="left"><b>AttendenceStatus</b></td>
					<td><input type="text" name="attendenceStatus"></td>
				</tr>
				<tr>
					<td align="left"><b>Dates</b></td>
					<td><input type="date" name="dates"></td>
				</tr>
				<tr>
					<td>
						<Button type="Submit" name="submit">Register</Button>
					</td>
			</tbody>
		</table>
	</form>
</body>
</html>
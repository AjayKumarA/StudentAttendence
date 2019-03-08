<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Status</title>
</head>
<style>
body {
	background-image: url("image/ak.jpg");
	background-repeat: no-repeat;
	background-attachement: fixed;
	background-size: 1400px 700px;
}

.align {
	padding-left: 1200px;
}
</style>
<body bgcolor="orange">
	<form method="post" action="HomeServlet">
		<div class="align">
			<a href="login.html"><b>logout</b></a>
		</div>
		<table align="center" style="padding-top: 170px;">
			<thead>
				<tr>
					<th>Name</th>
					<th>Date</th>
					<th>AttendenceStatus</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="attendence" items="${STATUS}">
					<tr>
						<td>${attendence.studentName}</td>
						<td>${attendence.dates}</td>
						<td>${attendence.attendenceStatus}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>
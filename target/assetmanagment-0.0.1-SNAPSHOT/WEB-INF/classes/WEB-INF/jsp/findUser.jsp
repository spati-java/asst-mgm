<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="//WEB-INF/jsp/includes.jsp"%>
<%@include file="//WEB-INF/jsp/header.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
<link type="text/css" href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" href="css/welcome.css" rel="stylesheet">
<link type="text/css" href="css/form_style.css" rel="stylesheet">
</head>

<body>

	<h1 align="center">User Details</h1>

	<center>
		<table id="tableStyle">

			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>User Type</th>
				<th>Email</th>
				<th>Allocated Location</th>
				<th>Phone No</th>
				<th>Unique Name</th>
			</tr>


			<c:forEach items="${userDetails}" var="user">

				<tr>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.userType}</td>
					<td>${user.emailId}</td>
					<td>${user.locationName}</td>
					<td>${user.phoneNo}</td>
					<td>${user.userName}</td>

				</tr>

			</c:forEach>

		</table>
	</center>
</body>
</html>
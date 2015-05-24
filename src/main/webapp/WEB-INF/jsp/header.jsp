<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@include file="//WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" href="css/bootstrap.css" rel="stylesheet" >
<link type="text/css" href="css/welcome.css" rel="stylesheet" >
<link type="text/css" href="css/dropdown_menu_style_.css" rel="stylesheet" >
</head>
<body>
<div id="productHeaderId" class="productHeaderClass" >
<ul>
<li><a href="#" >User</a>
<ul>
<li>
<c:url value="addUser" var="userd" />
<a href="addUser">Add</a>
</li>
<li><a href="#" >Edit</a></li>
<li>
<c:url value="deleteUser" var="dltusr" />
<a href="deleteUser">Delete</a>
</li>
<li><a href="findUser" >Find All</a></li>
</ul>
</li>

<li><a href="#">Employee</a>
<ul>
<li><a href="#" >Add Employee</a></li>
<li><a href="#" >Edit Employee</a></li>
<li><a href="#" >Delete Employee</a></li>
</ul>
</li>
<li><a href="#">Department</a>
</li>
<li><a href="welcome">Location</a>
<ul>
<li>
<c:url value="addLocation" var="location" />
<a href="addLocation">Add</a>
	
</li>

<li><a href="#" >Edit</a></li>
<li><a href="#" >Delete</a></li>
<li><a href="findUser" >Find All</a></li>
</ul>

</li>
<li><a href="#">Asset</a>
</li>
<li><a href="#">Depreciation</a>
<ul>
<li><a href="#" >Straight Line</a></li>
<li><a href="#" >Double Declining</a></li>
<li><a href="#" >Sum of Years</a></li>
</ul>
</li>
<li><a href="addLogin">Logout</a>
</li>
</ul>
</div>
 <br><br><br>
</body>
</html>
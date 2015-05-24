<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="//WEB-INF/jsp/includes.jsp"%>
    <%@include file="//WEB-INF/jsp/header.jsp" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="css/bootstrap.css" rel="stylesheet" >
 <link type="text/css" href="css/welcome.css" rel="stylesheet" >
 <link type="text/css" href="css/form_style.css" rel="stylesheet" >
 </head>
<body>

<center>
<sf:form id="formPage" commandName="saveUser" action="/asst-mgm/save" name="userForm">
	<h1 >Add User Details</h1>
<div>
<label for="fname">
First Name:</label>
<sf:input path="firstName" />
<label for="lname">
Last Name:</label>
<sf:input  path="lastName" /><br>
</div>
<div>
<label for="emid">
Email Address:</label>
<sf:input  path="emailId" />
<label for="utype">
User Type:</label>
<sf:input  path="userType" /><br>
</div>
<div>
<label for="loName">
Location:</label>
<sf:input  path="locationName" />
<label for="pno">
Phone No:</label>
<sf:input  path="phoneNo" /><br>
</div>
<div>
<label for="uname">
User Name:</label>
<sf:input  path="userName" />
<label for="pwd">
Password:</label>
<sf:input  path="password" /><br>
</div>

<!--  <input type="submit" name="add" value="Add" />-->

<div>

<input type="submit" value="save" name="action" border="2" />
      </div>
      </sf:form>
     
      </center>
          
</body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="//WEB-INF/jsp/includes.jsp"%>
   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Details</title>
 <link type="text/css" href="css/bootstrap.css" rel="stylesheet" >
 <link type="text/css" href="css/welcome.css" rel="stylesheet" >
 <link type="text/css" href="css/login_form_style.css" rel="stylesheet" >
 </head>
<body>
<div class="header">
Welcome to Sourav's Web Application
<section id="content">  
<sf:form commandName="login" action="/asst-mgm/productPage" cssClass="well span10">
<h1>Login Form</h1>
<div>

<sf:input type="text" path="useerName" placeholder="type user name here" /><br>
</div>
<div>
<sf:input type="password" path="password" placeholder="type password here"/><br>
</div>
<!--  <input type="submit" name="add" value="Add" />-->
<div>
<input type="submit" value="Log in" />
<a href="#">Lost your password?</a>

</div>
</sf:form>
</section><!-- content -->
</div><br><br>
<script type="text/javascript" src="//WEB-INF/js/bootstrap.js"></script>
</body>
</html> 

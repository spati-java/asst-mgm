<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="//WEB-INF/jsp/includes.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserList</title>
<link type="text/css" href="css/bootstrap.css" rel="stylesheet" >
 <link type="text/css" href="css/welcome.css" rel="stylesheet" >
</head>
<body>
<b>Display USer details</b>
<sf:form commandName="userDetails">
<c:forEach items="${SEARCH_CONTACTS_RESULTS_KEY}" var="allUser">x
Login Details : ${SEARCH_CONTACTS_RESULTS_KEY}
</c:forEach>
</sf:form>
</body>
</html>
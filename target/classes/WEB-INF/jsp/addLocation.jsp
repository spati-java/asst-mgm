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
<sf:form id="formPage" commandName="savelocation" action="/assetmanagment/saveLocation" name="locationForm">
	<h1>Add Location Details</h1>
<div>
<label for="countryname">
Country Name:</label>
<sf:input path="countryName" />
<label for="cityname">
City Name:</label>
<sf:input  path="cityName" /><br>
</div>
<div>
<label for="srtname">
Street Name:</label>
<sf:input  path="streetName" />
<label for="location">
Location :</label>
<sf:input  path="locationName" /><br>
</div>
<div>
<label for="flno">
Floor:</label>
<sf:input  path="floorNo" />
<label for="rno">
Room No:</label>
<sf:input  path="roomNo" />
</div>
<div>
<label for="zip">
ZIP Code:</label>
<sf:input  path="zipCode" />
</div>

<div>

<input type="submit" value="save" name="action" border="2" />
      </div>
      </sf:form>
     
 </center>
          
</body>
</html>
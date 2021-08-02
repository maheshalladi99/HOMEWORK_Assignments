<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
<style type="text/css">  
.error{color:red}  
</style>  
</head>
<body>
<div align="center">
<form:form action="savestudent" modelAttribute="student" >
Id: <form:input path="id"/><br><br>
Fname: <form:input path="fname"/><br><br>
<form:errors path="fname" cssClass="error"/><br><br>
Lname: <form:input path="lname"/><br><br>
<form:errors path="lname" cssClass="error"/><br><br>
Age: <form:input path="age"/><br><br>
<form:errors path="age" cssClass="error"/><br><br>
City: <form:input path="city"/><br><br>
<form:errors path="city" cssClass="error"/><br><br>
<input type="submit" value="submit">
</form:form>
</div>
</body>
</html>
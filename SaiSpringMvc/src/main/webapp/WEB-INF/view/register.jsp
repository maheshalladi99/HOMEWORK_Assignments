<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hellfriends i am new jsp file

<div align="center">
<form:form action="saveDetail" modelAttribute="client" method="post">

name:<form:input path="name"/><br>
age:<form:input path="age"/><br>
city:<form:input path="city"/><br>
<input type="submit" value="register here">
</form:form>
</div>
</body>
</html>
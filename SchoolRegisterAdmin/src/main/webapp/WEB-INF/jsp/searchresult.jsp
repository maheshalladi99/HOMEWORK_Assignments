<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of students here</title>
<style type="text/css"></style>
</head>
<body>
<h2>Result of students in database</h2>

<table style="width:100%" border=1 text-align:center>
  <tr>
  	<th>Id</th>
    <th>Firstname</th>
    <th>Lastname</th> 
    <th>Age</th>
    <th>city</th>
    <th>Edit</th>
    <th>Del</th>
  </tr>
  <tr>
    <c:forEach var="student" items="${list}">   
   <tr>  
   <td>${student.id}</td>  
   <td>${student.fname}</td>  
   <td>${student.lname}</td>  
   <td>${student.age}</td>  
    <td>${student.city}</td> 
    <td><a href="editemp/${student.id}">EDIT</a></td>
    <td><a href="deletestu/${student.id}">delete</a></td>
   </tr>  
   </c:forEach> 
  </tr>
</table>
<a href="http://localhost:8084/SchoolRegisterAdmin/viewstudent">view students</a>
</body>
</html>
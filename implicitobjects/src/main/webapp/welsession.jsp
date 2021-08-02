<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

<% 
String uname=request.getParameter("uename"); 
out.print("Welcome "+ uname);
session.setAttribute("sessname",uname); 
%> 
<a href="welsession2.jsp">Check Output Page Here </a>
  
  
</body>
</html>
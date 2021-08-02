<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hai jsp project here</h1>
<%
int a=3;
int b=4;
int c=a+b;

%>
date today:<%=(new java.util.Date()).toLocaleString() %>


<jsp:forward page="test.jsp"/>
<jsp:param name="a" value="gesdvf"/>
</body>
</html>
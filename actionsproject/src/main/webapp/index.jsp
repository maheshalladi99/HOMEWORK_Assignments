<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<h1>demo bean</h1>
<jsp:useBean id="dem" class="actionsproject.demo"/>
<jsp:setProperty property="name" name="dem" value="mahesh"/>
<jsp:setProperty property="empno" name="dem" value="virtusa"/>
name:<jsp:getProperty property="name" name="dem"/>
company:<jsp:getProperty property="empno" name="dem"/>
</body>
</html>
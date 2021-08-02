<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>using jsp include</h1>
<i>this is action page</i>
name;<%= request.getParameter("name") %>
company;<%= request.getParameter("cls") %>
status;<%= request.getParameter("ok") %>
<!--<jsp:include page="hello.html" flush="false"></jsp:include>-->

</body>
</html>
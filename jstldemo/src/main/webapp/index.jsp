<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${ 'welcome to jstl learning INDEX'}"></c:out>
<c:import url="new.jsp"></c:import>
<c:set var="s" scope="session" value="${10*5}"/>
<c:out value="${s}"/>
<c:set var="name" scope="session" value="${10*5}"/>
    <p>Before I remove this:<c:out value="${name}"/>
    </p>
    <c:remove var="name"/>
    <p> After I remove this:<c:out value="${name}"/> </p>
    
<c:set var="s" scope="session" value="${10*5}"/>
<p>your marks:<c:out value="${s}"/></p> 
<c:choose>
	<c:when test="${s>=60}">
		<h1>first</h1>
	</c:when>
	<c:when test="${(s<60)&&(s>40)}">
		<h1>second</h1>
	</c:when>
	<c:otherwise>
		<h1>its okay bro lite</h1>
	</c:otherwise>
</c:choose>

<c:set var="s" scope="session" value="mahesh bro"/>

<c:if test="${(fn:contains(s,'m'))}">
<p>i found</p>

</c:if>


<c:set var="s" scope="session" value="156.3343"/>
<fmt:parseNumber var="d" type="number" value="${s}">
</fmt:parseNumber>

<p>amout<c:out value="${d} "></c:out></p>


<c:import var="reg" url="demo.xml"/>
<x:parse xml="${reg}" var="out"/>
<p>1st student name:<x:out select="$out/students/student[1]"/></p>



</body>
</html>
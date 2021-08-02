<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.jsp">
 <label> Username: </label>    
<input type="text" name="username" placeholder="username" size="15"required /> 
 <label> Password: </label>  
<input type="password" placeholder="Retype Password" name="psw-repeat" required>
<button type="submit" class="registerbtn">Login</button>
</form>
</body>
</html>
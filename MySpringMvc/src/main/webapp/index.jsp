<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  
</style>  
</head>  
<body>  
<form>  
  <div class="container">  
  <center>  <h1> Student Registeration Form index</h1> </center>  
  <hr>  
  <label> Firstname </label>   
<input type="text" name="fn" placeholder= "Firstname" size="15" required />   

<label> Lastname: </label>    
<input type="text" name="ln" placeholder="Lastname" size="15"required />   
 <label> username: </label>    
<input type="text" name="un" placeholder="username" size="15"required />
<label> password: </label>    
<input type="text" name="pw" placeholder="password" size="15"required />
<label> email: </label>    
<input type="text" name="email" placeholder="email" size="15"required />   
<label> phone: </label>    
<input type="text" name="phn" placeholder="phone" size="15"required />
<button type="submit" class="registerbtn">Register</button>
</form>  
</body>  
</html>  
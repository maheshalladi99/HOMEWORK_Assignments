package com.test;

import java.sql.*;  
public class Database{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/mamemployee","root","Mahesh@9966");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("SELECT * FROM emptable1	WHERE departnment='computer' and post='system engineer'");  
while(rs.next()){
    //Display values
    System.out.print("ID: " + rs.getInt("empno"));
    System.out.print(", NAME: " + rs.getString("empname"));
    System.out.print(", SALRY: " + rs.getString("salary"));
    System.out.print(", POST: " + rs.getString("post"));  
    System.out.print(", DESTINATION: " + rs.getString("destination"));
    System.out.println(", DEPT: " + rs.getString("departnment"));
   
 }
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  

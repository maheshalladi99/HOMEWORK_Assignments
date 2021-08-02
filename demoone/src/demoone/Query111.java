package demoone;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 

class Qurey111 {
    public static void main(String[] argv) throws SQLException {
        String dbURL="jdbc:mysql://localhost:3306/democollege";
        String username = "root";
        String password = "Mahesh@9966";
        try {
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            if(conn!=null) {
                System.out.print("Yooo we got connected!!!!!!!!");
               String sql="UPDATE users1 SET password=? fullname=? email=? WHERE user_id=?";
               
                PreparedStatement statement= conn.prepareStatement(sql);
            		   conn.close();
            } else {
                System.out.print("uff we did not got connected!!!!!!!!");
            }
            conn.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
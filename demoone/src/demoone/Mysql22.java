package demoone;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 

class Mysql22 {
    public static void main(String[] argv) throws SQLException {
        String dbURL="jdbc:mysql://localhost:3306/democollege";
        String username = "root";
        String password = "Mahesh@9966";
        try {
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            if(conn!=null) {
                System.out.print("Yooo we got connected!!!!!!!!");
                String sql = "SELECT * from users1";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);
                int count=0;
                while(result.next()) {
                    String name = result.getString(2);
                    String pass = result.getString(3);
                    String fullname = result.getString("fullname");
                    String email = result.getString("email");
                    String out = "User #%d:%s-%s-%s-%s";
                    System.out.println(String.format(out, ++count,name,pass,fullname,email));    
                }
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
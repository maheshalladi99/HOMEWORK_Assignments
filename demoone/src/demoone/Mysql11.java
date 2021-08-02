package demoone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Mysql11 {

	public static void main(String[] argv) throws SQLException {
        String dbURL="jdbc:mysql://localhost:3306/democollege";
        String username = "root";
        String password = "Mahesh@9966";
        try {
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            if(conn!=null) {
                System.out.print("Yooo we got connected!!!!!!!!");
                String sql = "INSERT INTO Users1(username,password,fullname,email) VALUES(?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, "bhavi--1");
                statement.setString(2, "b123--1");
                statement.setString(3, "joshi--1");
                statement.setString(4, "bhavi1@gmail--1.com");
                statement.setString(1, "bhavi--2");
                statement.setString(2, "b123--2");
                statement.setString(3, "joshi--2");
                statement.setString(4, "bhavi1@gmail--2.com");
                statement.setString(1, "bhavi--3");
                statement.setString(2, "b123--3");
                statement.setString(3, "joshi--3");
                statement.setString(4, "bhavi1@gmail--3.com");
              
                int rowsInserted =statement.executeUpdate();
                if(rowsInserted>0) {
                    System.out.print("inserted!!!!!!");
                }
                else {
                    System.out.print("ohhh nooooo!!!!");
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

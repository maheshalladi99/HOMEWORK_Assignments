package demoone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class EmployeeQ1 {

	public static void main(String[] argv) throws SQLException {
        String dbURL="jdbc:mysql://localhost:3306/democollege";
        String username = "root";
        String password = "Mahesh@9966";
        try {
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            if(conn!=null) {
                System.out.print("Yooo we got connected!!!!!!!!");
                Statement st=conn.createStatement();
                String s="update employee10 set empname='Navya' where fage='22'";
                st.executeUpdate(s);
                System.out.print("rows are updated!!!!!!!!");
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

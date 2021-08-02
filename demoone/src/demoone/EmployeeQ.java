package demoone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class EmployeeQ {

	public static void main(String[] argv) throws SQLException {
        String dbURL="jdbc:mysql://localhost:3306/democollege";
        String username = "root";
        String password = "Mahesh@9966";
        try {
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            if(conn!=null) {
                System.out.print("Yooo we got connected!!!!!!!!");
                Statement st=conn.createStatement();
                String s="insert into employee10 values(1,'Mahesh Alladi','Software Engineer','23','400000')";
                st.executeUpdate(s);
                String s1="insert into employee10 values(2,'Arjunudu Alladi','Software developer','26','4400000')";
                st.executeUpdate(s1);
                String s2="insert into employee10 values(3,'Mamatha Alladi','Software Engineer-2','28','500000')";
                st.executeUpdate(s2);
                String s3="insert into employee10 values(4,'janiki ratnam Alladi','Software Engineer-4','29','800000')";
                st.executeUpdate(s3);
                String s4="insert into employee10 values(5,'Nausch Alladi','Software Engineer-5','22','300000')";
                st.executeUpdate(s4);
                System.out.print("rows updated!!!!!!!!");
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

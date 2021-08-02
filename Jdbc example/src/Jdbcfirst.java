import java.sql.*;

public class Jdbcfirst {
	
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","Mahesh@9966");
	
	Statement st= con.createStatement();
	ResultSet rs=st.executeQuery("select * from users");
	
	while(rs.next()) {
	int a=rs.getInt("id");
	String b=rs.getString("name");
	String c=rs.getString("email");
	String d=rs.getString("country");
	System.out.println(a+" "+b+" "+c+" "+d+"\n");
	}
	st.close();
	con.close();
}
}

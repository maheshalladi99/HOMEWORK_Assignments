package Login;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Logincls  extends HttpServlet{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	 	
	 	String user=req.getParameter("username");
	 	String pass=req.getParameter("password");
	 	
	 	if(pass.equals(user)) {
	 		pw.println("success");
	 		pw.println("your user id is : "+user);
	 		pw.println("your password is : "+user);
	 		
	 	}
	 	else {
	 		pw.println("fail");
	 		pw.println("your user id is : "+user);
	 		pw.println("your password is : "+user);
	 		pw.println("mismatch");
	 		pw.close();
	 	}
	 	
		
	}
	
}

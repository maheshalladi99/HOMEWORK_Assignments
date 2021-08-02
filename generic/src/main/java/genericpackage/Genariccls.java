package genericpackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.GenericServlet;

public class Genariccls extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1> Generaric servlet</h1>");
		pw.print("<p>welcome you all</p>");
		pw.print("<body>");
		pw.print("</html>");
		}

}

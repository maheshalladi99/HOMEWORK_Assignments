package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Firsts extends HttpServlet{
	private String mes;
	public void init() throws ServletException{
		mes="hai this is my first servlet";
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		response.setContentType("test/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>"+mes+"</h1>");
		
		
	}
	public void destroy() { 
		
	}

}

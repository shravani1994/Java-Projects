package student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n1=request.getParameter("course1");
		String n2=request.getParameter("course2");
		String n3=request.getParameter("course3");
		out.println("You have successfully registered for the following courses:" + " "+ n1+" "+n2+" "+n3);
		out.println("Thank You!");
	}
	}
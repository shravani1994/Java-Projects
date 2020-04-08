package student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Signup extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//System.out.print(password);
		HttpSession sessionobject = request.getSession();
		sessionobject.setAttribute("password",password);
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request,response);
		}
	}
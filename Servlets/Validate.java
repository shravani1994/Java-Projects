package student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Validate extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		HttpSession session = request.getSession();
		String spass=(String) session.getAttribute("password");
		if (pass.equals(spass)) {
			RequestDispatcher rd = request.getRequestDispatcher("/index1.html");
			rd.include(request, response);
		}
		else {
			out.print("Sorry password incorrect");
			RequestDispatcher rd1 = request.getRequestDispatcher("/index.html");
			rd1.include(request, response);
		}
	}
}
package com.employee.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.web.dao.EmployeeDAO;
import com.employee.web.model.Employee;

/**
 * Servlet implementation class ControllerEmployee
 */
public class ControllerEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			if(request.getParameter("create")!=null){
		    response.setContentType("text/html");
		    System.out.println("The controller is invoked");
			Employee emp=new Employee();
			emp.setEmployeeName(request.getParameter("name"));
			emp.setEmployeeAge(Integer.parseInt(request.getParameter("age")));
			emp.setEmployeeCountry(request.getParameter("country"));
			emp.setEmployeeGender(request.getParameter("gender"));
			emp.setEmployeeAddress(request.getParameter("address"));
			EmployeeDAO dao=new EmployeeDAO();
			dao.createEmployee(emp);
			System.out.println("Inside Controller");
			RequestDispatcher rd=request.getRequestDispatcher("/createResult.jsp");
			rd.forward(request, response);
			
		}
			if(request.getParameter("search")!=null) {
				String searchname=request.getParameter("name");
				EmployeeDAO dao=new EmployeeDAO();
				ArrayList<Employee> emplist=dao.searchEmployee(searchname);
				request.setAttribute("emplist", emplist);
				RequestDispatcher rd=request.getRequestDispatcher("/createEmployeeList.jsp");
				rd.forward(request, response);
				
				
			}
	}
}

//}

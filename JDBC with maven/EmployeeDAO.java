package com.employee.web.dao;

import com.employee.web.model.Employee;
import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
		private Connection con=null;
		PreparedStatement pst=null;
		PreparedStatement seqps=null;
		ResultSet rs=null;
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		public void createEmployee(Employee employee) {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","shravani");
			pst=con.prepareStatement("insert into Employee Values(?,?,?,?,?)");
			System.out.println("Inside dao");
			pst.setString(1, employee.getEmployeeName());
			pst.setInt(2, employee.getEmployeeAge());
			pst.setString(3, employee.getEmployeeCountry());
			pst.setString(4, employee.getEmployeeAddress());
			pst.setString(5, employee.getEmployeeGender());
			pst.execute();
			}
			catch(Exception e){
				System.out.println(e);
			}
			finally {
				if(con!=null) {
					try {
						con.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
			}
			public ArrayList<Employee> searchEmployee(String name) {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","shravani");
			pst=con.prepareStatement("select * from Employee where Employee_name=?");
			pst.setString(1, name);
			ResultSet rs= pst.executeQuery();
			while(rs.next()) {
				String EmployeeName=rs.getString("Employee_name");
				int EmployeeAge=rs.getInt("Employee_age");
				String EmployeeCountry=rs.getString("Employee_country");
				String EmployeeAddress=rs.getString("Employee_address");
				String EmployeeGender=rs.getString("Employee_gender");
				Employee emp=new Employee();
				emp.setEmployeeName(EmployeeName);
				emp.setEmployeeAge(EmployeeAge);
				emp.setEmployeeCountry(EmployeeCountry);
				emp.setEmployeeAddress(EmployeeAddress);
				emp.setEmployeeGender(EmployeeGender);
				employeeList.add(emp);
			}
			}
			catch(Exception e){
				System.out.println(e);
			}
			finally {
				if(con!=null) {
					try {
						con.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
			return employeeList;
			}
}

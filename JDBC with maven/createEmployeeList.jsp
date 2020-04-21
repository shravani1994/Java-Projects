<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList,com.employee.web.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<Employee> emplist=(ArrayList<Employee>) request.getAttribute("emplist");
if(emplist.size()>0){
%>
<table border=1>
<tr>
<td>Name</td>
<td>Age</td>
<td>Country</td>
<td>Address</td>
<td>Gender</td>
</tr>
<%
for(Employee employee:emplist){
	%>
	<tr>
	<td><%=employee.getEmployeeName() %></td>
	<td><%=employee.getEmployeeAge() %></td>
	<td><%=employee.getEmployeeCountry() %></td>
	<td><%=employee.getEmployeeAddress() %></td>
	<td><%=employee.getEmployeeGender() %></td>
	</tr>
<%
}
%>
</table>
<%
}
else {
%>	
}
<table>
<tr>
<td>No employee matched with the given name.</td>
</tr>
</table>
<%
}
%>	
</body>
</html>
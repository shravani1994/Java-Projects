<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
	<% 	
		String n1=request.getParameter("course1");
		String n2=request.getParameter("course2");
		String n3=request.getParameter("course3");
		out.println("You have successfully registered for the following courses:" + " "+ n1+" "+n2+" "+n3);
		out.println("Thank You!");
	%>
</body>
</html>
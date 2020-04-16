<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign up</title>
</head>
<body>

		<% 
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession sessionobject = request.getSession();
		sessionobject.setAttribute("password",password);
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request,response);
		%>
</body>
</html>
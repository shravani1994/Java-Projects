<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate</title>
</head>
<body>
	<%	
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		//HttpSession session = request.getSession();
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
	%>
</body>
</html>
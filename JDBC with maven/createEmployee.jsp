<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name='createEmployeeForm' method='post' action='ControllerEmployee'>
<table class='tbl' border='1'>
<caption>Create an Employee</caption>
<tr>
<td>Name:</td>
<td><input type='text' name='name' id='name'></input></td>
</tr>
<tr>
<td>Age:</td>
<td><input type='text' name='age' id='age'></input></td>
</tr>
<tr>
<td>Country:</td>
<td><select name="country" style="width:100%"id="odc">
<option value="--Select--">--Select--</option>
<option value="India">India</option>
<option value="USA">USA</option>
<option value="UK">UK</option>
</select>
</td>
</tr>
<tr>
<td>Address:</td>
<td><textarea name='address' id='address'></textarea></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type='radio' name='gender' value='M'>Male</td>
<td><input type='radio' name='gender' value='F'>Female</td>
</tr>
</table>
<br></br>
<input type='submit' name='create' value='create'>
</form>
</body>
</html>
<%@page import="com.jsp.Dto.EmployeeDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<EmployeeDto> list = (List<EmployeeDto>) request.getAttribute("details");
	%>

	<table>
		<tr>
			<th>ID</th>
			<th>FIRSTNAME</th>
			<th>LASTNAME</th>
			<th>AGE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
		</tr>
		<%
		for (EmployeeDto employee : list) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getFirstName()%></td>
			<td><%=employee.getLastName()%></td>
			<td><%=employee.getAge()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getPassword()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
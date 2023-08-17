<%@page import="java.util.List"%>
<%@page import="com.jsp.service.EmployeeService"%>
<%@page import="com.jsp.dto.EmployeeEntity"%>
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
	List<EmployeeEntity> list = (List<EmployeeEntity>)  request.getAttribute("data");
	%>

	<table border="1px">
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>age</th>
		</tr>
		<%for (EmployeeEntity user : list) {%>
		<tr>
			<td><%=user.getId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getAge()%></td>
		</tr>
		<%}	%>
		
	</table><br><br>
	<a href="index.jsp">button<button>BACK</button></a>
</body>
</html>
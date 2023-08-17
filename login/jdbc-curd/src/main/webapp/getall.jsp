<%@page import="com.jsp.Dao.PersonDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getall">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
		</tr>
		<%
		while (PersonDao.rs1.next()) {
		%>
		<tr>
			<td><%=PersonDao.rs1.getInt(1)%></td>
			<td><%=PersonDao.rs1.getString(2)%></td>
			<td><%=PersonDao.rs1.getInt(3)%></td>
			<td><%=PersonDao.rs1.getString(4)%></td>
			<td><%=PersonDao.rs1.getString(5)%></td>
		</tr>
		<%
		}
		%>
		<input type="submit" value="GET ALL">


	</form>
</body>
</html>
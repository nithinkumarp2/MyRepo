<%@page import="com.jsp.Dto.user"%>
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
	List<user> list = (List<user>) request.getAttribute("add");
	%>

	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
		</tr>
		<%
		for(user u:list){
		%>
		<tr>
			<td><%=u.getId()%></td>
			<td><%=u.getName()%></td>
			<td><%=u.getAge()%></td>
		</tr>
		<%
		}
		%>

	</table>
	
	<a href="index.jsp"><button>BACK</button></a>
</body>
</html>
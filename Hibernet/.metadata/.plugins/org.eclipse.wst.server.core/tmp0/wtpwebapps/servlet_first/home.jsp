<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.jsp.demo.user"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
table {
	border-collapse: collapse;
}
td {
	color: blue;
}
</style>
</head>
<body>
	<%
	List<user> list = (List<user>) request.getAttribute("users");
	%>

	<table border="1px">
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>email</th>
			<th>password</th>
		</tr>
		<%for (user user : list) {%>
		<tr>
			<td><%=user.getId()%></td>
			<td><%=user.getName()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getPassword()%></td>
		</tr>
		<%}	%>


	</table>

	<h1>helooooooooo</h1>

</body>
</html>
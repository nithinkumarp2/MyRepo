<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>

		<tr>
			<th>id</th>
			<th>name</th>
			<th>age</th>
			<th>edit</th>
			<th>delete</th>
		</tr>
		<c:forEach var="student" items="${list}">
			<tr>
				<td>${student.getId()}</td>
				<td>${student.getName()}</td>
				<td>${student.getAge()}</td>
				<td><a href="editstudent?id=${student.getId() }">edit</a></td>
				<td><a href="deletestudent?id=${student.getId() }">delete</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>
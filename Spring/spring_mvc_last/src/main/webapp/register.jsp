<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="save" modelAttribute="stu1">
ID : <form:input path="id" />
NAME : <form:input path="name" />
AGE : <form:input path="age" />
		<form:button>register</form:button>
	</form:form>
</body>
</html>
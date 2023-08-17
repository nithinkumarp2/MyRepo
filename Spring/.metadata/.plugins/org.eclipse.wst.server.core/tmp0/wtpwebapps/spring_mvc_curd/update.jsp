<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="update"  modelAttribute="update">
<h1>ENTER <mark>ID</mark> TO UPDATE</h1>
ID : <form:input path="id" readonly="true"/>
<h1>ENTER UPDATED DATA</h1>
NAME : <form:input path="name"/>
AGE : <form:input path="age"/>

<form:button>UPDATE DATA</form:button>
</form:form>
</body>
</html>
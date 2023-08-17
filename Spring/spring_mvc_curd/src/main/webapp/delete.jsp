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
<form:form action="delete"  modelAttribute="">
<h1>ENTER <mark>ID</mark>DELETE</h1> <br> <br>
ID : <form:input path="id"/>

<form:button>DELETE DATA</form:button>
</form:form>
</body>
</html>
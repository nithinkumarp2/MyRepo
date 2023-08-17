<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ENTER SUDENT DATA</h1>
<form:form action="save"  modelAttribute="load">

ID : <form:input path="id"/><br> <br>
NAME : <form:input path="name"/><br><br>
AGE : <form:input path="age"/><br><br>

<form:button>SAVE</form:button>
</form:form>
</body>
</html>
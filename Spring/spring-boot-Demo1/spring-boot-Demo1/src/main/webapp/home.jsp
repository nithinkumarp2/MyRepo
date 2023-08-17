<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome ${name.id} ,${name.name } 

<form action="add">
<input type="text" name="id">
<input type="text" name="name">
<input type="submit">
</form>
</body>
</html>
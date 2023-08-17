<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update">
		<h1>
			ENTER
			<mark>ID</mark>
			TO UPDATE
		</h1>
		ID : <input type="text" name="id"><br>
		<br>
		<h1>
			ENTER UPDATED VALUES
			<mark>HERE</mark>
		</h1>
		NAME : <input type="text" name="name"><br>
		<br> AGE : <input type="text" name="age"><br>
		<br> EMAIL : <input type="text" name="email"><br>
		<br> PASSWORD: <input type="text" name="pass"><br>
		<br> <input type="submit" value="UPDATE DATA">
	</form>
</body>
</html>
<%@page import="com.jsp.web.model.employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyon">
    
    <%
    employee e1= (employee)request.getAttribute("nitin");
    
    out.println(e1);
    
    %>
    
</body>
</html>
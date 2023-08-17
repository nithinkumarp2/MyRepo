<%@page import="com.login.logindto"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.catalina.connector.Response"%>
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
	
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");// it works on http 1.1
	
	response.setHeader("pragma", "npcache");//http 1.0
	
	response.setHeader("expire", "0");//proxies
	
   
	
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
		}
	%>
	<h1>heloooooo</h1>
	Welcome $(username)
	<a href="video.jsp">click me</a>
	<form action="logout">
	<input type="submit" value="logout">
	</form>
	
	
	<%-- 	List<logindto> list=(List<logindto>)session.getAttribute("username");
	for(logindto dt: list){
		response.getWriter().println(list);
	} --%>
</body>
</html>
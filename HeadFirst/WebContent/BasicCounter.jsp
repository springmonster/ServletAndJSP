<%@page import="com.example.jsp.Counter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The page count is
	<%
	out.println(Counter.getCount());
%>
	<br> The page count is
	<%=Counter.getCount()%>
</body>
</html>
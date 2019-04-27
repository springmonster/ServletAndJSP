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
<% int count = 1; %>
	The page count is
	<%
	out.println(++count);
%>
</body>
</html>
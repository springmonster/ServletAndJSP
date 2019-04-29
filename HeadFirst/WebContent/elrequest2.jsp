<%@page import="com.example.jsp.Counter,com.example.el.Person"%>
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
		Person person = (Person)request.getAttribute("person");	
	%>
	Person is
	<%= person.getName() %>
</body>
</html>
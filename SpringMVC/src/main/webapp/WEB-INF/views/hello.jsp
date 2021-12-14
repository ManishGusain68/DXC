<%@page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>

	<%
		String str = (String) request.getAttribute("First");
		LocalDateTime time = (LocalDateTime) request.getAttribute("currentTime");
	%>

	<h1>
		My Name is
		<%=str%>

		time is
		<%=time %>
	</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
	<%
	int x = 5;
	for(int y = 1; y <= 9; y++)
	{
		%>
		<%= x %> x <%= y %> = <%= x * y %>
		<br>
		<%
	}
	%>
	</body>
</html>
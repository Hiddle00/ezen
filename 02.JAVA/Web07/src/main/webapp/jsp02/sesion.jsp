<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션 연습</title>
	</head>
	<body>
	<%
	String  name = (String)session.getAttribute("name");
	Integer age  = (Integer)session.getAttribute("age");
	%>
	name = <%= name %><br>
	age  = <%= age %><br>
	</body>
</html>

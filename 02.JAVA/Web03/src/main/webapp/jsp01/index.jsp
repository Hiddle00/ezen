<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name  = "홍길동";
int    age   = 19;
String color = "red";
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
	이름 : <%= name %>
	<br>
	<span style="color:<%= color %>">나이 : <%= age %>살</span>	
	</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<%
Person hong = new Person();
hong.name = "홍길동";
hong.age  = 16;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
		이름 : <%=hong.name%>
		<br>
		나이 : <%=hong.age %>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = "홍길동";
int    age  = 19;
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
	<%
	out.println("이름:" + name);
	%>
	<br>
	<%
	out.println("나이:" + age + "살");
	%>
	</body>
</html>



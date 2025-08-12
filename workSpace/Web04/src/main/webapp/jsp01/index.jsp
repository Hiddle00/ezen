<!-- 페이지 지시자(Directive) -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 자바영역(Scriptlet) -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
		여기는 index.jsp 페이지 입니다.
		<br>
		<!-- 페이지 지시자(Directive) -->
		<%@ include file="sub.jsp" %>
		<!-- 표현언어(Expression) -->
	</body>
</html>
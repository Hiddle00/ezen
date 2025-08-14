<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//쿠키의 값은 영문자,숫자 이외에는 사용 불가
Cookie cookieA = new Cookie("name","HoonGilDong");
Cookie cookieB = new Cookie("age","18");

cookieA.setMaxAge(7 * 24 * 60 * 60); //초단위

response.addCookie(cookieA);
response.addCookie(cookieB);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 연습</title>
	</head>
	<body>
		쿠키값이 저장되었습니다.
		<br>
		<a href="cookie.jsp">쿠키보기</a>
	</body>
</html>
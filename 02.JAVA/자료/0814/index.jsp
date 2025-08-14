<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<%
//로그인 객체를 생성한다.
LoginVO login = new LoginVO();
login.setUserID("ezen");
login.setUserName("홍길동");
login.setAge(18);
login.setUserTel("010-1234-5678");
login.setGender("남자");

//로그인 객체를 세션에 저장한다.
session.setAttribute("login",login);
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션을 이용한 로그인 연습</title>
	</head>
	<body>
	로그인이 완료되었습니다.
	<br>
	<a href="info.jsp">정보조회</a>	
	</body>
</html>
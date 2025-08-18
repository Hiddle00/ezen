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
	String name = "홍길동";
	int    age  = 18;
	//웹 서버 메모리에 데이터를 저장(세션-session)
	session.setAttribute("name", name);
	session.setAttribute("age", age);
	%>		
	<a href="sesion.jsp">세션보기</a>			
	</body>
</html>
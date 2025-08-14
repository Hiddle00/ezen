<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 연습</title>
	</head>
	<body>
		<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i = 0; i <= cookies.length; i++){
			out.print(cookies[i].getName());
			out.println("=");
			out.println(cookies[i].getValue());
			out.println("<br>");
			}
		}
		%>
	</body>
</html>
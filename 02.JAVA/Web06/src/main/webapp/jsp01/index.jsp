<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
	request 객체 연습 <br>
	접속한 컴퓨터 IP : <%= request.getRemoteAddr() %>
	<br>
	요청한 x 데이터의 값 : <%= request.getParameter("x") %>
	<br>
	요청한 y 데이터의 값 : <%= request.getParameter("y") %>
	<br>
	<a href="index.jsp?x=aaa">X값 보내기</a>
	<br>
	<a href="index.jsp?y=bbb">Y값 보내기</a>
	<br>
	<a href="index.jsp?x=aaa&y=bbb">XY값 보내기</a>
	<br>		
	<form method="get" action="index.jsp">
		이름 : <input type="text" name="x" size="4">
		<br>
		성별 : 
		<select name="y">
			<option value="man">남자</option>
			<option value="woman">여자</option>
		</select>	
		<input type="submit" value="전송하기">
	</form>	
	</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>    
<%
LoginVO info = (LoginVO)session.getAttribute("login");
out.println(info);
if(info == null)
{
	response.sendRedirect("index.jsp");
	return;
}
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션을 이용한 로그인 연습</title>
	</head>
	<body>
	아이디 : <%= info.getUserID() %><br>
	성명 : <%= info.getUserName() %><br>
	나이 : <%= info.getAge() %><br>
	전화번호 : <%= info.getUserTel() %><br>
	성별 : <%= info.getGender() %>
	</body>
</html>
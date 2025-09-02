<%@page import="user.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");
	String value  = (String)session.getAttribute("key");
	String value2 = (String)request.getAttribute("key");
	
	UserVO user   = (UserVO)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>home 화면 입니다.</div>
	<div>user세션 정보 : </div>
	<div><%= user.getAge() %></div>
	<div>${user.age }</div>
	<div><%= user.getHeight() %></div>
	<div>${user.height}</div>
	<div><%= user.getN() %></div>
	<div>${user.n}</div>
	<!-- 필드 이름이 아니라 메서드명을 변환한것 -->
	
	<div>세션에서 꺼낸 값 : <%= value %></div>
	<div>세션에서 꺼낸 값(el) : ${sessionScope.key} </div>
	<div>요청에서 꺼낸 값 : <%= value2 %></div>
	<div>요청에서 꺼낸 값(el) : ${requestScope.key}</div>
	
	<div>${key}</div>
</body>
</html>
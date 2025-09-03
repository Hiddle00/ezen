<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty user}">
			<div>환영합니다. ${user.nick}님</div>
			<div>mypage</div>
			<div>logout</div>
		</c:when>
		<c:otherwise>
			<a href="<c:url value="/login" />">login</a>
		</c:otherwise>
	</c:choose>
	<!-- 
		로그인 안했을 때
		로그인 링크
		
		로그인 했을 때
		마이페이지
		로그아웃 링크 
	-->
</body>
</html>
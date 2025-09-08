<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자료 목록 조회</title>
	</head>
	<body>
		<c:forEach var="vo" items="${ list }">
				번호 : ${ vo.no }<br>
				제목 : ${ vo.title }<br>			
		</c:forEach>
	</body>
</html>
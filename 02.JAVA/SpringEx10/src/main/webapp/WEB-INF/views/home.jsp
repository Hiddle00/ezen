<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
번호:${vo.no}
<br>
제목:${vo.title}
<br>
<a href="list.do">목록 보기</a>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
 <%-- HomeController에서 실행해줄 메소드와 변수가 없어 불러오지 못함 --%>
<P>  The time on the server is ${serverTime}. </P>

번호 : ${vo.no}<br>
제목 : ${vo.title} <%-- vo값이 아니라 getter를 실행하는것 유의 --%>
</body>
</html>

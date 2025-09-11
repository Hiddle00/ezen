<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 결과</title>
</head>
<body>
	원본 파일명 : ${filename}<br>
	저장 파일명 : ${savename}<br>
	<a href="down.do?name=${filename}&file=${savename}">다운로드</a><br>
	
	<c:forEach var="item" items="${list}">
		원본 파일명 : ${item.filename}<br>
		저장 파일명 : ${item.savename}<br>
		<a href="down.do?name=${item.filename}&file=${item.savename}">다운로드</a><br>
	</c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자료입력</title>
	</head>
	<body>
	<form id="person" name="person" method="post" action="person.do">
		이름 : <input type="text" id="name" name="name" value="홍길동">
		<br>
		나이 : <input type="number" id="age" name="age" value="20">
		<br>
		직업 : <input type="text" id="job" name="job" value="도둑">		
		<input type="submit" value="전송하기">
	</form>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자료출력</title>
	</head>
	<body>
	이름 : ${ hong.name }<br>
	나이 : ${ hong.age }<br>
	직업 : ${ hong.job }<br>
	</body>
</html>
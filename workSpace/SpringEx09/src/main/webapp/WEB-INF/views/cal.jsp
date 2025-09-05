<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>초간단 계산기</title>
	</head>
	<body>
		<style>
			input[type="number"]{
				width: 100px;
				text-align: right;
			}
			input[type="number"]:focus{
				background-color: yellow;
			}
		</style>
		<form method="post" action="cal.do">
			<input type="number" name="x" value=${x}>
			+
			<input type="number" name="y" value=${y}>
			<input type="submit" value="=">
			<input type="number" name="z" value=${z} readonly>
		</form>
	</body>
</html>
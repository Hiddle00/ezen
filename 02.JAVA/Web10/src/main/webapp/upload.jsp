<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>첨부파일 업로드 예제</title>
	</head>
	<body>
	<form action="uploadok.jsp" method="post" enctype="multipart/form-data">
		제목 : <input type="text" name="title">
		<br>
		첨부파일 : <input type="file" name="attach">
		<br>
		<input type="submit" value="전송하기">
	</form>
	</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첨부파일 업로드</title>
</head>
<body>
	<!-- 파일 업로드에서는 enctype(인코딩타입)을 multipart/form-data로 반드시 설정 -->
	<form action="uploadOK.do" method="post" enctype="multipart/form-data">
		파일 선택 : <input type="file" name="file"> 
		<input type="submit" value="전송">
	</form>	
	
	
	<br><br><br>
	<!-- 첨부파일 2개 이상 업로드 -->
	<form action="uploadMulti.do" method="post" enctype="multipart/form-data">
		파일 선택 : <input type="file" multiple="multiple" name="files"> 
		<input type="submit" value="전송">
	</form>	
</body>
</html>
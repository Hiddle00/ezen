<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>예제 페이지</title>
	</head>
	<body>
		<table border="1" style="width:500px" align="center">
			<tr>
				<td colspan="2" style="text-align:center">
					<a href="index.jsp">나의 자바 프로그래밍 갤러리</a>
				</td>
			</tr>
			<tr>
				<td style="width:150px;">
					<!-- {{ 왼쪽 메뉴 시작 -------------------- -->
					<%@ include file="menu.jsp" %>
					<!-- }} 왼쪽 메뉴 종료 -------------------- -->
				</td>
				<td valign="">
					<!-- {{ 컨텐츠 영역 시작 ------------------- -->
					메인 대한 컨텐츠입니다.
					<br>
					메인 대한 컨텐츠입니다.
					<br>
					메인 대한 컨텐츠입니다.
					<br>										
					<!-- }} 컨텐츠 영역 종료 ------------------- -->
				</td>
			</tr>
		</table>	
	</body>
</html>	
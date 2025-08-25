<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 변경</title>
	</head>
	<body>
		<form name="insertForm" method="post" action="updateok.jsp">
		<table border="0" width="600px" align="center">
			<tr>
				<td align="center">
				메모 변경
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th width="100px">제목</th>
							<td><input style="width:98%" type="text" name="title" value="제목입니다."></td>
						</tr>
						<tr>
							<th>날짜</th>
							<td>2024.01.01</td>
						</tr>						
						<tr>
							<th>내용</th>
							<td>
							<textarea style="width:98%;height:300px;">내용입니다.
내용입니다.
내용입니다.</textarea>
							</td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<input type="submit" value="변경완료">
				&nbsp;
				<a href="view.jsp">취소</a>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 목록</title>
	</head>
	<body>
		<table border="0" width="600px" align="center">
			<tr>
				<td align="right" style="height:30px;"><a href="insert.jsp">등록하기</a></td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th style="width:100px;">번호</th>
							<th>제목</th>
							<th style="width:100px;">날짜</th>
						</tr>
						<%
						for(int i=1; i <= 10; i++)
						{
							%>
							<tr>
								<td style="text-align:center;"><%= i %></td>
								<td><a href="view.jsp">제목입니다.</a></td>
								<td align="center">2024.01.01</td>
							</tr>
							<%
						}
						%>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
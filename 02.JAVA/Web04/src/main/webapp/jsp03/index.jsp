<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
		<table border="1" style="width:500px" align="center">
			<tr>
				<th>번호</th>
				<th>제목</th>
			</tr>
			<%
			//홀수번째 행은 배경색을 #fffff0 로 칠하시오.	
			//짝수번째 행만 배경색을 #f4f4f4 로 칠하시오.					
			for(int i = 1 ; i <= 10; i++)
			{
				String color = "#fffff0";
				if( i % 2 == 0)
				{
					color = "#f4f4f4";	
				}
				%>
				<tr style="background-color:<%= color %>;">
					<td align="center"><%= i %></td>
					<td><%= i %>번째 제목입니다.</td>
				</tr>
				<%
			}
			%>			
		</table>
	</body>
</html>
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
			for(int i = 1; i <= 10; i++)
			{
				String color = "#f4f4f4";
				if(i % 2 == 0)
				{
					color = "#fffff0";
				}
				%>	
				<tr style="background-color:<%=color%>">
					<td align="center"><%=i %></td>
					<td><%=i %>번째 제목입니다.</td>
				</tr>
				<%
			}
			%>
		</table>
	</body>
</html>
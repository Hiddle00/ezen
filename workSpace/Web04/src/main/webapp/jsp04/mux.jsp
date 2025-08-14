<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 구구단 연습</title>
	</head>
	<body>
		<table border="1px solid black">
			<tr>
			<%
				for(int x = 1; x <= 9; x++)
				{
					%><td><%
					if(x == 1) {
					%></td><%	
						continue;
					}
					%><%= x %> 단</td>
					<%
					for(int y = 1; y <=9; y++)
					{
						%><tr>
						</tr>
					}
					
			}%>
			</tr>
		</table>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int x = 2;
	int y = 1;
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		td
		{
			width: 50px;
			text-align: center;
			background-color: #f4f4f4;
		}
		th.dan
		{
			background-color: yellow;
		}
		</style>
	</head>
	<body>
		<%
		for(x = 2; x <= 9; x++)
		{
		%>	
		<table border="1" align="center">
			<tr>
				<th class="dan" colspan="5"><%=x %>단</th>
			</tr>
			<%
			for(y = 1; y <= 9; y++)
			{
				%>
				<tr>
					<td><%=x%></td>
					<td>x</td>
					<td><%=y%></td>
					<td>=</td>
					<td class=""><%=(x*y)%></td>
				</tr>
				<%
			}
			%>
		<br>
		<%
		}
		%>
		</table>
	</body>
</html>
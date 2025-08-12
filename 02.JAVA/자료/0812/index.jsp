<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
		<style>
		td
		{
			width: 50px;
			text-align: center;
			background-color: #f4f4f4;
		}
		
		td.dan
		{
			background-color: yellow;
		}
		</style>
	</head>
	<body>
		<table border="1" align="center">
			<% 
			for(int x = 2; x <= 9; x++)
			{
				%>
				<tr>
					<td class="dan" colspan="5"><%= x %>단</td>
				</tr>
				<%				
				for(int y = 1; y <= 9; y++)
				{
					%>
					<tr>
						<td><%= x %></td>
						<td>x</td>
						<td><%= y %></td>
						<td>=</td>
						<td><%= x * y %></td>
					</tr>
					<%				
				}
			}
			%>
		</table>
		<br>	
		<table border="1" align="center">
			<tr>
				<td></td>
				<%
				for(int i=2;i<=9;i++)
				{ 
					%>
					<td><%=i %> 단</td>
					<%
				}
				%>			
			</tr>
			<%
			for(int i=1;i<=9;i++)
			{
				%>
				<tr>
				<td><%=i %></td>
				<%
				for(int j=2;j<=9;j++)
				{
					%>
					<td>
					<%=j%>*<%=i%>=<%=i*j %>
					<%
				}
			} 
			%>
			</td>
			</tr>		
		</table>
		<br><br><br>		
	</body>
</html>
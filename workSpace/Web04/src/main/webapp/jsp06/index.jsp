<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP 연습</title>
	</head>
	<body>
		<%
		String x ="1,000";
		String y ="2,000";
		int z = Calculater.DoCal(x, y, "+");
		out.println(z);
		%><br>
		2 + 4  = <%= Calculater.DoCal( "2", "4", "+") %><br>
		6 - 2  = <%= Calculater.DoCal( "6", "2", "-") %><br>
		8 * 6  = <%= Calculater.DoCal( "8", "6", "*") %><br>
		10 / 2 = <%= Calculater.DoCal("10", "2", "/") %><br>
		
		<%
		x  = "100";
		y  = "200";
		String op = "*";
		%>
		<!-- 100 * 200 = 20000<br> -->
		<%= x %> <%= op %> <%= y %> = <%= Calculater.DoCal(x, y, op) %><br>
		
		<%
		String[] data = { "200", "20", "/" };
		%>
		<%= data[0] %> <%= data[2] %> <%= data[1] %> = 
		<%= Calculater.DoCal(data[0], data[1], data[2]) %><br>
		
		
		<%
		x  = request.getParameter("x");
		y  = request.getParameter("y");
		op = request.getParameter("op");
		%>
		<%= x %> <%= op %> <%= y %> = <%= Calculater.DoCal(x, y, op) %><br>
	</body>
</html>
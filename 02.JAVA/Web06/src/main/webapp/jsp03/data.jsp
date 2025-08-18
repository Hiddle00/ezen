<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String x = request.getParameter("x");
String y = request.getParameter("y");
int ix = 0,iy = 0, iz = 0;
try
{
	ix = Integer.parseInt(x);
	iy = Integer.parseInt(y);
	iz = ix + iy;
}catch(Exception e){}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>미니 계산기</title>
	</head>
	<body>
	<%= ix %> + <%= iy %> = <%= iz %>
	</body>
</html>
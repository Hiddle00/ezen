<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String x  = request.getParameter("x");
String y  = request.getParameter("y");
String op = request.getParameter("op");
if(op == null) op = "+";
int ix = 0,iy = 0, iz = 0;
try
{
	ix = Integer.parseInt(x);
	iy = Integer.parseInt(y);
	if(op.equals("+"))	iz = ix + iy;
	if(op.equals("-"))	iz = ix - iy;
	if(op.equals("*"))	iz = ix * iy;
	if(op.equals("/"))	iz = ix / iy;	
}catch(Exception e){}
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>미니 계산기</title>
	</head>
	<body>
		<%= ix %> <%= op %> <%= iy %> = <%= iz %> 
	</body>
</html>
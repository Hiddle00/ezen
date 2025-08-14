<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String  x = request.getParameter("x");
String  y = request.getParameter("y");
String op = request.getParameter("op");
if(x == null || y == null || x.equals("") || y.equals(""))
{
	response.sendRedirect("index.jsp");
	return;
}
if(op == null) op = "+";
int ix = 0, iy = 0, iz = 0;
try{
	ix = Integer.parseInt(x);
	iy = Integer.parseInt(y);
	switch(op){
	case "+":
		iz = ix + iy;
		break;
	case "-":
		iz = ix - iy;
		break;
	case "*":
		iz = ix * iy;
		break;
	case "/":
		if(iy != 0) iz = ix / iy;
		break;
	}
}catch(Exception e){}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%= x %> <%= op %> <%= y %> = <%= iz %>
	</body>
</html>
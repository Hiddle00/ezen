<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	if(x == null || y == null || x.equals("") || y.equals(""))
	{
		response.sendRedirect("index.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>미니 계산기</title>
	</head>
	<body>
	<%
	try{ %>
		<%= x %> + <%= y %> = 
		<%= Integer.parseInt(x) + Integer.parseInt(y) %>
		<%
		}catch(Exception e){
			out.println("잘못된 입력입니다.");
		}%>
	</body>
</html>
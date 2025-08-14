<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String x  = request.getParameter("x");
String y  = request.getParameter("y");
String op = request.getParameter("op");
int    iz = 0;
if( x == null)  x = "0";
if( y == null)  y = "0";
if(op == null) op = "+";
try{
	int ix = Integer.parseInt(x);
	int iy = Integer.parseInt(y);
	if(op.equals("+")) iz = ix + iy;
	if(op.equals("-")) iz = ix - iy;
	if(op.equals("*")) iz = ix * iy;
	if(op.equals("/")) iz = ix / iy;
}catch(Exception e){}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>미니 계산기</title>
	</head>
	<body>
		<form method="get" action="index.jsp">
			<input type="text" name="x" size="4" value="<%= x %>">
			<select name="op">
				<option value="+" <%= op.equals("+") ? "selected" : "" %>>+</option>
				<option value="-" <%= op.equals("-") ? "selected" : "" %>>-</option>
				<option value="*" <%= op.equals("*") ? "selected" : "" %>>*</option>
				<option value="/" <%= op.equals("/") ? "selected" : "" %>>/</option>
			</select>
			<input type="text" name="y" size="4" value="<%= y %>">
			<input type="submit" value="=">
			<input type="text" name="z" size="4" value="<%= iz %>" readonly>
		</form>
	</body>
</html>
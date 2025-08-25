<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>    
<%
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("list.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();

String sql;
sql  = "delete from memo ";
sql += "where no =" + no;
db.RunSQL(sql);

db.DBClose();

response.sendRedirect("list.jsp");
%>    

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
request.setCharacterEncoding("utf-8");

//1. no, rnote를 받는다.
String no    = request.getParameter("no");
String rnote = request.getParameter("rnote");
if( no == null || rnote == null )
{
	response.sendRedirect("index.jsp");
	return;
}

//2. DBOpen한다.
DBManager db = new DBManager();
db.DBOpen();

//3. insert를 실행한다.
String sql = "";
sql += "insert into reply (no,userid,rnote) ";
sql += "values ('" + no + "',";
sql += "'" + login.getUserid() + "',";
sql += "'" + db._R(rnote) + "'";
sql += ") ";
db.RunSQL(sql);

//4. DBClose한다.
db.DBClose();


response.sendRedirect("view.jsp?no=" + no);
%>
<%@ include file="./include/tail.jsp" %>
